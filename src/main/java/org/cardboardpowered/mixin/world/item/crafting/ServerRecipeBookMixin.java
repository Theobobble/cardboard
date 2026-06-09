package org.cardboardpowered.mixin.world.item.crafting;

import net.minecraft.world.item.crafting.ServerRecipeBook;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ServerRecipeBook.class, priority = 900)
public class ServerRecipeBookMixin {
    // ServerRecipeBook implementation for Cardboard
    // This mixin ensures recipe book works with Bukkit API
}