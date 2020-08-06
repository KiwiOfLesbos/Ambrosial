package kiwi.ambrosial.utils;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ForgeTags {

    // General
    public static final Tag<Item> CROPS = tag("crops");

    // Specific
    public static final Tag<Item> CROPS_ONION = tag("crops/onion");


    private static Tag<Item> tag(String path) {
        return new ItemTags.Wrapper(new ResourceLocation("forge", path));
    }
}
