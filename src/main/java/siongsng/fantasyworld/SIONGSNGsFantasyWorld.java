package siongsng.fantasyworld;

import net.fabricmc.api.ModInitializer;
import siongsng.fantasyworld.registry.SFWItems;

public class SIONGSNGsFantasyWorld implements ModInitializer {
	public static String ModID = "siongsng_fantasy_world";

	@Override
	public void onInitialize() {
		System.out.println("Hello SiongSng World!");

		SFWItems.register();
	}
}