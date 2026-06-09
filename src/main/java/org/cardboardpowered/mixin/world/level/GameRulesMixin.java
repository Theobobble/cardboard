package org.cardboardpowered.mixin.world.level;

import net.minecraft.world.level.GameRules;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = GameRules.class, priority = 900)
public class GameRulesMixin {
    // GameRules implementation for Cardboard
    // This mixin ensures game rules work with Bukkit API
}