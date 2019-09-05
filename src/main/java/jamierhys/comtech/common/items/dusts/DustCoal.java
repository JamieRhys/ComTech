package jamierhys.comtech.common.items.dusts;

import jamierhys.comtech.common.items.ItemBase;

public class DustCoal extends ItemBase {
    public DustCoal() {
        super();

        this.setMaxStackSize(64);
        this.registerItem("dustCoal");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
