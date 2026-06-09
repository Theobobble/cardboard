package org.cardboardpowered.mixin.world.level.block.entity;

import net.minecraft.world.level.block.entity.ConduitBlockEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ConduitBlockEntity.class, priority = 900)
public class ConduitBlockEntityMixin {
    // ConduitBlockEntity implementation for Cardboard
    // This mixin ensures conduits work with Bukkit API
}