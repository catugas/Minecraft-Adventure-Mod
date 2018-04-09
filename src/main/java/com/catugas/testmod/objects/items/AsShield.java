package com.catugas.testmod.objects.items;

import com.catugas.testmod.Main;
import com.catugas.testmod.init.ModItems;
import com.catugas.testmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShield;

public class AsShield extends ItemShield implements IHasModel {
	
	public AsShield(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
