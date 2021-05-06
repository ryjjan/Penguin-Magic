package com.ryjjan.penguin.magic.registry;

import com.ryjjan.penguin.magic.Main;
import com.ryjjan.penguin.magic.crystals.Amethyst;
import com.ryjjan.penguin.magic.crystals.RoseQuartz;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class ModItems {
    public static HashMap<String, ItemStack> crystalsNames = new HashMap<>();

    public static final Item PENNY = new Item(new Item.Settings().group(Main.PENGUIN_MAGIC_GROUP));
    public static final Item U_ROSE_QUARTZ = new Item(new Item.Settings().group(Main.PENGUIN_MAGIC_GROUP).fireproof());
    public static final RoseQuartz ROSE_QUARTZ = new RoseQuartz(new Item.Settings().group(Main.PENGUIN_MAGIC_GROUP).fireproof().maxDamage(1));
    public static final Item ROSE_QUARTZ_SHARD = new Item(new Item.Settings().group(Main.PENGUIN_MAGIC_GROUP));
    public static final Item U_AMETHYST = new Item(new Item.Settings().group(Main.PENGUIN_MAGIC_GROUP).fireproof());
    public static final Amethyst AMETHYST = new Amethyst(new Item.Settings().group(Main.PENGUIN_MAGIC_GROUP).fireproof().maxDamage(1));
    public static final Item AMETHYST_SHARD = new Item(new Item.Settings().group(Main.PENGUIN_MAGIC_GROUP));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "penny"), PENNY);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "u_rose_quartz"), U_ROSE_QUARTZ);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rose_quartz"), ROSE_QUARTZ);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rose_quartz_shard"), ROSE_QUARTZ_SHARD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "u_amethyst"), U_AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst"), AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_shard"), AMETHYST_SHARD);
    }

    public static void addValues(String name, ItemStack item){
        crystalsNames.put(name, item);
    }
}
