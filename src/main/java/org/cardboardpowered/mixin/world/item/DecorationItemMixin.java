package org.cardboardpowered.mixin.world.item;

import net.minecraft.world.item.DecorationItem;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = DecorationItem.class, priority = 900)
public class DecorationItemMixin extends Item {

    public DecorationItemMixin(Properties settings) {
        super(settings);
    }
}
