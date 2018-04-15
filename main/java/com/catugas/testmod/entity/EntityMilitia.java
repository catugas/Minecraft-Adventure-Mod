package com.catugas.testmod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityMilitia extends EntityVillager{

	public EntityMilitia(World worldIn)
	{
		super(worldIn);	
	}
	
	@Override
	public EntityMilitia createChild(EntityAgeable ageable)
	{
		return new EntityMilitia(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return super.getDeathSound();
	}

}
