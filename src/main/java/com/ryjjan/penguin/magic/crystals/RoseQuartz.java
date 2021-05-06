package com.ryjjan.penguin.magic.crystals;

import com.ryjjan.penguin.magic.registry.ModStatus;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class RoseQuartz extends Item {
    public RoseQuartz(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand){
        player.addStatusEffect(new StatusEffectInstance(ModStatus.heal, 20 * 10));
        player.getStackInHand(hand).setCount(0);
        return TypedActionResult.success(player.getStackInHand(hand));
    }
}