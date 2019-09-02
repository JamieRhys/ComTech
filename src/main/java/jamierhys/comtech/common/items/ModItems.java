package jamierhys.comtech.common.items;

import jamierhys.comtech.common.items.dusts.*;
import jamierhys.comtech.common.items.ingots.*;
import jamierhys.comtech.common.items.rocks.*;
import jamierhys.comtech.common.items.tools.ToolObsidianCutter;
import jamierhys.comtech.common.items.usables.*;
import jamierhys.comtech.main.ComTech;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

import java.util.HashMap;

@ObjectHolder(ComTech.Reference.ModInfo.ModID)
public class ModItems {
    public static HashMap<String, Item> ItemMap = createMap();

    public static final HashMap<String, Item> createMap() {
        HashMap<String, Item> itemMap = new HashMap<>();

        // Dusts
        itemMap.put("dust_alkaline", new DustAlkaline());
        itemMap.put("dust_coal", new DustCoal());
        itemMap.put("dust_cobalt", new DustCobalt());
        itemMap.put("dust_cobaltite", new DustCobaltite());
        itemMap.put("dust_copper", new DustCopper());
        itemMap.put("dust_lithiumChloride", new DustLithiumChloride());
        itemMap.put("dust_potassiumChloride", new DustPotassiumChloride());
        itemMap.put("dust_rareEarth", new DustRareEarth());
        itemMap.put("dust_salt", new DustSalt());
        itemMap.put("dust_sedimentSand", new DustSedimentSand());
        itemMap.put("dust_siliDioxide", new DustSiliDioxide());
        itemMap.put("dust_stone", new DustStone());

        // Ingots
        itemMap.put("ingot_cobalt", new IngotCobalt());
        itemMap.put("ingot_copper", new IngotCopper());
        itemMap.put("ingot_ironCarbide", new IngotIronCarbide());
        itemMap.put("ingot_lithium", new IngotLithium());
        itemMap.put("ingot_steel", new IngotSteel());

        // Rocks
        itemMap.put("rock_coltan", new RockColtan());
        itemMap.put("rock_gadolinite", new RockGadolinite());
        itemMap.put("rock_lodestone", new RockLodestone());
        itemMap.put("rock_monazite", new RockMonazite());
        itemMap.put("rock_neodymium", new RockNeodymium());
        itemMap.put("rock_samarskite", new RockSamarskite());

        // Tools
        itemMap.put("tool_obsidiancutter", new ToolObsidianCutter());

        // Usables
        itemMap.put("usable_alkalinebattery", new UsableAlkalineBattery());
        itemMap.put("usable_alnicomagnet", new UsableAlNiCoMagnet());
        itemMap.put("usable_bunsenburner", new UsableBunsenBurner());
        itemMap.put("usable_emptytt", new UsableEmptyTT());
        itemMap.put("usable_ferritemagnet", new UsableFerriteMagnet());
        itemMap.put("usable_neodymiummagnet", new UsableNeodymiumMagnet());
        itemMap.put("usable_samariumcobaltmagnet", new UsableSamariumCobaltMagnet());

        return itemMap;
    }
}
