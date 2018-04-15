package com.catugas.testmod.util.handlers;

import com.catugas.testmod.entity.EntityMilitia;
import com.catugas.testmod.entity.render.RenderMilitia;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMilitia.class, new IRenderFactory<EntityMilitia>()
		{
			@Override
			public Render<? super EntityMilitia> createRenderFor(RenderManager manager)
			{
				return new RenderMilitia(manager);
			}
		});
	}

}
