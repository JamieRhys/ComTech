package jamierhys.comtech.common.items;

import jamierhys.comtech.common.items.dusts.*;
import jamierhys.comtech.common.items.ingots.IngotCobalt;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(ComTech.Reference.ModInfo.ModID)
public class ModItems {
    public static Item[] ITEMS = {
            // Dusts
            new DustAlkaline(),
            new DustCoal(),
            new DustCobalt(),
            new DustCobaltite(),
            new DustCopper(),
            new DustLithiumChloride(),
            new DustPotassiumChloride(),
            new DustRareEarth(),
            new DustSalt(),
            new DustSedimentSand(),
            new DustSiliDioxide(),
            new DustStone(),

            // Ingots
            new IngotCobalt()
    };
}
