package jamierhys.comtech.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    protected static final String               DUST                = "dusts";
    protected static final String               INGOT               = "ingot";
    protected static final String               ROCK                = "rock";
    protected static final String               USABLES             = "usables";

    public ItemBase(final String itemName, final int stackSize) {
        super();

        this.setCreativeTab(CreativeTabs.MISC);
        this.setUnlocalizedName(itemName);
        this.setMaxStackSize(stackSize);
    }
}
