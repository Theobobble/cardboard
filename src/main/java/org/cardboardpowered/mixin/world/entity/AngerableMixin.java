package org.cardboardpowered.mixin.world.entity;

import net.minecraft.world.entity.mob.Angerable;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = Angerable.class, priority = 900)
public class AngerableMixin {
    // Angerable implementation for Cardboard
    // This mixin ensures Angerable entities work with Bukkit API
}