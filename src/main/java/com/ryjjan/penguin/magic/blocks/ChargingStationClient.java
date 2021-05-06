package com.ryjjan.penguin.magic.blocks;

import com.ryjjan.penguin.magic.registry.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;

public class ChargingStationClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererRegistry.INSTANCE.register(ModBlocks.CHARGING_STATION_ENTITY, ChargingStationEntityRender::new);
    }
}
