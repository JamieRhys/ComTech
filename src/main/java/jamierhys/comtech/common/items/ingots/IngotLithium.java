package jamierhys.comtech.common.items.ingots;

import jamierhys.comtech.common.items.ItemBase;

public class IngotLithium extends ItemBase {
    public IngotLithium() {
        super();

        this.setMaxStackSize(64);
        this.registerItem("ingotLithium");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
