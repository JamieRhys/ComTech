package jamierhys.comtech.common.items.dusts;

import jamierhys.comtech.common.items.ItemBase;

public class DustCobalt extends ItemBase {
    public DustCobalt() {
        super();

        this.setMaxStackSize(64);
        this.registerItem("dustCobalt");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
