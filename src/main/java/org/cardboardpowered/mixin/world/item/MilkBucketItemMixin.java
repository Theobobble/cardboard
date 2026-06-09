package org.cardboardpowered.mixin.world.item;

import net.minecraft.world.item.MilkBucketItem;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = MilkBucketItem.class, priority = 900)
public class MilkBucketItemMixin extends Item {

    public MilkBucketItemMixin(Properties settings) {
        super(settings);
    }
}
