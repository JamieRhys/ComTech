package jamierhys.comtech.common.items.ingots;

import jamierhys.comtech.common.items.ItemBase;

public class IngotCobalt extends ItemBase {
    public IngotCobalt() {
        super();

        this.setMaxStackSize(64);
        this.registerItem("ingotCobalt");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
