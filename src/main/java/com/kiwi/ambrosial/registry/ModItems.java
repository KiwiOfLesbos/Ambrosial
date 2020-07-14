package com.kiwi.ambrosial.registry;

import com.google.common.eventbus.Subscribe;
import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.items.EdibleFoods;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Ambrosial.MODID)
@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(EdibleFoods.TOAST);
    }

}
