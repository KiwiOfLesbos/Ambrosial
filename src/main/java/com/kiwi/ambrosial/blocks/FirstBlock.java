package com.kiwi.ambrosial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FirstBlock extends Block {

    public FirstBlock() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(2.0f)
                .harvestTool(ToolType.PICKAXE)

        );
    }

}
