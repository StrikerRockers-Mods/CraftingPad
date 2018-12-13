package io.github.strikerrocker.craftingstick;

import net.minecraft.container.CraftingTableContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomCraftingTableContainer extends CraftingTableContainer {
    private final BlockPos pos;

    public CustomCraftingTableContainer(PlayerInventory var1, World var2, BlockPos var3) {
        super(var1, var2, var3);
        pos = var3;
    }

    @Override
    public boolean canUse(PlayerEntity var1) {
        return var1.squaredDistanceTo((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
    }
}
