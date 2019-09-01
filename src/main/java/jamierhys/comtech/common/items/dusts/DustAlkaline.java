package jamierhys.comtech.common.items.dusts;

import jamierhys.comtech.main.ComTech;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DustAlkaline extends Item {
    public DustAlkaline() {
        super();

        this.setCreativeTab(CreativeTabs.MISC);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + "dust_alkaline");
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, "dust_alkaline");
    }

    public final String getItemType() { return "dusts"; }
}
