package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ModelProvider;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Ambrosial.MODID, existingFileHelper);
    }


    public ExistingFileHelper getExistingFileHelper() {
        return models().existingFileHelper;
    }

    @Override
    public String getName() {
        return "Ambrosial Blockstates/Block Models";
    }

    @Override
    protected void registerStatesAndModels() {

    }

    private String name(Block block) {
        return block.getRegistryName().getPath();
    }

    public ResourceLocation blockTexture(Block block) {
        ResourceLocation base = block.getRegistryName();
        return new ResourceLocation(base.getNamespace(), ModelProvider.BLOCK_FOLDER + "/" + base.getPath());
    }

    private ResourceLocation modBlockLoc(String texture) {

        return modLoc("block/" + texture);
    }

}
