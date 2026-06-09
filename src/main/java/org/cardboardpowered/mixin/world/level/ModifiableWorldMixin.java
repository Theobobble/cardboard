package org.cardboardpowered.mixin.world.level;

import net.minecraft.world.level.ModifiableWorld;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ModifiableWorld.class, priority = 900)
public class ModifiableWorldMixin {
    // ModifiableWorld implementation for Cardboard
    // This mixin ensures modifiable world works with Bukkit API
}