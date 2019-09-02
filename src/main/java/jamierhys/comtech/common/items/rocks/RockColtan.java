package jamierhys.comtech.common.items.rocks;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class RockColtan extends Item {
    public RockColtan() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "rock_coltan");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "rock_coltan");
    }
}
