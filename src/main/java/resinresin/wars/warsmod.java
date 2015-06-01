package resinresin.wars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import resinresin.wars.WorldGen.BiomeGenExtremeBattlefield;
import resinresin.wars.WorldGen.BiomeGenWasteland;
import resinresin.wars.WorldGen.WarsWorldGenerator;
import resinresin.wars.command.CommandBlueBase;
import resinresin.wars.command.CommandChaosSpawn;
import resinresin.wars.command.CommandEditMode;
import resinresin.wars.command.CommandGreenBase;
import resinresin.wars.command.CommandKillstreak;
import resinresin.wars.command.CommandRedBase;
import resinresin.wars.command.CommandTotalKills;
import resinresin.wars.command.CommandYellowBase;
import resinresin.wars.entities.EntityPTNTPrimed;
import resinresin.wars.handlers.GuiHandler;
import resinresin.wars.handlers.WarsEventHandler;
import resinresin.wars.registry.CraftingRecipes;
import resinresin.wars.registry.WarsBlocks;
import resinresin.wars.registry.WarsDungeonChests;
import resinresin.wars.registry.WarsItems;
import resinresin.wars.registry.WarsTileEntities;
import resinresin.wars.tabs.WarsBlocksTab;
import resinresin.wars.tabs.WarsClassesTab;
import resinresin.wars.tabs.WarsItemsTab;

@Mod(modid = "warsmod", name = "Wars Mod", version = "6.3")
public class warsmod {

	//@SidedProxy(clientSide = "resinresin.wars.client.ClientProxy", serverSide = "resinresin.wars.CommonProxy")
	public static CommonProxy proxy;

	//@Instance("warsmod")
	public static warsmod instance;
	public static Configuration conf;
	@SuppressWarnings("rawtypes")
	public static List donators;
	public static CreativeTabs tabWarsBlocks = new WarsBlocksTab(CreativeTabs.getNextID(), "tabWarsItems");
	public static CreativeTabs tabWarsItems = new WarsItemsTab(CreativeTabs.getNextID(), "tabWarsBlocks");
	public static CreativeTabs tabWarsClasses = new WarsClassesTab(CreativeTabs.getNextID(), "tabWarsClasses");
	public boolean doBiomes;
	public static boolean doSand;

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		ModMetadata metadata = evt.getModMetadata();
		metadata.autogenerated = false;
		metadata.authorList = Arrays.asList("Resinresin");
		metadata.description = "The wars mod adds hundreds of epic structures :P";
	    metadata.logoFile = "https://dl.dropboxusercontent.com/u/104023161/Questology%20banner%202.png";
		metadata.updateUrl = "https://dl.dropboxusercontent.com/u/104023161/WarsModUpdates.txt";
	    conf = new Configuration(evt.getSuggestedConfigurationFile());
		conf.load();

		doBiomes = conf.get(Configuration.CATEGORY_GENERAL, "Generate Biomes", true).getBoolean(true);
		doSand = conf.get(Configuration.CATEGORY_GENERAL, "Generate Sink Sand", true).getBoolean(true);

		
		donators = new ArrayList<String>();
		try {
			URL targetURL = new URL("https://dl.dropbox.com/u/104023161/Donators.txt");
			InputStream in = targetURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String dona;
			while ((dona = reader.readLine()) != null) {
				dona = dona.trim();
				donators.add(dona);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		proxy.capesInit();

	}

	public static WarsWorldGenerator worldGen;
	public static BiomeGenBase waste;
	public static BiomeGenBase EXbattlefield;

	@EventHandler
	public void InitiateModWars(FMLInitializationEvent initEvent) {
		
		WarsBlocks.createBlocks();
		WarsItems.createItems();
		CraftingRecipes.registerRecipes();
		WarsDungeonChests.doDungeonChestHooks();
		WarsTileEntities.createTileEntities();

		WarsEventHandler handler = new WarsEventHandler();
		MinecraftForge.EVENT_BUS.register(handler);
		MinecraftForge.EVENT_BUS.register(this);


		GameRegistry.registerWorldGenerator(new WarsWorldGenerator(), 0);
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
		TickRegistry.registerTickHandler(new ServerTickHandler(EnumSet.of(TickType.SERVER)), Side.SERVER);

		worldGen = new WarsWorldGenerator();
		if (doBiomes == true) {
			waste = (new BiomeGenWasteland(25));
			EXbattlefield = (new BiomeGenExtremeBattlefield(26));

			GameRegistry.addBiome(waste);
			GameRegistry.addBiome(EXbattlefield);
		}

		int entityIdPTNT = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityPTNTPrimed.class, "PTNTPrimed", entityIdPTNT);
		EntityRegistry.registerModEntity(EntityPTNTPrimed.class, "PTNTPrimed", entityIdPTNT, warsmod.instance, 16, 1, false);

		proxy.registerRenderInformation();
		conf.save();
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {

		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();

		ServerCommandManager serverCommand = ((ServerCommandManager) command);

		serverCommand.registerCommand(new CommandKillstreak());
		serverCommand.registerCommand(new CommandTotalKills());
		serverCommand.registerCommand(new CommandRedBase());
		serverCommand.registerCommand(new CommandGreenBase());
		serverCommand.registerCommand(new CommandBlueBase());
	    serverCommand.registerCommand(new CommandYellowBase());
		serverCommand.registerCommand(new CommandChaosSpawn());
		serverCommand.registerCommand(new CommandEditMode());
	}
	
	
	public static void generateBlock(World par1World, int i, int j, int k, Block block) {
		
		
		BlockPos position = new BlockPos(i, j, k);
		par1World.setBlockState(position, block.getDefaultState());
		
	}

	@SubscribeEvent
	public void onLivingAttack(LivingAttackEvent evt) {
		if (evt.entity instanceof EntityPlayer && evt.source instanceof EntityDamageSource) {
			EntityDamageSource source = (EntityDamageSource) evt.source;
			if (source.getEntity() instanceof EntityPlayer) {
				EntityPlayer attacker = (EntityPlayer) source.getEntity();
				EntityPlayer damagee = (EntityPlayer) evt.entity;

				ItemStack attackerBoots = attacker.inventory.armorItemInSlot(0);
				ItemStack damageeBoots = damagee.inventory.armorItemInSlot(0);
				if (attackerBoots != null && damageeBoots != null && attackerBoots.itemID == damageeBoots.itemID) {
					int id = damageeBoots.itemID;
					if (id == WarsItems.redBoots.itemID || id == WarsItems.greenBoots.itemID || id == WarsItems.blueBoots.itemID || id == WarsItems.yellowBoots.itemID) {
						evt.setCanceled(true);

					}

				}
			}
		}
	}
	
	

}
