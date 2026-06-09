package org.cardboardpowered.mixin.world.item;

import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = SignItem.class, priority = 900)
public class SignItemMixin extends Item {

    public SignItemMixin(Properties settings) {
        super(settings);
    }
}
