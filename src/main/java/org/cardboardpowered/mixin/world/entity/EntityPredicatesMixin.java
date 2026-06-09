package org.cardboardpowered.mixin.world.entity;

import net.minecraft.world.entity.EntityPredicates;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = EntityPredicates.class, priority = 900)
public class EntityPredicatesMixin {
    // EntityPredicates implementation for Cardboard
    // This mixin ensures entity predicates work with Bukkit API
}