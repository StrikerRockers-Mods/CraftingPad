package io.github.strikerrocker.craftingstick;

import net.minecraft.block.Blocks;
import net.minecraft.container.Container;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
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

    public ItemCraftingStick(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World var1, PlayerEntity var2, Hand var3) {
        if (!var1.isRemote) {
            var2.openContainer(new ContainerProvider(var1, var2.getPos()));
        }
        return new TypedActionResult<>(ActionResult.PASS, var2.getStackInHand(var3));
    }

    public static class ContainerProvider implements net.minecraft.container.ContainerProvider {
        private final World world;
        private final BlockPos pos;

        public ContainerProvider(World var1, BlockPos var2) {
            this.world = var1;
            this.pos = var2;
        }

        public TextComponent getName() {
            return new TranslatableTextComponent(Blocks.CRAFTING_TABLE.getTranslationKey() + ".name", new Object[0]);
        }

        public Container createContainer(PlayerInventory var1, PlayerEntity var2) {
            return new CustomCraftingTableContainer(var1, this.world, this.pos);
        }

        public String getContainerId() {
            return "minecraft:crafting_table";
        }
    }
}