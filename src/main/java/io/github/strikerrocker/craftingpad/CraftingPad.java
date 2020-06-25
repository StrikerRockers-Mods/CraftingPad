package io.github.strikerrocker.craftingpad;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class CraftingPad implements ModInitializer {
    public static Item registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, "craftingpad:" + name, item);
        return item;
    }

    @Override
    public void onInitialize() {
        registerItem(new ItemCraftingPad(new Item.Settings().group(ItemGroup.MISC)), "craftingpad");
    }
}