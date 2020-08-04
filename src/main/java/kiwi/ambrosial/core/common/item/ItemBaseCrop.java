package kiwi.ambrosial.core.common.item;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemBaseCrop extends Item {

    public ItemBaseCrop(String name, int hunger, float saturation) {
        super(new Properties().group(Ambrosial.TAB).food(new Food.Builder().saturation(saturation).hunger(hunger).fastToEat().build()));
        this.setRegistryName(new ResourceLocation(Ambrosial.MODID, name));
    }

}
