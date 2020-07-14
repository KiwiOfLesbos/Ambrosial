package com.kiwi.ambrosial;

import com.kiwi.ambrosial.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

@Mod(Ambrosial.MODID)
public class Ambrosial {

    public static final String MODID = "ambrosial";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup ITEM_GROUP = new ItemGroup("ambrosial") {
        public ItemStack createIcon() {
            return new ItemStack(ModItems.toast);
        }
    };

    @Nonnull
    public static ResourceLocation getId(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
