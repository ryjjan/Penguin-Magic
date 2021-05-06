package com.ryjjan.penguin.magic.registry;

import com.ryjjan.penguin.magic.Main;
import com.ryjjan.penguin.magic.status.Heal;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModStatus {
    public static StatusEffect heal = new Heal();

    public static void registerStatus(){
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Main.MOD_ID, "heal"), heal);
    }
}
