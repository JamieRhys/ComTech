package jamierhys.comtech.common.items.usables;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class UsableBunsenBurner extends Item {
    public UsableBunsenBurner() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "usable_bunsenburner");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "usable_bunsenburner");
    }
}
