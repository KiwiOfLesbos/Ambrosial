package kiwi.ambrosial.setup;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler {

    public static void init(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.ONION_CROP.get(), RenderType.getCutout());
    }

}
