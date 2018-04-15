package com.catugas.testmod.init;

import com.catugas.testmod.Main;
import com.catugas.testmod.entity.EntityMilitia;
import com.catugas.testmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
	public static void registerEntities()
	{
		registerEntity("militia", EntityMilitia.class, Reference.ENTITY_MILITIA, 50, 11437146, 000000);
	}
	
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	
}
