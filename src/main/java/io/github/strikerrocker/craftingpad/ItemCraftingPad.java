package io.github.strikerrocker.craftingpad;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemCraftingPad extends Item {

    private static final Text field_17362 = new TranslatableText("container.crafting", new Object[0]);

    public ItemCraftingPad(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World var1, PlayerEntity var2, Hand var3) {
        if (!var1.isClient()) {
            var2.openHandledScreen(method_17454(var1, var2.getBlockPos()));
        }
        return new TypedActionResult<>(ActionResult.PASS, var2.getStackInHand(var3));
    }

    private NamedScreenHandlerFactory method_17454(World world_1, BlockPos blockPos_1) {
        return new SimpleNamedScreenHandlerFactory(
                    (int_1, playerInventory_1, playerEntity_1) 
                -> 
                    new CustomCraftingTableContainer(int_1, playerInventory_1,
                        ScreenHandlerContext.create(world_1, blockPos_1)),
                field_17362
        );
    }
}