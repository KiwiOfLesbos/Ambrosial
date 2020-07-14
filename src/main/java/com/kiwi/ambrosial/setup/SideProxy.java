package com.kiwi.ambrosial.setup;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.items.CompostItems;
import com.kiwi.ambrosial.config.Config;
import com.kiwi.ambrosial.registry.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

public class SideProxy {

    SideProxy() {
        //ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "ambrosial.toml");
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModItems::registerAll);

        //Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("ambrosial.toml").toString());

        MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);

    }

    private static void commonSetup(FMLCommonSetupEvent event) {
        Ambrosial.LOGGER.debug("Common Setup");
        CompostItems.register();
    }

    private static void  serverStarting(FMLServerStartingEvent event){

    }

    static class Client extends SideProxy {
        Client() {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
        }

        private static void clientSetup(FMLClientSetupEvent event) {
        }
    }

    static class Server extends SideProxy {
        Server() {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);
        }

        private static void serverSetup(FMLDedicatedServerSetupEvent event) {

        }
    }

}
