package com.ryjjan.penguin.magic.registry;

import com.ryjjan.penguin.magic.Main;
import com.ryjjan.penguin.magic.blocks.ChargingStation;
import com.ryjjan.penguin.magic.blocks.ChargingStationEntity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block ROZE_QUARTZ_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3.0f)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool());
    public static final Block AMETHYST_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3.0f)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool());

    public static final ChargingStation CHARGING_STATION = new ChargingStation(FabricBlockSettings.of(Material.METAL).strength(3.0f));
    public static BlockEntityType<ChargingStationEntity> CHARGING_STATION_ENTITY;

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "rose_quartz_ore"), ROZE_QUARTZ_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rose_quartz_ore"), new BlockItem(ROZE_QUARTZ_ORE,
                new FabricItemSettings().group(Main.PENGUIN_MAGIC_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "amethyst_ore"), AMETHYST_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "amethyst_ore"), new BlockItem(AMETHYST_ORE,
                new FabricItemSettings().group(Main.PENGUIN_MAGIC_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "charging_station"), CHARGING_STATION);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "charging_station"), new BlockItem(CHARGING_STATION,
                new FabricItemSettings().group(Main.PENGUIN_MAGIC_GROUP)));
        CHARGING_STATION_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, Main.MOD_ID+":charging_station", BlockEntityType.Builder.create(ChargingStationEntity::
                new, CHARGING_STATION).build(null));
    }
}
