package the_fireplace.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;
import the_fireplace.wars.init.WarsBlocks;

public class BlockCBlue extends Block {

	public BlockCBlue() {
		super(Material.iron);
	}

	ResinresinLoader controlBlue = new ResinresinLoader("controlBlue.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		controlBlue.generate(world, i + -2, j - 0, k + -1, true);
		{
			WarsMod.generateBlock(world, i + -2, j - 0, k + 0, WarsBlocks.controlYellow);
			WarsMod.generateBlock(world, i + 0, j - 0, k + 0, WarsBlocks.controlBlue);
			WarsMod.generateBlock(world, i + -1, j - 0, k + -1, WarsBlocks.controlRed);
			WarsMod.generateBlock(world, i + -1, j - 0, k + 1, WarsBlocks.controlGreen);

		}
		{
			EntityLightningBolt entityLightningBolt = new EntityLightningBolt(world, maxX, maxX, maxX);
			entityLightningBolt.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
			world.spawnEntityInWorld(entityLightningBolt);

		}
		return false;

	}

}