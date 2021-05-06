package com.ryjjan.penguin.magic.registry;

import com.ryjjan.penguin.magic.Main;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGeneration {
    public static ConfiguredFeature<?, ?> SPAWN_ROSE_QUARTZ = Feature.ORE.configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.ROZE_QUARTZ_ORE.getDefaultState(), 5))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,24)))
            .spreadHorizontally()
            .repeat(2);

    public static ConfiguredFeature<?, ?> SPAWN_AMETHYST = Feature.ORE.configure(new OreFeatureConfig(
            OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.AMETHYST_ORE.getDefaultState(), 5))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,24)))
            .spreadHorizontally()
            .repeat(2);

    public static void registerOres(){
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Main.MOD_ID, "rose_quartz_overworld"), SPAWN_ROSE_QUARTZ);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Main.MOD_ID, "amethyst_overworld"), SPAWN_AMETHYST);
    }
}
