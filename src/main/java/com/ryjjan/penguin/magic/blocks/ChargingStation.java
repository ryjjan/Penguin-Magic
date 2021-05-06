package com.ryjjan.penguin.magic.blocks;

import com.ryjjan.penguin.magic.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class ChargingStation extends Block implements BlockEntityProvider {
    public static Item renderItem;

    public ChargingStation(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new ChargingStationEntity();
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult hit){
        Inventory blockEntity = (Inventory) world.getBlockEntity(blockPos);
        Tag<Item> tag =  world.getTagManager().getItems().getTag(new Identifier("penguinmagic", "u_crystals"));

        if (tag.contains(player.getStackInHand(hand).getItem())){
            if(blockEntity.getStack(0).isEmpty()){
                ItemStack item = new ItemStack(player.getStackInHand(hand).getItem());
                player.getStackInHand(hand).setCount(player.getStackInHand(hand).getCount()-1);
                renderItem = item.getItem();
                blockEntity.setStack(0, item);
                new Thread(){
                    @Override
                    public void run(){
                        try {
                            Thread.sleep(5000);
                            renderItem = ModItems.crystalsNames.get(item.getItem().toString()).getItem();
                            blockEntity.setStack(0, ModItems.crystalsNames.get(item.getItem().toString()));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        }else{
            if(!blockEntity.getStack(0).isEmpty()) {
                player.inventory.offerOrDrop(world, blockEntity.getStack(0));
                renderItem = null;
                blockEntity.removeStack(0);
            }
        }

        return ActionResult.SUCCESS;
    }
}
