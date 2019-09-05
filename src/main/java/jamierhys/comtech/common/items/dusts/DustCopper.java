package jamierhys.comtech.common.items.dusts;

import jamierhys.comtech.common.items.ItemBase;

public class DustCopper extends ItemBase {
    public DustCopper() {
        super();

        this.setMaxStackSize(64);
        this.registerItem("dustCopper");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
