package jackyy.dimensionaledibles.compat;

import jackyy.dimensionaledibles.DimensionalEdibles;
import jackyy.dimensionaledibles.registry.ModBlocks;
import jackyy.dimensionaledibles.registry.ModConfig;
import jackyy.dimensionaledibles.registry.ModItems;
import mezz.jei.api.*;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@JEIPlugin
public class JEICompat implements IModPlugin {

    @Override
    public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {
    }

    @Override
    public void registerIngredients(IModIngredientRegistration registry) {
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {
    }

    @Override
    public void register(IModRegistry registry) {
        //End Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.endCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".end_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.ender.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.ender.fuel))))));
        //Nether Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.netherCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".nether_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.nether.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.nether.fuel))))));
        //Overworld Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.overworldCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".overworld_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.overworld.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.overworld.fuel))))));
        //Erebus Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.erebusCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".erebus_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.erebus.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.erebus.fuel))))));
        //Hunting Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.huntingCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".hunting_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.hunting.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.hunting.fuel))))));
        //Lost Cities Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.lostcitiesCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".lostcities_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.lostcities.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.lostcities.fuel))))));
        //Mining Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.miningCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".mining_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.mining.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.mining.fuel))))));
        //Twilight Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.twilightCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".twilight_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.twilight.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.twilight.fuel))))));
        //Void Cake
        registry.addIngredientInfo(new ItemStack(ModBlocks.voidCake), VanillaTypes.ITEM,
                I18n.format(DimensionalEdibles.MODID + ".void_cake.jeidesc",
                        Item.REGISTRY.getObject(new ResourceLocation(ModConfig.thevoid.fuel)).getItemStackDisplayName(
                                new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ModConfig.thevoid.fuel))))));
        //Ender Apple
        registry.addIngredientInfo(new ItemStack(ModItems.enderApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".ender_apple.jeidesc");
        //Nether Apple
        registry.addIngredientInfo(new ItemStack(ModItems.netherApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".nether_apple.jeidesc");
        //Overworld Apple
        registry.addIngredientInfo(new ItemStack(ModItems.overworldApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".overworld_apple.jeidesc");
        //Erebus Apple
        registry.addIngredientInfo(new ItemStack(ModItems.erebusApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".erebus_apple.jeidesc");
        //Hunting Apple
        registry.addIngredientInfo(new ItemStack(ModItems.huntingApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".hunting_apple.jeidesc");
        //Lost Cities Apple
        registry.addIngredientInfo(new ItemStack(ModItems.lostcitiesApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".lostcities_apple.jeidesc");
        //Mining Apple
        registry.addIngredientInfo(new ItemStack(ModItems.miningApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".mining_apple.jeidesc");
        //Twilight Apple
        registry.addIngredientInfo(new ItemStack(ModItems.twilightApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".twilight_apple.jeidesc");
        //Void Apple
        registry.addIngredientInfo(new ItemStack(ModItems.voidApple), VanillaTypes.ITEM,
                DimensionalEdibles.MODID + ".void_apple.jeidesc");
    }

    @Override
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {
    }

}
