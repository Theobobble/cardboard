package org.cardboardpowered.mixin.world.inventory;

import net.minecraft.world.inventory.CartographyTableMenu;
import org.spongepowered.asm.mixin.Mixin;

import org.cardboardpowered.bridge.world.inventory.CartographyTableMenuBridge;

@Mixin(CartographyTableMenu.class)
public class CartographyTableMenuMixin extends ItemCombinerMenuMixin implements CartographyTableMenuBridge {
    // Cartography table menu implementation
}
