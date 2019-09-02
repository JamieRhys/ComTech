package jamierhys.comtech.common.items.usables;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class UsableSamariumCobaltMagnet extends Item {
    public UsableSamariumCobaltMagnet() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "usable_samariumcobaltmagnet");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "usable_samariumcobaltmagnet");
    }
}
