package jamierhys.comtech.common.items.usables;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class UsableAlNiCoMagnet extends Item {
    public UsableAlNiCoMagnet() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "usable_alnicomagnet");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "usable_alnicomagnet");
    }
}
