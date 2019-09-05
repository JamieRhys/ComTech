package jamierhys.comtech.common.blocks;

import jamierhys.comtech.client.tabs.CreativeTab;
import net.minecraft.block.SoundType;

public class OreAluminium extends BlockBase {
    public OreAluminium() {
        super();

        this.setSoundType(SoundType.STONE);
        this.setResistance(10f);
        this.setHardness(10f);
        this.setHarvestLevel("pickaxe", 3);
        this.registerBlock("oreAluminium");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
