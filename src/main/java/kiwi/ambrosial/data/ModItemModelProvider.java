package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.init.ModItems;
import kiwi.ambrosial.items.FoodsList;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

import java.util.function.Supplier;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Ambrosial.MODID, existingFileHelper);
    }

    @Override
    public String getName() {
        return "Ambrosial Item Models";
    }

    @Override
    protected void registerModels() {

        // Veggies
        generated(ModItems.ONION);

        // Fruits


        // Herbs


        // Snacks


        // Light Meals


        // Meals

        // Hearty Meals

    }

    private String name(Supplier<? extends IItemProvider> item) {
        return item.get().asItem().getRegistryName().getPath();
    }

    private ResourceLocation itemTexture(Supplier<? extends IItemProvider> item) {
        return modLoc("item/" + name(item));
    }

    private ItemModelBuilder generated(Supplier<? extends IItemProvider> item) {
        return generated(item, itemTexture(item));
    }

    private ItemModelBuilder generated(Supplier<? extends IItemProvider> item, ResourceLocation texture) {
        return getBuilder(name(item)).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", texture);
    }

}
