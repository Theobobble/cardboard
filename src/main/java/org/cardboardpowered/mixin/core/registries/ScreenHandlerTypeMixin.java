package org.cardboardpowered.mixin.core.registries;

import net.minecraft.world.inventory.MenuType;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = MenuType.class, priority = 900)
public class ScreenHandlerTypeMixin {
    // ScreenHandlerType implementation
}
