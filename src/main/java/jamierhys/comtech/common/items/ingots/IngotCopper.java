package jamierhys.comtech.common.items.ingots;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class IngotCopper extends Item {
    public IngotCopper() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "ingot_copper");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "ingot_copper");
    }
}
