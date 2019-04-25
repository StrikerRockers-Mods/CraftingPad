package io.github.strikerrocker.craftingstick;

import net.minecraft.client.network.ClientDummyContainerProvider;
import net.minecraft.container.BlockContext;
import net.minecraft.container.NameableContainerProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TextComponent;
import net.minecraft.text.TranslatableTextComponent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemCraftingStick extends Item {

    private static final TextComponent field_17362 = new TranslatableTextComponent("container.crafting", new Object[0]);

    public ItemCraftingStick(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World var1, PlayerEntity var2, Hand var3) {
        if (!var1.isClient()) {
            var2.openContainer(method_17454(var1, var2.getBlockPos()));
        }
        return new TypedActionResult<>(ActionResult.PASS, var2.getStackInHand(var3));
    }

    public NameableContainerProvider method_17454(World world_1, BlockPos blockPos_1) {
        return new ClientDummyContainerProvider((int_1, playerInventory_1, playerEntity_1) -> new CustomCraftingTableContainer(int_1, playerInventory_1, BlockContext.create(world_1, blockPos_1)), field_17362);
    }
}