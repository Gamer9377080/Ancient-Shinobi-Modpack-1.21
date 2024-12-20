package net.gamer.ancientshinobi;

import net.fabricmc.api.ModInitializer;

import net.gamer.ancientshinobi.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AncientShinobi implements ModInitializer {
	public static final String MOD_ID = "ancientshinobi";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}