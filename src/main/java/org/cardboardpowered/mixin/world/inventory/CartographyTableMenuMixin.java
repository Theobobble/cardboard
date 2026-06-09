package org.cardboardpowered.mixin.world.inventory;

import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import net.minecraft.world.inventory.CartographyTableMenu;
import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.inventory.CraftInventoryCartography;
import org.spongepowered.asm.mixin.Mixin;

import org.cardboardpowered.bridge.world.inventory.CartographyTableMenuBridge;
import org.cardboardpowered.bridge.world.inventory.ContainerLevelAccessBridge;
import org.cardboardpowered.bridge.server.level.ServerPlayerBridge;

@Mixin(CartographyTableMenu.class)
public class CartographyTableMenuMixin extends ItemCombinerMenuMixin implements CartographyTableMenuBridge {

    public CraftInventoryView bukkitEntity;

    @Override
    public CraftInventoryView getBukkitView() {
        if (bukkitEntity != null)
            return bukkitEntity;

        org.bukkit.craftbukkit.inventory.CraftInventory inventory = new CraftInventoryCartography(
                ((ContainerLevelAccessBridge)access).getLocation(), this.inputSlots, this.resultSlots);
        bukkitEntity = new CraftInventoryView((Player)((ServerPlayerBridge)this.player).getBukkitEntity(), inventory, (CartographyTableMenu)(Object)this);
        return bukkitEntity;
    }
}
