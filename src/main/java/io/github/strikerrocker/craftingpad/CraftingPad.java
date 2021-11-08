package io.github.strikerrocker.craftingpad;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class CraftingPad implements ModInitializer {

    public static final String MODID = "craftingpad";

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new ResourceLocation(MODID, MODID), new ItemCraftingPad(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }
}