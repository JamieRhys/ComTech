package jamierhys.comtech.common.blocks;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOreCopper extends Block {
    public BlockOreCopper() {
        super(Material.ROCK);

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setSoundType(SoundType.STONE);
        this.setResistance(9f);
        this.setHardness(8f);
        this.setHarvestLevel("pickaxe", 2);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "ore_copper");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "ore_copper");
        ModBlocks.registerOreDictionaryEntry("oreCopper", this);
    }
}
