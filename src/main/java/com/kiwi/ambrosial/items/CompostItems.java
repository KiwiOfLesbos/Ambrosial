package com.kiwi.ambrosial.items;

import com.kiwi.ambrosial.registry.ModItems;
import net.minecraft.block.ComposterBlock;

public class CompostItems {

    public static void register() {
        ComposterBlock.CHANCES.put(EdibleFoods.TOAST, 0.75f);
    }

}
