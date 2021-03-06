package com.github.unassignedxd.dynamicquarries.common.lib;

import com.github.unassignedxd.dynamicquarries.common.blocks.BlockTest;
import com.github.unassignedxd.dynamicquarries.common.items.ItemTest;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.github.unassignedxd.dynamicquarries.common.lib.ModLib.MOD_ID;

public class ModRegistration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<BlockTest> BLOCK_TEST = BLOCKS.register("blocktest", BlockTest::new);
    public static final RegistryObject<Item> ITEM_BLOCK_TEST = ITEMS.register("blocktest",
            () -> new BlockItem(BLOCK_TEST.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));

    public static final RegistryObject<ItemTest> ITEM_TEST = ITEMS.register("itemtest", ItemTest::new);
}
