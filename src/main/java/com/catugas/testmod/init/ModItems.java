package com.catugas.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.catugas.testmod.objects.items.AsShield;
import com.catugas.testmod.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	
	// public static final Item AS_SHIELD = new AsShield("as_shield");
}

