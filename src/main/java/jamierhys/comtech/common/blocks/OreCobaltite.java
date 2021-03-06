package jamierhys.comtech.common.blocks;

import jamierhys.comtech.client.tabs.CreativeTab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreCobaltite extends BlockBase {
    public OreCobaltite() {
        super(Material.ROCK);

        this.setSoundType(SoundType.STONE);
        this.setResistance(10f);
        this.setHardness(10f);
        this.setHarvestLevel("pickaxe", 3);
        this.registerBlock("oreCobaltite");
    }
}
