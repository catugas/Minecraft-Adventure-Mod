package com.catugas.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.catugas.testmod.objects.blocks.CopperBlock;
import com.catugas.testmod.objects.blocks.SilverBlock;
import com.catugas.testmod.objects.blocks.TeleNode;
import com.catugas.testmod.objects.blocks.TinBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// public static final Block ORE_END = new BlockOres("ore_end", "end");
	// public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	
	public static final Block TIN_BLOCK = new TinBlock("tin_block", Material.IRON);
	
	public static final Block SILVER_BLOCK = new SilverBlock("silver_block", Material.IRON);
	
	public static final Block TELE_NODE = new TeleNode("tele_node", Material.PORTAL); //
	
}
