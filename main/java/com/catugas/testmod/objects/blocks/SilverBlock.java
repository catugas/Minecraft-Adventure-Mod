package com.catugas.testmod.objects.blocks;

import com.catugas.testmod.util.interfaces.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverBlock extends BlockBase{

	public SilverBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		
		// setLightLevel(1.0F); - Sets level of light like from glowstone
		// setBlockUnbreakable(); - Set blocks to be unbreakable i.e. bedrock
		// setLightOpacity(1); - A method that allows light to pass through	
		}
}
