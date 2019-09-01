package jamierhys.comtech.common.items.dusts;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class DustSiliDioxide extends Item {
    public DustSiliDioxide() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "dust_silidioxide");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "dust_silidioxide");
    }
}
