package com.catugas.testmod.entity.render;

import com.catugas.testmod.entity.EntityMilitia;
import com.catugas.testmod.entity.model.ModelMilitia;
import com.catugas.testmod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMilitia extends RenderLiving<EntityMilitia>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/militia.png");
	
	public RenderMilitia(RenderManager manager) 
	{
		super(manager, new ModelMilitia(0.5F), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityMilitia entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityMilitia entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
