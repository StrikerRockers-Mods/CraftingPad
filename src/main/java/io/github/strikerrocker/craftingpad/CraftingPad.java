package io.github.strikerrocker.craftingpad;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class CraftingPad implements ModInitializer {
    
    public static final String MODID = "craftingpad";

    public static Item registerItem(Item item, String name) {
        Registry.register(Registry.ITEM, MODID + ":" + name, item);
        return item;
    }

    @Override
    public void onInitialize() {
        registerItem(new ItemCraftingPad(new Item.Settings().group(ItemGroup.MISC)), MODID);
        CrowdinTranslate.downloadTranslations(MODID);
    }
}