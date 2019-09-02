package jamierhys.comtech.client.tabs;

import jamierhys.comtech.common.items.ModItems;
import jamierhys.comtech.main.ComTech;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab {
    public static final CreativeTabs CT_TAB = new CreativeTabs(ComTech.Reference.ModInfo.ModID) {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(ModItems.ItemMap.get("dust_alkaline")); }
    };
}
