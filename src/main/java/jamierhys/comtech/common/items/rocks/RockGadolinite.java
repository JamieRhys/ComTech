package jamierhys.comtech.common.items.rocks;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class RockGadolinite extends Item {
    public RockGadolinite() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "rock_gadolinite");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "rock_gadolinite");
    }
}
