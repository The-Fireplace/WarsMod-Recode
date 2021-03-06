package the_fireplace.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockNetherSpleefSmall extends Block {

	public BlockNetherSpleefSmall() {
		super(Material.IRON);
		setSoundType(SoundType.STONE);
	}

	ResinresinLoader nSpleef = new ResinresinLoader("nSpleef.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		nSpleef.generate(world, i + -8, j, k + -1, false);
		WarsMod.generateBlock(world, i, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 1, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 2, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 3, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 4, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 5, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 6, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 17, WarsBlocks.spleefStone);

		// left
		WarsMod.generateBlock(world, i - 1, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 2, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 3, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 4, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 5, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 6, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 17, WarsBlocks.spleefStone);

		return false;
	}

}
