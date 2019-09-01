package jamierhys.comtech.common.items.dusts;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class DustSalt extends Item {
    public DustSalt() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "dust_salt");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "dust_salt");
    }
}
