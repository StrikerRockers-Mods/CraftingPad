package io.github.strikerrocker.craftingpad;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;

public class CustomCraftingTableContainer extends CraftingMenu {

    public CustomCraftingTableContainer(int id, Inventory playerInventory, ContainerLevelAccess blockContext) {
        super(id, playerInventory, blockContext);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}
