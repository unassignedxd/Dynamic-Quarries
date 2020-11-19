package com.github.unassignedxd.dynamicquarries.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.List;

public class BlockTest extends Block {

    public BlockTest() {
        super(Properties.create(Material.IRON)
            .sound(SoundType.METAL)
            .hardnessAndResistance(2f));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
        list.add(new TranslationTextComponent("message.blocktest"));
    }
}
