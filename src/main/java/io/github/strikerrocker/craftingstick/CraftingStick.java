package io.github.strikerrocker.craftingstick;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class CraftingStick implements ModInitializer {
    public static Item registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, "craftingpad:" + name, item);
        return item;
    }

    @Override
    public void onInitialize() {
        registerItem(new ItemCraftingStick(new Item.Settings().group(ItemGroup.MISC)), "craftingpad");
    }
}