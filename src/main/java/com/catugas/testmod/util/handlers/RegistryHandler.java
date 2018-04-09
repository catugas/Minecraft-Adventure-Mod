package com.catugas.testmod.util.handlers;

import com.catugas.testmod.init.BiomeInit;
import com.catugas.testmod.init.ModBlocks;
import com.catugas.testmod.init.ModItems;
import com.catugas.testmod.util.interfaces.IHasModel;
import com.catugas.testmod.world.gen.WorldGenCustomOres;
import com.catugas.testmod.world.types.WorldTypeAnartica;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for (Block block : ModBlocks.BLOCKS)
		{
			if (block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		// GameRegistry.addSmelting( , new ItemStack(Item.getByNameOrId("tm:tele_node"),1), 0.3f);
		
		BiomeInit.registerBiomes();
	}
	
	public static void postInitRegistries()
	{
		WorldType ANARTICA = new WorldTypeAnartica();
	}
}
