package io.github.strikerrocker.craftingpad;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class CustomCraftingTableContainer extends CraftingScreenHandler {

    public CustomCraftingTableContainer(int id, PlayerInventory playerInventory, ScreenHandlerContext blockContext) {
        super(id, playerInventory, blockContext);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
