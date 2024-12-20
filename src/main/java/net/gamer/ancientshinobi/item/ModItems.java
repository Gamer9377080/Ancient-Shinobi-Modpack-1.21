package net.gamer.ancientshinobi.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gamer.ancientshinobi.AncientShinobi;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAWRUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item CUTRUBY = registerItem("cut_ruby", new Item(new Item.Settings()));
    public static final Item RAWSAPPHIRE = registerItem("raw_sapphire", new Item(new Item.Settings()));
    public static final Item CUTSAPPHIRE = registerItem("cut_sapphire", new Item(new Item.Settings()));
    public static final Item RAWTOPAZ = registerItem("raw_topaz", new Item(new Item.Settings()));
    public static final Item CUTTOPAZ = registerItem("cut_topaz", new Item(new Item.Settings()));
    public static final Item RAWPLATINUM = registerItem("raw_platinum", new Item(new Item.Settings()));
    public static final Item PLATINUMINGOT = registerItem("platinum_ingot", new Item(new Item.Settings()));
    public static final Item RAWJADE = registerItem("raw_jade", new Item(new Item.Settings()));
    public static final Item CUTJADE = registerItem("cut_jade", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(AncientShinobi.MOD_ID,name),item);
    }

    public static void registerModItems(){
        AncientShinobi.LOGGER.info("Mod Items Registered" + AncientShinobi.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(RAWRUBY);
           entries.add(CUTRUBY);
            entries.add(RAWSAPPHIRE);
            entries.add(CUTSAPPHIRE);
            entries.add(RAWTOPAZ);
            entries.add(CUTTOPAZ);
            entries.add(RAWPLATINUM);
            entries.add(PLATINUMINGOT);
            entries.add(RAWJADE);
            entries.add(CUTJADE);
        });
    }
}
