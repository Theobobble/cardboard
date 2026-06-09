package org.cardboardpowered.mixin.world.level.chunk;

import net.minecraft.server.level.ThreadedAnvilChunkStorage;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ThreadedAnvilChunkStorage.class, priority = 900)
public class ThreadedAnvilChunkStorageMixin {
    // ThreadedAnvilChunkStorage implementation for Cardboard
    // This mixin ensures threaded anvil chunk storage works with Bukkit API
}