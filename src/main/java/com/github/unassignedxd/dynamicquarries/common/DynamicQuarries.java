package com.github.unassignedxd.dynamicquarries.common;

import com.github.unassignedxd.dynamicquarries.common.lib.ModLib;
import com.github.unassignedxd.dynamicquarries.common.lib.ModRegistration;
import com.github.unassignedxd.dynamicquarries.common.lib.ModSetup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModLib.MOD_ID)
public class DynamicQuarries {

    private static final Logger LOGGER = LogManager.getLogger();

    public DynamicQuarries(){
        ModRegistration.init();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        LOGGER.info("Dynamic Quarries Initialization Complete!");
    }
}
