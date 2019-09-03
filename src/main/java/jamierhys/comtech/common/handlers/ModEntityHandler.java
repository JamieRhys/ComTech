package jamierhys.comtech.common.handlers;

import jamierhys.comtech.common.blocks.ModBlocks;
import jamierhys.comtech.common.items.ModItems;
import jamierhys.comtech.main.ComTech;
import net.minecraft.block.Block;
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
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            for(Block block : ModBlocks.BlockMap.values()) {
                event.getRegistry().register(block);

            }
        }

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            for(Item item : ModItems.ItemMap.values()) {
                event.getRegistry().register(item);
            }

            for(Item item : ModBlocks.ItemBlockMap.values()) {
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

            for(Item item : ModBlocks.ItemBlockMap.values()) {
                registerModel(item, 0);
            }
        }

        public static void registerModel(Item item, int meta) {
            int iend = item.getRegistryName().toString().indexOf("_");
            String finalString = iend != -1 ?
                    item.getRegistryName().toString().substring(0, 8) +
                            item.getRegistryName().toString().substring(8, iend) + "s/"  +
                            item.getRegistryName().toString().substring(8) :
                    "";

            ModelLoader.setCustomModelResourceLocation(
                    item,
                    meta,
                    new ModelResourceLocation(finalString, "inventory")
            );
        }
    }
}
