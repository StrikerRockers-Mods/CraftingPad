package io.github.strikerrocker.craftingpad;


import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemCraftingPad extends Item {

    private static final Component TITLE = Component.translatable("container.crafting");

    public ItemCraftingPad(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            player.openMenu(createScreenHandlerFactory(level, player.getOnPos()));
        }
        return new InteractionResultHolder<>(InteractionResult.PASS, player.getItemInHand(hand));
    }

    private MenuProvider createScreenHandlerFactory(Level level, BlockPos pos) {
        return new SimpleMenuProvider(
                (id, playerInv, player) -> new CustomCraftingTableContainer(id, playerInv, ContainerLevelAccess.create(level, pos)),
                TITLE
        );
    }
}