package kiwi.ambrosial.core.registry;

import kiwi.ambrosial.core.common.item.ItemCrops;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FoodRegistry {

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {

        event.getRegistry().register(ItemCrops.ONION);

    }

}
