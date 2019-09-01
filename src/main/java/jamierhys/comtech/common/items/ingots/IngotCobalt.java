package jamierhys.comtech.common.items.ingots;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class IngotCobalt extends Item {
    public IngotCobalt() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "ingot_cobalt");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "ingot_cobalt");
    }
}
