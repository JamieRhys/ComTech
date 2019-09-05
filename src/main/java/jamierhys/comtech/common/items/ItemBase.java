package jamierhys.comtech.common.items;

import jamierhys.comtech.client.tabs.CreativeTab;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super();

        this.setCreativeTab(CreativeTab.CT_TAB);
    }

    public boolean registerInOreDict() { return false; }

    protected void registerItem(final String itemName) {
        this.setUnlocalizedName(ComTech.Reference.Resource.Prefix + itemName);
        this.setRegistryName(ComTech.Reference.ModInfo.ModID, itemName);
    }
}
