package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.*;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
    }

    private void foodCookingRecipes(String name, IItemProvider ingredient, IItemProvider result, float exp, int time, Consumer<IFinishedRecipe> consumer) {
        String namePrefix = new ResourceLocation(Ambrosial.MODID, name).toString();
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ingredient),
                result, exp, 200)
                .addCriterion(name, InventoryChangeTrigger.Instance.forItems(ingredient))
                .build(consumer);
        CookingRecipeBuilder.cookingRecipe(Ingredient.fromItems(ingredient),
                result, exp, 600, IRecipeSerializer.CAMPFIRE_COOKING)
                .addCriterion(name, InventoryChangeTrigger.Instance.forItems(ingredient))
                .build(consumer, namePrefix + "_from_campfire_cooking");
        CookingRecipeBuilder.cookingRecipe(Ingredient.fromItems(ingredient),
                result, exp, 100, IRecipeSerializer.SMOKING)
                .addCriterion(name, InventoryChangeTrigger.Instance.forItems(ingredient))
                .build(consumer, namePrefix + "_from_smoking");

    }
}
