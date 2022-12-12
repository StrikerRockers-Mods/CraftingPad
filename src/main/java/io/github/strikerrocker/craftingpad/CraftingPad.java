package io.github.strikerrocker.craftingpad;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class CraftingPad implements ModInitializer {

    public static final String MODID = "craftingpad";

    @Override
    public void onInitialize() {
        Item PAD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, MODID), new ItemCraftingPad(new Item.Properties().stacksTo(1)));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> entries.accept(PAD));
    }
}