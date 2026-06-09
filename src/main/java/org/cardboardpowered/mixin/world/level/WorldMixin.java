package org.cardboardpowered.mixin.world.level;

import net.minecraft.world.level.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = World.class, priority = 900)
public class WorldMixin {
    // World implementation for Cardboard
    // This mixin ensures world works with Bukkit API
}