package com.magnoix.steely;

import com.magnoix.steely.item.ModBlocks;
import com.magnoix.steely.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Steely implements ModInitializer {
	public static final String MOD_ID = "steely";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.initialize();
		ModBlocks.initialize();
	}
}