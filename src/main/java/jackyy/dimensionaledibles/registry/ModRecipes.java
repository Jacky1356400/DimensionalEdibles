package jackyy.dimensionaledibles.registry;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.DimensionManager;

public class ModRecipes {

	public static void init(RegistryEvent.Register<IRecipe> event) {

//Recipes for the Cakes //
		if (ModConfig.ender.enableCake)
			GameRegistry.addShapedRecipe(ModBlocks.endCake.getRegistryName(), null, new ItemStack(ModBlocks.endCake),
					"EEE", "ECE", "EEE", 'E', Items.ENDER_EYE, 'C', Items.CAKE);
		if (ModConfig.nether.enableCake)
			GameRegistry.addShapedRecipe(ModBlocks.netherCake.getRegistryName(), null, new ItemStack(ModBlocks.netherCake),
					"OOO", "OCO", "OOO", 'O', "obsidian", 'C', Items.CAKE);
		if (ModConfig.overworld.enableCake)
			GameRegistry.addShapedRecipe(ModBlocks.overworldCake.getRegistryName(), null, new ItemStack(ModBlocks.overworldCake),
					"SSS", "SCS", "SSS", 'S', "treeSapling", 'C', Items.CAKE);
		if (ModConfig.twilight.enableCake && DimensionManager.isDimensionRegistered(ModConfig.twilight.dimID))
			GameRegistry.addShapedRecipe(ModBlocks.twilightCake.getRegistryName(), null, new ItemStack(ModBlocks.twilightCake),
					"DDD", "DCD", "DDD", 'D', "gemDiamond", 'C', Items.CAKE);
		if (ModConfig.mining.enableCake && DimensionManager.isDimensionRegistered(ModConfig.mining.dimID))
			GameRegistry.addShapedRecipe(ModBlocks.miningCake.getRegistryName(), null, new ItemStack(ModBlocks.miningCake),
					"III", "ICI", "III", 'I', "oreIron", 'C', Items.CAKE);
		if (ModConfig.erebus.enableCake && DimensionManager.isDimensionRegistered(ModConfig.erebus.dimID))
			GameRegistry.addShapedRecipe(ModBlocks.erebusCake.getRegistryName(), null, new ItemStack(ModBlocks.erebusCake),
					"GGG", "GCG", "GGG", 'G', "dustGlowstone", 'C', Items.CAKE);
		if (ModConfig.thevoid.enableCake && DimensionManager.isDimensionRegistered(ModConfig.thevoid.dimID))
			GameRegistry.addShapedRecipe(ModBlocks.voidCake.getRegistryName(), null, new ItemStack(ModBlocks.voidCake),
					"EEE", "ECE", "EEE", 'E', "gemEmerald", 'C', Items.CAKE);
		if (ModConfig.hunting.enableCake && DimensionManager.isDimensionRegistered(ModConfig.hunting.dimID))
			GameRegistry.addShapedRecipe(ModBlocks.huntingCake.getRegistryName(), null, new ItemStack(ModBlocks.huntingCake),
					"LLL", "LCL", "LLL", 'L', "logWood", 'C', Items.CAKE);
		if (ModConfig.lostcities.enableCake && DimensionManager.isDimensionRegistered(ModConfig.lostcities.dimID))
			GameRegistry.addShapedRecipe(ModBlocks.lostcitiesCake.getRegistryName(), null, new ItemStack(ModBlocks.lostcitiesCake),
					"WWW", "WCW", "WWW", 'W', "blockWool", 'C', Items.CAKE);

// Recipes for the Apples //
		if (ModConfig.ender.enableApple)
			GameRegistry.addShapedRecipe(ModItems.enderApple.getRegistryName(), null, new ItemStack(ModItems.enderApple),
					"EEE", "EAE", "EEE", 'E', Items.ENDER_EYE, 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		if (ModConfig.nether.enableApple)
			GameRegistry.addShapedRecipe(ModItems.netherApple.getRegistryName(), null, new ItemStack(ModItems.netherApple),
					"OOO", "OAO", "OOO", 'O', "obsidian", 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		if (ModConfig.overworld.enableApple)
			GameRegistry.addShapedRecipe(ModItems.overworldApple.getRegistryName(), null, new ItemStack(ModItems.overworldApple),
					"SSS", "SAS", "SSS", 'S', "treeSapling", 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		if (ModConfig.twilight.enableApple && DimensionManager.isDimensionRegistered(ModConfig.twilight.dimID))
			GameRegistry.addShapedRecipe(ModItems.twilightApple.getRegistryName(), null, new ItemStack(ModItems.twilightApple),
					"DDD", "DAD", "DDD", 'D', "gemDiamond", 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		if (ModConfig.mining.enableApple && DimensionManager.isDimensionRegistered(ModConfig.mining.dimID))
			GameRegistry.addShapedRecipe(ModItems.miningApple.getRegistryName(), null, new ItemStack(ModItems.miningApple),
					"III", "IAI", "III", 'I', "oreIron", 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		if (ModConfig.erebus.enableApple && DimensionManager.isDimensionRegistered(ModConfig.erebus.dimID))
			GameRegistry.addShapedRecipe(ModItems.erebusApple.getRegistryName(), null, new ItemStack(ModItems.erebusApple),
					"GGG", "GAG", "GGG", 'G', "dustGlowstone", 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		if (ModConfig.thevoid.enableApple && DimensionManager.isDimensionRegistered(ModConfig.thevoid.dimID))
			GameRegistry.addShapedRecipe(ModItems.voidApple.getRegistryName(), null, new ItemStack(ModItems.voidApple),
					"EEE", "EAE", "EEE", 'E', "gemEmerald", 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		if (ModConfig.hunting.enableApple && DimensionManager.isDimensionRegistered(ModConfig.hunting.dimID))
			GameRegistry.addShapedRecipe(ModItems.huntingApple.getRegistryName(), null, new ItemStack(ModItems.huntingApple),
					"LLL", "LAL", "LLL", 'L', "logWood", 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		if (ModConfig.lostcities.enableApple && DimensionManager.isDimensionRegistered(ModConfig.lostcities.dimID))
			GameRegistry.addShapedRecipe(ModItems.lostcitiesApple.getRegistryName(), null, new ItemStack(ModItems.lostcitiesApple),
					"WWW", "WAW", "WWW", 'W', "blockWool", 'A', new ItemStack(Items.GOLDEN_APPLE, 1, 0));
	}

}
