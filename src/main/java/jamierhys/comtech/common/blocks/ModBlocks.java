package jamierhys.comtech.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.HashMap;

//  @ObjectHolder(ComTech.Reference.ModInfo.ModID)
public class ModBlocks {
    public static final HashMap<String, Block> BlockMap = createMap();
    public static final HashMap<String, Item> ItemBlockMap = createItemMap();

    private static final HashMap<String, Block> createMap() {
        HashMap<String, Block> blockMap = new HashMap<>();

        // Ores
        blockMap.put("ore_aluminium", new BlockOreAluminium());

        return blockMap;
    }

    private static final HashMap<String, Item> createItemMap() {
        HashMap<String, Item> itemMap = new HashMap<>();

        // Ores
        itemMap.put("ore_aluminium", new ItemBlock(BlockMap.get("ore_aluminium")).setRegistryName("ore_aluminium"));

        for(Block block : BlockMap.values()) {
            //itemMap.put(block.getRegistryName(), new ItemBlock((Block) block.getValue()).setRegistryName((((Block) block.getValue()).getRegistryName())));
            itemMap.put(
                    block.getRegistryName().toString().substring(8),
                    new ItemBlock(block).setRegistryName(block.getRegistryName().toString().substring(8))
            );
        }

        return itemMap;
    }
}
