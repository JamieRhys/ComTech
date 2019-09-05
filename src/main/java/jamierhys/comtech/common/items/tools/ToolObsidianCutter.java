package jamierhys.comtech.common.items.tools;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.common.items.tools.materials.ModMaterials;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.ItemPickaxe;

public class ToolObsidianCutter extends ItemPickaxe {
    public ToolObsidianCutter() {
        super(ModMaterials.ToolMaterialObsidian);

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(1);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "toolObsidianCutter");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "toolObsidianCutter");
    }
}
