package kiwi.ambrosial.core.registry;

import kiwi.ambrosial.core.common.item.ItemCrops;
import kiwi.ambrosial.core.common.item.ItemMeals;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FoodRegistry {

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {

        // Crops
        event.getRegistry().register(ItemCrops.ONION);

        // Snack

        // Light Meal

        // Meal
        event.getRegistry().register(ItemMeals.STEAK_SANDWICH);

        // Hearty Meal

        // Drinks

        // Misc

    }

}
