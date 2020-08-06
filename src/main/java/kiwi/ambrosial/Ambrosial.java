package kiwi.ambrosial;

import kiwi.ambrosial.data.ModBlockStateProvider;
import kiwi.ambrosial.data.ModItemModelProvider;
import kiwi.ambrosial.data.ModLootTableProvider;
import kiwi.ambrosial.data.ModRecipeProvider;
import kiwi.ambrosial.init.ModBlocks;
import kiwi.ambrosial.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Ambrosial.MODID)
@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ambrosial {

    public static final String MODID = "ambrosial";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final AmbrosialItemGroup ITEM_GROUP = new AmbrosialItemGroup(Ambrosial.MODID);

    public Ambrosial() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        // General Setup
        modBus.addListener(this::commonSetup);
        modBus.addListener(this::gatherData);

        modBus.addListener(this::imcEnqueue);
        modBus.addListener(this::imcProcess);

        ModItems.ITEMS.register(modBus);
        ModBlocks.BLOCKS.register(modBus);

        MinecraftForge.EVENT_BUS.addListener(this::onServerStarting);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

        Ambrosial.LOGGER.debug("Common Setup");
    }

    private void imcEnqueue(InterModEnqueueEvent event) {
    }

    private void imcProcess(InterModProcessEvent event) {
    }

    private void onServerStarting(FMLServerStartingEvent event) {

    }

    public void gatherData(GatherDataEvent event) {

        DataGenerator gen = event.getGenerator();

        if (event.includeClient()) {
            ModBlockStateProvider blockstates = new ModBlockStateProvider(gen, event.getExistingFileHelper());
            gen.addProvider(blockstates);
            gen.addProvider(new ModItemModelProvider(gen, blockstates.getExistingFileHelper()));
        }

        if (event.includeServer()) {
            gen.addProvider(new ModRecipeProvider(gen));
            gen.addProvider(new ModLootTableProvider(gen));
        }

    }
}
