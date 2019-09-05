package jamierhys.comtech.common.blocks;

import java.util.HashMap;

public class ModBlocks {
    public static final HashMap<String, BlockBase> BlockMap = createMap();

    private static final HashMap<String, BlockBase> createMap() {
        HashMap<String, BlockBase> blockMap = new HashMap<>();

        blockMap.put("oreAluminium", new OreAluminium());
        blockMap.put("oreCobaltite", new OreCobaltite());
        blockMap.put("oreCopper", new OreCopper());
        blockMap.put("oreLanthanide", new OreLanthanide());
        blockMap.put("oreMagnetite", new OreMagnetite());
        blockMap.put("oreRareEarth", new OreRareEarth());
        blockMap.put("oreSedimentSand", new OreSedimentSand());

        return blockMap;
    }
}
