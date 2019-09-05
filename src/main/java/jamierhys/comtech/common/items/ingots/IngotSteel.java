package jamierhys.comtech.common.items.ingots;

import jamierhys.comtech.common.items.ItemBase;

public class IngotSteel extends ItemBase {
    public IngotSteel() {
        super();

        this.setMaxStackSize(64);
        this.registerItem("ingotSteel");
    }

    @Override
    public boolean registerInOreDict() { return true; }
}
