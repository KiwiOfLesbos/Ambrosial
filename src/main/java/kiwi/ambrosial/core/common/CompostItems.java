package kiwi.ambrosial.core.common;

import kiwi.ambrosial.core.common.item.ItemCrops;
import net.minecraft.block.ComposterBlock;

public class CompostItems {

    public static void  register() {

        // Crops
        ComposterBlock.CHANCES.put(ItemCrops.ONION, 0.65f);

        // Meals
    }

}
