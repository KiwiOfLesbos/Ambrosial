package kiwi.ambrosial.init;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.items.FoodsList;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ambrosial.MODID);

    // Crops
    public static final RegistryObject<Item> ONION = ITEMS.register("onion", () -> new BlockItem(ModBlocks.ONION_CROP.get(), new Item.Properties().food(FoodsList.ONION).group(Ambrosial.ITEM_GROUP)));

}
