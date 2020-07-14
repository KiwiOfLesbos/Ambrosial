package com.kiwi.ambrosial.items;

import com.kiwi.ambrosial.Ambrosial;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BaseItem extends Item {

    public BaseItem(String name) {
        super(new Properties().group(Ambrosial.TAB));
        this.setRegistryName(new ResourceLocation(Ambrosial.MODID, name));
    }

}
