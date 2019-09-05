package jamierhys.comtech.common.items.dusts;

import jamierhys.comtech.common.items.ItemBase;

public class DustAlkaline extends ItemBase {
    public DustAlkaline() {
        super();

        this.setMaxStackSize(64);
        this.registerItem("dustAlkaline");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
