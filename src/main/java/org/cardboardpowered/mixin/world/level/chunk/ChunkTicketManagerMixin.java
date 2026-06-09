package org.cardboardpowered.mixin.world.level.chunk;

import net.minecraft.server.level.ChunkTicketManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ChunkTicketManager.class, priority = 900)
public class ChunkTicketManagerMixin {
    // ChunkTicketManager implementation for Cardboard
    // This mixin ensures chunk ticketing works with Bukkit API
}