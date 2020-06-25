package io.github.strikerrocker.craftingpad
        ;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class CustomCraftingTableContainer extends CraftingScreenHandler {

    public CustomCraftingTableContainer(int int1, PlayerInventory var1, ScreenHandlerContext blockContext) {
        super(int1, var1, blockContext);
    }

    @Override
    public boolean canUse(PlayerEntity var1) {
        return true;
    }
}
