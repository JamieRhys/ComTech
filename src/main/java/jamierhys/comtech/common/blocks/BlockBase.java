package jamierhys.comtech.common.blocks;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
    public BlockBase() {
        this(Material.ROCK);
    }

    public BlockBase(Material materialIn) {
        super(materialIn);
        this.setCreativeTab(CreativeTab.CT_TAB);
    }

    public boolean registerInOreDict() { return false; }

    protected void registerBlock(final String blockName) {
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + blockName);
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, blockName);
    }
}
