package io.github.strikerrocker.craftingstick
        ;

import net.minecraft.container.BlockContext;
import net.minecraft.container.CraftingTableContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;

public class CustomCraftingTableContainer extends CraftingTableContainer {

    public CustomCraftingTableContainer(int int1, PlayerInventory var1, BlockContext blockContext) {
        super(int1, var1, blockContext);
    }

    @Override
    public boolean canUse(PlayerEntity var1) {
        return true;
    }
}
