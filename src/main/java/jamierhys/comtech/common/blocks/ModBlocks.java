package jamierhys.comtech.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;

public class ModBlocks {
    public static final HashMap<String, Block> BlockMap = createMap();
    public static final HashMap<String, Item> ItemBlockMap = createItemMap();

    private static final HashMap<String, Block> createMap() {
        HashMap<String, Block> blockMap = new HashMap<>();

        // Ores
        blockMap.put("ore_aluminium", new BlockOreAluminium());
        blockMap.put("ore_cobaltite", new BlockOreCobaltite());
        blockMap.put("ore_copper", new BlockOreCopper());
        blockMap.put("ore_lanthanide", new BlockOreLanthanide());
        blockMap.put("ore_magnetite", new BlockOreMagnetite());
        blockMap.put("ore_rareearth", new BlockOreRareEarth());
        blockMap.put("ore_sedimentsand", new BlockOreSedimentSand());

        return blockMap;
    }

    private static final HashMap<String, Item> createItemMap() {
        HashMap<String, Item> itemMap = new HashMap<>();

        for(Block block : BlockMap.values()) {
            itemMap.put(
                    block.getRegistryName().toString().substring(8),
                    new ItemBlock(block).setRegistryName(block.getRegistryName().toString().substring(8))
            );
        }

        return itemMap;
    }

    public static void registerOreDictionaryEntry(final String name, final Block ore) {
        OreDictionary.registerOre(name.substring(8), ore);
    }
}
