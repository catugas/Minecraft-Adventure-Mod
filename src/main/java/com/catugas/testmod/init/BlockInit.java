package com.catugas.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.catugas.testmod.objects.blocks.BlockBase;
import com.catugas.testmod.objects.blocks.BlockTeleNode;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_BASE = new BlockBase("block_base", Material.IRON);
	
	public static final Block TELE_NODE = new BlockTeleNode("tele_node");
}
