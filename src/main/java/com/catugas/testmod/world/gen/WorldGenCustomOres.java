package com.catugas.testmod.world.gen;

import java.util.Random;

import com.catugas.testmod.init.BlockOres;
import com.catugas.testmod.init.ModBlocks;
import com.catugas.testmod.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_overworld_copper, ore_overworld_tin, ore_overworld_silver;
	
	public WorldGenCustomOres()
	{
		ore_overworld_copper = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.COPPER), 7);
		// ^^ add after 6 -> , BlockMatcher.forBlock(Blocks.NETHER)) to put close to nether, sand, etc.
		
		ore_overworld_tin = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TIN), 7);
		ore_overworld_silver = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SILVER), 4);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{
		case -1: // for nether
			break;
			
		case 0:
			
			runGenerator(ore_overworld_copper, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_tin, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_silver, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 1: // for end
			break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight +1;
		for(int i = 0; i <chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
