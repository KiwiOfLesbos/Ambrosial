package kiwi.ambrosial;

import kiwi.ambrosial.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class AmbrosialItemGroup extends ItemGroup {

    public AmbrosialItemGroup(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.BEETROOT.getItem());
    }

    private void registerCrops(NonNullList<ItemStack> items) {
        items.add(new ItemStack(ModItems.ONION.get()));
    }

}
