package net.gamer.ancientshinobi.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.gamer.ancientshinobi.AncientShinobi;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final  Block RUBY_BLOCK = registerBlock("ruby_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final  Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final  Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final  Block RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final  Block TOPAZ_BLOCK = registerBlock("topaz_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final  Block RAW_TOPAZ_BLOCK = registerBlock("raw_topaz_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final  Block PLATIUM_BLOCK = registerBlock("platinum_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final  Block RAW_PLATIUM_BLOCK = registerBlock("raw_platinum_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final  Block JADE_BLOCK = registerBlock("jade_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final  Block RAW_JADE_BLOCK = registerBlock("raw_jade_block", new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block){
        registerBlocksItem(name, block);
        return Registry.register(Registries.BLOCK,Identifier.of(AncientShinobi.MOD_ID), block);
    }

    private static void registerBlocksItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(AncientShinobi.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registeringModdedBlocks(){
        AncientShinobi.LOGGER.info("Loading Modded Blocks for" + AncientShinobi.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(ModBlocks.RUBY_BLOCK);
            entries.add(ModBlocks.RAW_RUBY_BLOCK);
            entries.add(ModBlocks.SAPPHIRE_BLOCK);
            entries.add(ModBlocks.RAW_SAPPHIRE_BLOCK);
            entries.add(ModBlocks.TOPAZ_BLOCK);
            entries.add(ModBlocks.RAW_TOPAZ_BLOCK);
            entries.add(ModBlocks.PLATIUM_BLOCK);
            entries.add(ModBlocks.RAW_PLATIUM_BLOCK);
            entries.add(ModBlocks.JADE_BLOCK);
            entries.add(ModBlocks.RAW_JADE_BLOCK);

        });

    }
}
