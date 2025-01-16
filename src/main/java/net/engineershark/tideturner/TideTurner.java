package net.engineershark.tideturner;

import net.engineershark.tideturner.block.ModBlocks;
import net.engineershark.tideturner.item.ModItemGroups;
import net.engineershark.tideturner.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// very important comment
public class TideTurner implements ModInitializer {
	public static final String MOD_ID = "tideturner";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 16000);

	}
}