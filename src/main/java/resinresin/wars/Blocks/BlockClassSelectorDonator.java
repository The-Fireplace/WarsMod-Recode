package resinresin.wars.Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.tileentities.TileEntityClassSelectDonator;

public class BlockClassSelectorDonator extends BlockContainer {

	public BlockClassSelectorDonator() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {
		
		TileEntity tile_entity = world.getTileEntity(pos);
		if (tile_entity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(warsmod.instance, 2, world, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}

	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityClassSelectDonator();
	}

}