package com.kiwi.ambrosial.registry;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.items.EdibleFoods;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    // Wheat
    public static Item toast;

    public static void registerAll(RegistryEvent.Register<Item> event) {
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
            return;

        toast = register("toast", new Item((new Item.Properties()).group(Ambrosial.ITEM_GROUP).food(EdibleFoods.TOAST)));

    }

    private static <T extends Item> T register(String name, T item) {
        ResourceLocation id = Ambrosial.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    private static <T extends BlockItem> T register(String name, T block_item) {
        ResourceLocation id = Ambrosial.getId(name);
        block_item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(block_item);
        return block_item;
    }

}
