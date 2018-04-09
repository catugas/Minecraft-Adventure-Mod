package com.catugas.testmod.world.types;

import com.catugas.testmod.init.BiomeInit;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeAnartica extends WorldType
{
	public WorldTypeAnartica()
	{
		super("Anartica");
	}
	
	@Override
	public BiomeProvider getBiomeProvider (World world)
	{
		return new BiomeProviderSingle(BiomeInit.ANARTICA);
	}
}
