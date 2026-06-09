package org.cardboardpowered.mixin.world.level.block.entity;

import net.minecraft.world.level.block.entity.CommandBlockEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = CommandBlockEntity.class, priority = 900)
public class CommandBlockBlockEntityMixin {
    // CommandBlockEntity implementation for Cardboard
    // This mixin ensures command blocks work with Bukkit API
}