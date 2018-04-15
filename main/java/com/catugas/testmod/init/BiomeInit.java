package com.catugas.testmod.init;

import com.catugas.testmod.world.biomes.BiomeAnartica;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit 
{
	public static final Biome ANARTICA = new BiomeAnartica();
	
	
	public static void registerBiomes()
	{
		initBiome(ANARTICA, "Anartica", BiomeType.ICY, Type.COLD, Type.HILLS, Type.SNOWY, Type.SPARSE);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) 
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome,types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome,10));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");
		return biome;
		
	}

}
