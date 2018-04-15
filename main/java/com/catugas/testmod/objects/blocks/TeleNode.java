package com.catugas.testmod.objects.blocks;

import com.catugas.testmod.util.interfaces.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class TeleNode extends BlockBase{

	public TeleNode(String name, Material material) {
		super(name, material);
		
		setHardness(5.0F);
		setResistance(15.0F);
		setLightLevel(1000.0F);
		
		// setBlockUnbreakable(); - Set blocks to be unbreakable i.e. bedrock
		// setLightOpacity(1); - A method that allows light to pass through	
		}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
//	@Override 
//	public boolean isFullCube(IBlockState state) // Da Fuck does this do?
//	{
//		return false;
//	}
}
