package kiwi.ambrosial.core.common.data;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;

public class ModLootTableProvider extends LootTableProvider {

    public ModLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    private static class Blocks extends BlockLootTables {

        @Override
        protected void addTables() {

        }

        private void dropsSelf(Block block) {
            registerDropSelfLootTable(block);
        }

    }

}
