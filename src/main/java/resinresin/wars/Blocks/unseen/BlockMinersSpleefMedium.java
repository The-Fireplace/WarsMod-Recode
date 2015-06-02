package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockMinersSpleefMedium extends Block {

	public BlockMinersSpleefMedium() {
		super(Material.iron);
	}

	/**
	 * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
	 */

	resinresinLoader mSpleefM = new resinresinLoader("mSpleefM.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		WarsMod.generateBlock(world, i + 0, j + 2, k + 10, Blocks.stone);
		WarsMod.generateBlock(world, i + 1, j + 2, k + 10, Blocks.stone);
		WarsMod.generateBlock(world, i + 10, j + 1, k - 2, Blocks.stone);

		mSpleefM.generate(world, i + -12, j - 2, k + -12, false);

		// 1
		WarsMod.generateBlock(world, i + 0, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(world, i + 2, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(world, i + 3, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(world, i + 4, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(world, i + 5, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(world, i + 6, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(world, i + 7, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 2, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 9, j + 10, k + 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 3, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 9, j + 10, k + 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 4, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k + 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 5, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(world, i - 0, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(world, i - 2, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(world, i - 3, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(world, i - 4, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(world, i - 5, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(world, i - 6, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(world, i - 7, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 2, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 9, j + 10, k - 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 3, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 9, j + 10, k - 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 4, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k - 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 5, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k - 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(world, i - 0, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(world, i - 2, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(world, i - 3, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(world, i - 4, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(world, i - 5, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(world, i - 6, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(world, i - 7, j + 10, k + 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 0, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 2, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 9, j + 10, k + 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 3, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 9, j + 10, k + 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 4, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k + 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 5, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(world, i + 0, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(world, i + 2, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(world, i + 3, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(world, i + 4, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(world, i + 5, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(world, i + 6, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(world, i + 7, j + 10, k - 0, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 2, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 9, j + 10, k - 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 3, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 9, j + 10, k - 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 4, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k - 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 5, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k - 5, WarsBlocks.spleefStone);

		return false;

	}

}
