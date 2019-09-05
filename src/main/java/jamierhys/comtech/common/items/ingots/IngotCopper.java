package jamierhys.comtech.common.items.ingots;

import jamierhys.comtech.common.items.ItemBase;

public class IngotCopper extends ItemBase {
    public IngotCopper() {
        super();

        this.setMaxStackSize(64);
        this.registerItem("ingotCopper");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
