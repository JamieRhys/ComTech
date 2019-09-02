package jamierhys.comtech.common.items.tools.materials;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
    public static final Item.ToolMaterial ToolMaterialObsidian = EnumHelper.addToolMaterial(
            "material_obsidian",
            3,
            4000,
            12f,
            5f,
            10
    );
}
