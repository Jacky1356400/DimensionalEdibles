package jackyy.dimensionaledibles.registry;

import jackyy.dimensionaledibles.item.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    public static ItemEnderApple enderApple = new ItemEnderApple();
    public static ItemNetherApple netherApple = new ItemNetherApple();
    public static ItemOverworldApple overworldApple = new ItemOverworldApple();
    public static ItemTwilightApple twilightApple = new ItemTwilightApple();
    public static ItemMiningApple miningApple = new ItemMiningApple();
    public static ItemErebusApple erebusApple = new ItemErebusApple();
    public static ItemVoidApple voidApple = new ItemVoidApple();
    public static ItemHuntingApple huntingApple = new ItemHuntingApple();
    public static ItemLostCitiesApple lostcitiesApple = new ItemLostCitiesApple();
    public static ItemCustomApple customApple = new ItemCustomApple();
    public static ItemBlockCustomCake customCake = new ItemBlockCustomCake();

    public static void init(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemBlock(ModBlocks.endCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.endCake.getRegistryName()),
                new ItemBlock(ModBlocks.netherCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.netherCake.getRegistryName()),
                new ItemBlock(ModBlocks.twilightCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.twilightCake.getRegistryName()),
                new ItemBlock(ModBlocks.miningCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.miningCake.getRegistryName()),
                new ItemBlock(ModBlocks.erebusCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.erebusCake.getRegistryName()),
                new ItemBlock(ModBlocks.voidCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.voidCake.getRegistryName()),
                new ItemBlock(ModBlocks.huntingCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.huntingCake.getRegistryName()),
                new ItemBlock(ModBlocks.lostcitiesCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.lostcitiesCake.getRegistryName()),
                new ItemBlock(ModBlocks.overworldCake) {
                    @Override
                    public EnumRarity getRarity(ItemStack stack) {
                        return EnumRarity.EPIC;
                    }
                }.setRegistryName(ModBlocks.overworldCake.getRegistryName()),
                enderApple,
                netherApple,
                overworldApple,
                twilightApple,
                miningApple,
                erebusApple,
                voidApple,
                huntingApple,
                lostcitiesApple,
                customApple
        );
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ModelLoader.setCustomModelResourceLocation(enderApple, 0, new ModelResourceLocation(enderApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(netherApple, 0, new ModelResourceLocation(netherApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(overworldApple, 0, new ModelResourceLocation(overworldApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(twilightApple, 0, new ModelResourceLocation(twilightApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(miningApple, 0, new ModelResourceLocation(miningApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(erebusApple, 0, new ModelResourceLocation(erebusApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(voidApple, 0, new ModelResourceLocation(voidApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(huntingApple, 0, new ModelResourceLocation(huntingApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(lostcitiesApple, 0, new ModelResourceLocation(lostcitiesApple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(customApple, 0, new ModelResourceLocation(customApple.getRegistryName(), "inventory"));
    }

}
