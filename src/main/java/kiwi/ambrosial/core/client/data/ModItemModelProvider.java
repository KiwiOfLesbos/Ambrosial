package kiwi.ambrosial.core.client.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.core.common.item.ItemCrops;
import kiwi.ambrosial.core.common.item.ItemMeals;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

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
        generated(ItemCrops.ONION);

        // Fruits


        // Herbs


        // Snacks


        // Light Meals


        // Meals
        generated(ItemMeals.STEAK_SANDWICH);

        // Hearty Meals

    }

    private String name(IItemProvider item) {
        return item.asItem().getRegistryName().getPath();
    }

    private ResourceLocation itemTexture(IItemProvider item) {
        return modLoc("item/" + name(item));
    }

    private ItemModelBuilder generated(IItemProvider item) {
        return generated(item, itemTexture(item));
    }

    private ItemModelBuilder generated(IItemProvider item, ResourceLocation texture) {
        return getBuilder(name(item)).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", texture);
    }

}
