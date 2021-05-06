package com.ryjjan.penguin.magic;

import com.ryjjan.penguin.magic.registry.ModBlocks;
import com.ryjjan.penguin.magic.registry.ModItems;
import com.ryjjan.penguin.magic.registry.ModStatus;
import com.ryjjan.penguin.magic.registry.OreGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
	public static final String MOD_ID = "penguinmagic";

	public static final ItemGroup PENGUIN_MAGIC_GROUP = FabricItemGroupBuilder.build(new Identifier("penguinmagic", "general"),
			() -> new ItemStack(ModItems.PENNY));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		OreGeneration.registerOres();
		ModStatus.registerStatus();

		ModItems.addValues("u_rose_quartz", new ItemStack(ModItems.ROSE_QUARTZ));
		ModItems.addValues("u_amethyst", new ItemStack(ModItems.AMETHYST));
	}
}
