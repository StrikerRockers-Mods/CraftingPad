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

    private static final Text TITLE = new TranslatableText("container.crafting");

    public ItemCraftingPad(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World var1, PlayerEntity var2, Hand var3) {
        if (!var1.isClient()) {
            var2.openHandledScreen(createScreenHandlerFactory(var1, var2.getBlockPos()));
        }
        return new TypedActionResult<>(ActionResult.PASS, var2.getStackInHand(var3));
    }

    private NamedScreenHandlerFactory createScreenHandlerFactory(World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory(
                (id, playerInv, player) -> new CustomCraftingTableContainer(id, playerInv, ScreenHandlerContext.create(world, pos)),
                TITLE
        );
    }
}