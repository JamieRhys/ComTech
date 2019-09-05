package jamierhys.comtech.common.blocks;

import jamierhys.comtech.client.tabs.CreativeTab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreCopper extends BlockBase {
    public OreCopper() {
        super(Material.ROCK);

        this.setSoundType(SoundType.STONE);
        this.setResistance(9f);
        this.setHardness(8f);
        this.setHarvestLevel("pickaxe", 2);
        this.registerBlock("oreCopper");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
