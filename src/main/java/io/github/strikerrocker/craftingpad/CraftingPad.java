package io.github.strikerrocker.craftingpad;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftingPad implements ModInitializer {

    public static final String MODID = "craftingpad";

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MODID, MODID), new ItemCraftingPad(new Item.Settings().group(ItemGroup.MISC)));
        CrowdinTranslate.downloadTranslations(MODID);
    }
}