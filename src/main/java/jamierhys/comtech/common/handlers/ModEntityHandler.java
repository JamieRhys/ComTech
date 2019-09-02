package jamierhys.comtech.common.handlers;

import jamierhys.comtech.common.items.ModItems;
import jamierhys.comtech.main.ComTech;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;

@ObjectHolder(ComTech.Reference.ModInfo.ModID)
public class ModEntityHandler {
    @Mod.EventBusSubscriber(modid = ComTech.Reference.ModInfo.ModID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            for(Item item : ModItems.ItemMap.values()) {
                event.getRegistry().register(item);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = ComTech.Reference.ModInfo.ModID, value = Side.CLIENT)
    public static class ModelRegistrationHandler {
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            for(Item item : ModItems.ItemMap.values()) {
                registerModel(item, 0);
            }
        }

        public static void registerModel(Item item, int meta) {
            ModelLoader.setCustomModelResourceLocation(
                    item,
                    meta,
                    new ModelResourceLocation(item.getRegistryName(), "inventory")
            );
        }
    }
}
