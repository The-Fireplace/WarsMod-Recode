package resinresin.wars.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import resinresin.wars.WarsMod;
import resinresin.wars.Items.ItemAdminWandBall;
import resinresin.wars.Items.ItemAdminWandLava;
import resinresin.wars.Items.ItemAdminWandLight;
import resinresin.wars.Items.ItemAdminWandStone;
import resinresin.wars.Items.ItemAdminWandTNT;
import resinresin.wars.Items.ItemAdminWandWater;
import resinresin.wars.Items.ItemAdminWandWeb;
import resinresin.wars.Items.ItemAncientEmblem;
import resinresin.wars.Items.ItemAncientGem;
import resinresin.wars.Items.ItemAntidote;
import resinresin.wars.Items.ItemArmorMod;
import resinresin.wars.Items.ItemBattleBurgur;
import resinresin.wars.Items.ItemChaosSword;
import resinresin.wars.Items.ItemDecayGem;
import resinresin.wars.Items.ItemFireGem;
import resinresin.wars.Items.ItemGuardSword;
import resinresin.wars.Items.ItemKnightSword;
import resinresin.wars.Items.ItemLongRangeBananna;
import resinresin.wars.Items.ItemMagicPotato;
import resinresin.wars.Items.ItemMassMeal;
import resinresin.wars.Items.ItemMeleeDagger;
import resinresin.wars.Items.ItemNaturalGem;
import resinresin.wars.Items.ItemScoutsDagger;
import resinresin.wars.Items.ItemShadowFlesh;
import resinresin.wars.Items.ItemTechSpanner;
import resinresin.wars.Items.ItemWarCheese;
import resinresin.wars.Items.ItemWaterGem;
import resinresin.wars.Items.ItemWizardStaff;
import resinresin.wars.Items.ItemWorkWaffel;


public abstract class WarsItems {


	public static ArmorMaterial scoutArmor = EnumHelper.addArmorMaterial("SCOUT", null, -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial guardArmor = EnumHelper.addArmorMaterial("GUARD", null, -1, new int[] { 2, 6, 5, 2 }, 9);
	public static ArmorMaterial healerArmor = EnumHelper.addArmorMaterial("HEALER", null, -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial archerArmor = EnumHelper.addArmorMaterial("ARCHER", null, -1, new int[] { 1, 3, 2, 1 }, 15);
	public static ArmorMaterial knightArmor = EnumHelper.addArmorMaterial("KNIGHT", null, -1, new int[] { 4, 9, 7, 4 }, 10);
	public static ArmorMaterial techArmor = EnumHelper.addArmorMaterial("TECH", null, -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial bootsArmor = EnumHelper.addArmorMaterial("BOOT", null, -1, new int[] { 0, 0, 0, 0 }, 30);
	//public static ArmorMaterial readArmor = EnumHelper.addArmorMaterial("READ", null, -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial chaosArmor = EnumHelper.addArmorMaterial("CHAOS", null, -1, new int[] { 0, 0, 0, 0 }, 30);

	//public static ToolMaterial healTool = EnumHelper.addToolMaterial("HEALT", 0, 0, 0F, 0, 0);

	public static Item ancientGem;
	public static Item ancientEmblem;
	public static Item magicPotato;
	public static Item shadowFlesh;
	public static Item warCheese;
	public static Item battleBurger;
	public static Item longBannana;
	public static Item workWaffel;
	public static Item scoutBlade;
	public static Item guardSword;
	public static Item knightSword;
	public static Item healerStaff;
	public static Item bowArcher;
	public static Item techSpanner;
	public static Item meleeDagger;
	public static Item chaosSword;
	public static Item scoutHelm;
	public static Item scoutPlate;
	public static Item scoutLegs;
	public static Item techHelm;
	public static Item techPlate;
	public static Item techLegs;
	public static Item healerHelm;
	public static Item healerPlate;
	public static Item healerLegs;
	public static Item archerHelm;
	public static Item archerPlate;
	public static Item archerLegs;
	public static Item knightHelm;
	public static Item knightPlate;
	public static Item knightLegs;
	public static Item guardHelm;
	public static Item guardPlate;
	public static Item guardLegs;
	public static Item chaosHelm;
	public static Item chaosPlate;
	public static Item chaosLegs;
	public static Item redBoots;
	public static Item greenBoots;
	public static Item yellowBoots;
	public static Item blueBoots;
	public static Item waterGem;
	public static Item fireGem;
	public static Item decayGem;
	public static Item naturalGem;
	public static Item aWandTNT;
	public static Item aWandBall;
	public static Item aWandWater;
	public static Item aWandLava;
	public static Item aWandStone;
	public static Item aWandWeb;
	public static Item aWandLight;
	public static Item chaosBoots;
	public static Item massMeal;
	public static Item antidote;

	public static void createItems() {


		ancientGem = new ItemAncientGem().setUnlocalizedName("AncientGem");
		ancientEmblem = new ItemAncientEmblem().setUnlocalizedName("AncientEmblem").setCreativeTab(WarsMod.tabWarsItems);
		magicPotato = new ItemMagicPotato(3).setUnlocalizedName("MagicPotato").setCreativeTab(WarsMod.tabWarsItems);
		shadowFlesh = new ItemShadowFlesh(3).setUnlocalizedName("ShadowFlesh").setCreativeTab(WarsMod.tabWarsItems);
		warCheese = new ItemWarCheese(3).setUnlocalizedName("WarCheese").setCreativeTab(WarsMod.tabWarsItems);
		battleBurger = new ItemBattleBurgur(0).setUnlocalizedName("BattleBurger").setCreativeTab(WarsMod.tabWarsItems);
		longBannana = new ItemLongRangeBananna(4).setUnlocalizedName("LongRangeBanana").setCreativeTab(WarsMod.tabWarsItems);
		workWaffel = new ItemWorkWaffel(0).setUnlocalizedName("WorkWaffel").setCreativeTab(WarsMod.tabWarsItems);
		scoutBlade = new ItemScoutsDagger().setUnlocalizedName("ScoutSword").setCreativeTab(WarsMod.tabWarsClasses);
		guardSword = new ItemGuardSword().setUnlocalizedName("GuardSword").setCreativeTab(WarsMod.tabWarsClasses);
		knightSword = new ItemKnightSword().setUnlocalizedName("KnightSword").setCreativeTab(WarsMod.tabWarsClasses);
		healerStaff = new ItemWizardStaff().setUnlocalizedName("WizardStaff").setCreativeTab(WarsMod.tabWarsClasses);
		//bowArcher = new ItemArcherBow().setUnlocalizedName("ArcherBow").setCreativeTab(WarsMod.tabWarsClasses);
		techSpanner = new ItemTechSpanner().setUnlocalizedName("TechSpanner").setCreativeTab(WarsMod.tabWarsClasses);
		meleeDagger = new ItemMeleeDagger().setUnlocalizedName("Dagger").setCreativeTab(WarsMod.tabWarsClasses);
		chaosSword = new ItemChaosSword().setUnlocalizedName("ChaosSword").setCreativeTab(WarsMod.tabWarsClasses);
		scoutHelm = new ItemArmorMod(scoutArmor, 0, 0).setUnlocalizedName("ScoutHelm").setCreativeTab(WarsMod.tabWarsClasses);
		scoutPlate = new ItemArmorMod(scoutArmor, 1, 1).setUnlocalizedName("ScoutChest").setCreativeTab(WarsMod.tabWarsClasses);
		scoutLegs = new ItemArmorMod(scoutArmor, 2, 2).setUnlocalizedName("ScoutLegs").setCreativeTab(WarsMod.tabWarsClasses);
		techHelm = new ItemArmorMod(techArmor, 0, 0).setUnlocalizedName("TechHelm").setCreativeTab(WarsMod.tabWarsClasses);
		techPlate = new ItemArmorMod(techArmor, 1, 1).setUnlocalizedName("TechChest").setCreativeTab(WarsMod.tabWarsClasses);
		techLegs = new ItemArmorMod(techArmor, 2, 2).setUnlocalizedName("TechLegs").setCreativeTab(WarsMod.tabWarsClasses);
		healerHelm = new ItemArmorMod(healerArmor, 0, 0).setUnlocalizedName("HealerHelm").setCreativeTab(WarsMod.tabWarsClasses);
		healerPlate = new ItemArmorMod(healerArmor, 1, 1).setUnlocalizedName("HealerChest").setCreativeTab(WarsMod.tabWarsClasses);
		healerLegs = new ItemArmorMod(healerArmor, 2, 2).setUnlocalizedName("HealerLegs").setCreativeTab(WarsMod.tabWarsClasses);
		archerHelm = new ItemArmorMod(archerArmor, 0, 0).setUnlocalizedName("ArcherHelm").setCreativeTab(WarsMod.tabWarsClasses);
		archerPlate = new ItemArmorMod(archerArmor, 1, 1).setUnlocalizedName("ArcherChest").setCreativeTab(WarsMod.tabWarsClasses);
		archerLegs = new ItemArmorMod(archerArmor, 2, 2).setUnlocalizedName("ArcherLegs").setCreativeTab(WarsMod.tabWarsClasses);
		knightHelm = new ItemArmorMod(knightArmor, 0, 0).setUnlocalizedName("KnightHelm").setCreativeTab(WarsMod.tabWarsClasses);
		knightPlate = new ItemArmorMod(knightArmor, 1, 1).setUnlocalizedName("KnightChest").setCreativeTab(WarsMod.tabWarsClasses);
		knightLegs = new ItemArmorMod(knightArmor, 2, 2).setUnlocalizedName("KnightLegs").setCreativeTab(WarsMod.tabWarsClasses);
		guardHelm = new ItemArmorMod(guardArmor, 0, 0).setUnlocalizedName("GuardHelm").setCreativeTab(WarsMod.tabWarsClasses);
		guardPlate = new ItemArmorMod(guardArmor, 1, 1).setUnlocalizedName("GuardChest").setCreativeTab(WarsMod.tabWarsClasses);
		guardLegs = new ItemArmorMod(guardArmor, 2, 2).setUnlocalizedName("GuardLegs").setCreativeTab(WarsMod.tabWarsClasses);
		chaosHelm = new ItemArmorMod(chaosArmor, 0, 0).setUnlocalizedName("ChaosHelm").setCreativeTab(WarsMod.tabWarsClasses);
		chaosPlate = new ItemArmorMod(chaosArmor, 1, 1).setUnlocalizedName("ChaosChest").setCreativeTab(WarsMod.tabWarsClasses);
		chaosLegs = new ItemArmorMod(chaosArmor, 2, 2).setUnlocalizedName("ChaosLegs").setCreativeTab(WarsMod.tabWarsClasses);
		redBoots = new ItemArmorMod(bootsArmor, 3, 3).setUnlocalizedName("RedBoots").setCreativeTab(WarsMod.tabWarsClasses);
		greenBoots = new ItemArmorMod(bootsArmor, 3, 3).setUnlocalizedName("GreenBoots").setCreativeTab(WarsMod.tabWarsClasses);
		yellowBoots = new ItemArmorMod(bootsArmor, 3, 3).setUnlocalizedName("YellowBoots").setCreativeTab(WarsMod.tabWarsClasses);
		blueBoots = new ItemArmorMod(bootsArmor, 3, 3).setUnlocalizedName("BlueBoots").setCreativeTab(WarsMod.tabWarsClasses);
		chaosBoots = new ItemArmorMod(bootsArmor, 3, 3).setUnlocalizedName("ChaosBoots").setCreativeTab(WarsMod.tabWarsClasses);
		waterGem = new ItemWaterGem().setUnlocalizedName("WaterGem");
		fireGem = new ItemFireGem().setUnlocalizedName("FireGem");
		decayGem = new ItemDecayGem().setUnlocalizedName("DecayGem");
		naturalGem = new ItemNaturalGem().setUnlocalizedName("NaturalGem");
		aWandTNT = new ItemAdminWandTNT().setUnlocalizedName("AdminTNT");
		aWandBall = new ItemAdminWandBall().setUnlocalizedName("AdminFireball");
		aWandWater = new ItemAdminWandWater().setUnlocalizedName("AdminWater");
		aWandLava = new ItemAdminWandLava().setUnlocalizedName("AdminLava");
		aWandStone = new ItemAdminWandStone().setUnlocalizedName("AdminStone");
		aWandWeb = new ItemAdminWandWeb().setUnlocalizedName("AdminWeb");
		aWandLight = new ItemAdminWandLight().setUnlocalizedName("AdminFire");
		massMeal = new ItemMassMeal().setUnlocalizedName("MassMeal");
		antidote = new ItemAntidote().setUnlocalizedName("Antidote");

		GameRegistry.registerItem(ancientGem, "ancientGem");


		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ancientGem, 0, new ModelResourceLocation("warsmod:ancientGem", "inventory"));

		//		LanguageRegistry.addName(ancientGem, "Ancient Gem");
		//		LanguageRegistry.addName(ancientEmblem, "Ancient Emblem");
		//		LanguageRegistry.addName(scoutHelm, "\u00a78Scout Hood");
		//		LanguageRegistry.addName(scoutPlate, "\u00a78Scout Tunic");
		//		LanguageRegistry.addName(scoutLegs, "\u00a78Scout Leggings");
		//		LanguageRegistry.addName(archerHelm, "\u00a72Archer Hood");
		//		LanguageRegistry.addName(archerPlate, "\u00a72Archer Tunic");
		//		LanguageRegistry.addName(archerLegs, "\u00a72Archer Leggings");
		//		LanguageRegistry.addName(guardHelm, "\u00a76Guard Helm");
		//		LanguageRegistry.addName(guardPlate, "\u00a76Guard Chestplate");
		//		LanguageRegistry.addName(guardLegs, "\u00a76Guard Trousers");
		//		LanguageRegistry.addName(healerHelm, "\u00a75Healer Hood");
		//		LanguageRegistry.addName(healerPlate, "\u00a75Healer Cloak");
		//		LanguageRegistry.addName(healerLegs, "\u00a75Healer Leggings");
		//		LanguageRegistry.addName(techHelm, "\u00a79Tech Helmet");
		//		LanguageRegistry.addName(techPlate, "\u00a79Tech Dungerees");
		//		LanguageRegistry.addName(techLegs, "\u00a79Tech Trousers");
		//		LanguageRegistry.addName(knightHelm, "\u00a74Knight Helm");
		//		LanguageRegistry.addName(knightPlate, "\u00a74Knight Chestplate");
		//		LanguageRegistry.addName(knightLegs, "\u00a74Knight Leggings");
		//		LanguageRegistry.addName(chaosHelm, "\u00a75Chaos Warrior Helm");
		//		LanguageRegistry.addName(chaosPlate, "\u00a75Chaos Warrior Chestplate");
		//		LanguageRegistry.addName(chaosLegs, "\u00a75Chaos Warrior Leggings");
		//		LanguageRegistry.addName(blueBoots, "\u00a79Blue Team Boots");
		//		LanguageRegistry.addName(redBoots, "\u00a74Red Team Boots");
		//		LanguageRegistry.addName(greenBoots, "\u00a72Green Team Boots");
		//		LanguageRegistry.addName(yellowBoots, "\u00a76Yellow Team Boots");
		//		LanguageRegistry.addName(chaosBoots, "\u00a75Chaos Boots");
		//		LanguageRegistry.addName(scoutBlade, "\u00a78Scout Blade");
		//		LanguageRegistry.addName(knightSword, "\u00a74Knight Sword");
		//		LanguageRegistry.addName(guardSword, "\u00a76Guard Sword");
		//		LanguageRegistry.addName(healerStaff, "\u00a75Healers Staff");
		//		LanguageRegistry.addName(magicPotato, "Magical Potato -healer-");
		//		LanguageRegistry.addName(workWaffel, "Work Waffel -tech-");
		//		LanguageRegistry.addName(battleBurger, "Battle Burger -guard-");
		//		LanguageRegistry.addName(warCheese, "War Cheese -knight-");
		//		LanguageRegistry.addName(shadowFlesh, "Shadow Flesh -scout-");
		//		LanguageRegistry.addName(longBannana, "Long Range Bananna -archer-");
		//		LanguageRegistry.addName(fireGem, "\u00a74Fireite Gem");
		//		LanguageRegistry.addName(waterGem, "\u00a79Wateite Gem");
		//		LanguageRegistry.addName(decayGem, "\u00a76Decanite Gem");
		//		LanguageRegistry.addName(naturalGem, "\u00a72Natrite Gem");
		//		LanguageRegistry.addName(aWandBall, "Admin Wand - Fireballs");
		//		LanguageRegistry.addName(aWandLight, "Admin Wand - Smiting");
		//		LanguageRegistry.addName(aWandStone, "Admin Wand - Stone Thrower");
		//		LanguageRegistry.addName(aWandLava, "Admin Wand - Lava");
		//		LanguageRegistry.addName(aWandWater, "Admin Wand - Water");
		//		LanguageRegistry.addName(aWandWeb, "Admin Wand - Web Thrower");
		//		LanguageRegistry.addName(aWandTNT, "Admin Wand - TNT");
		//		LanguageRegistry.addName(massMeal, "Mass Bone Meal");
		//		LanguageRegistry.addName(antidote, "Antidote");
		//		LanguageRegistry.addName(techSpanner, "\u00a79Tech Spanner");
		//		LanguageRegistry.addName(meleeDagger, "Melee Dagger");
		//		LanguageRegistry.addName(bowArcher, "\u00a72Archer Bow");
		//		LanguageRegistry.addName(chaosSword, "\u00a75Chaos Sword");


	}



}