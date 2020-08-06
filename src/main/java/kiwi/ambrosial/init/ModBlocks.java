package kiwi.ambrosial.init;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.blocks.OnionCrop;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ambrosial.MODID);

    // Crops
    public static final RegistryObject<Block> ONION_CROP = BLOCKS.register("onions", () -> new OnionCrop(Block.Properties.from(Blocks.WHEAT)));

}
