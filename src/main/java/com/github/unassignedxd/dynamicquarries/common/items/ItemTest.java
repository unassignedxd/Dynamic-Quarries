package com.github.unassignedxd.dynamicquarries.common.items;

import com.github.unassignedxd.dynamicquarries.common.lib.ModSetup;
import net.minecraft.item.Item;

public class ItemTest extends Item {

    public ItemTest() {
        super(new Properties()
            .maxStackSize(8)
            .group(ModSetup.ITEM_GROUP));
    }

}
