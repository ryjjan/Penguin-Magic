package com.ryjjan.penguin.magic.crystals;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.MessageType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Amethyst extends Item {
    public Amethyst(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand){
        MinecraftClient mc = MinecraftClient.getInstance();
        mc.inGameHud.addChatMessage(MessageType.SYSTEM, Text.of("Right Clicked!"), mc.player.getUuid());
        return TypedActionResult.success(player.getStackInHand(hand));
    }
}
