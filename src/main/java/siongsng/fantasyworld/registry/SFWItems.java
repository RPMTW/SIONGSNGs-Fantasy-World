package siongsng.fantasyworld.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import siongsng.fantasyworld.SIONGSNGsFantasyWorld;

public class SFWItems {
    public static Item siongsng_crystal = new Item(new FabricItemSettings().group(ItemGroup.DECORATIONS));;

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(SIONGSNGsFantasyWorld.ModID, "siongsng_crystal"), siongsng_crystal);
    }
}
