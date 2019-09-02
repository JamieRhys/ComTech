package jamierhys.comtech.common.items.usables;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class UsableNeodymiumMagnet extends Item {
    public UsableNeodymiumMagnet() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "usable_neodymiummagnet");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "usable_neodymiummagnet");
    }
}
