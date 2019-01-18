package io.github.strikerrocker.craftingstick;

import net.minecraft.class_3914;
import net.minecraft.container.CraftingTableContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomCraftingTableContainer extends CraftingTableContainer {

    public CustomCraftingTableContainer(int int1, PlayerInventory var1, class_3914 class_3914) {
        super(int1, var1,class_3914);
    }

    @Override
    public boolean canUse(PlayerEntity var1) {
        return true;
    }
}
