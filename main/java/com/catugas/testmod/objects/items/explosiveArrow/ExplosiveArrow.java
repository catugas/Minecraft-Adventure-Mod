package com.catugas.testmod.objects.items.explosiveArrow;

import com.catugas.testmod.Main;
import com.catugas.testmod.init.ModItems;
import com.catugas.testmod.objects.items.ItemBase;
import com.catugas.testmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySpectralArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ExplosiveArrow extends ItemArrow implements IHasModel{

	public ExplosiveArrow(String name) 
	{
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter)
    {
        return new EntityExplosiveArrow(worldIn, shooter);
    }
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
