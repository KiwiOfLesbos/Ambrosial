package kiwi.ambrosial.data;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import kiwi.ambrosial.init.ModBlocks;
import kiwi.ambrosial.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootParameterSet;
import net.minecraft.world.storage.loot.LootParameterSets;
import net.minecraft.world.storage.loot.LootTable;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLootTableProvider extends LootTableProvider {

    public ModLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(Blocks::new, LootParameterSets.BLOCK)
        );
    }

    private static class Blocks extends BlockLootTables {

        @Override
        protected void addTables() {

            // Crops
            dropsItem(ModBlocks.ONION_CROP, ModItems.ONION);

        }

        private void dropsSelf(Supplier<? extends Block> block) {
            registerDropSelfLootTable(block.get());
        }

        private void dropsItem(Supplier<? extends Block> block, Supplier<? extends IItemProvider> item) {
            registerLootTable(block.get(), b -> droppingItemWithFortune(b, item.get().asItem()));
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
        }

    }

}
