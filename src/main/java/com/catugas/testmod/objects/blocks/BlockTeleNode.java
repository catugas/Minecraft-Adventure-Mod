package com.catugas.testmod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockTeleNode extends BlockBase {
	
	public static final AxisAlignedBB TELE_NODE_AABB = new AxisAlignedBB(0.1875D,0, 0.1875D, 0.8125D, 0.625D,0.8125D);

	public BlockTeleNode(String name) {
		super(name, Material.PORTAL);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false; 
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return TELE_NODE_AABB;
	}
	
}
