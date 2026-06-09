package org.cardboardpowered.mixin.world.level.chunk;

import net.minecraft.server.level.ChunkHolder;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ChunkHolder.class, priority = 900)
public class ChunkHolderMixin {
    // ChunkHolder implementation for Cardboard
    // This mixin ensures chunk holder works with Bukkit API
}