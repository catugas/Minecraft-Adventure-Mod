package com.catugas.testmod.world.biomes;

import com.catugas.testmod.init.BlockOres;
import com.catugas.testmod.init.ModBlocks;
import com.catugas.testmod.util.handlers.EnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockSnowBlock;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeAnartica extends Biome
{

	public BiomeAnartica() 
	{
		super(new BiomeProperties("Anartica").setBaseHeight(0.30F).setHeightVariation(0.17F).setTemperature(-5.0F).setSnowEnabled().setRainDisabled());
		
		topBlock = Blocks.SNOW.getDefaultState();
		fillerBlock = Blocks.ICE.getDefaultState();
		
		this.decorator.coalGen = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SILVER), 10);
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityDragon.class, 5, 1, 2));
		// this.decorator.treesPerChunk = 2
	}
	
//	@Override
//	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
//	{
//		return tree
//	}
}
