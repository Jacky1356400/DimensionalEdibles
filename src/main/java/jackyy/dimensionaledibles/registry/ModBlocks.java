package jackyy.dimensionaledibles.registry;

import jackyy.dimensionaledibles.DimensionalEdibles;
import jackyy.dimensionaledibles.block.BlockCustomCake;
import jackyy.dimensionaledibles.block.BlockEndCake;
import jackyy.dimensionaledibles.block.BlockNetherCake;
import jackyy.dimensionaledibles.block.BlockTwilightCake;
import jackyy.dimensionaledibles.block.BlockMiningCake;
import jackyy.dimensionaledibles.block.BlockErebusCake;
import jackyy.dimensionaledibles.block.BlockVoidCake;
import jackyy.dimensionaledibles.block.BlockHuntingCake;
import jackyy.dimensionaledibles.block.BlockLostCitiesCake;
import jackyy.dimensionaledibles.block.BlockOverworldCake;
import jackyy.dimensionaledibles.block.tile.TileDimensionCake;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	public static BlockEndCake endCake = new BlockEndCake();
	public static BlockNetherCake netherCake = new BlockNetherCake();
	public static BlockOverworldCake overworldCake = new BlockOverworldCake();
	public static BlockTwilightCake twilightCake = new BlockTwilightCake();
	public static BlockMiningCake miningCake = new BlockMiningCake();
	public static BlockErebusCake erebusCake = new BlockErebusCake();
	public static BlockVoidCake voidCake = new BlockVoidCake();
	public static BlockHuntingCake huntingCake = new BlockHuntingCake();
	public static BlockLostCitiesCake lostcitiesCake = new BlockLostCitiesCake();
	public static BlockCustomCake customCake = new BlockCustomCake();

<<<<<<< HEAD
	public static void init(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(endCake, netherCake, overworldCake, twilightCake, miningCake, erebusCake, voidCake, huntingCake, lostcitiesCake, customCake);

		GameRegistry.registerTileEntity(TileEntityCustomCake.class, new ResourceLocation(DimensionalEdibles.MODID, "tileChanceCube"));
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		for (int i = 0; i <= 6; i++) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(endCake), i, new ModelResourceLocation(endCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(netherCake), i, new ModelResourceLocation(netherCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(overworldCake), i, new ModelResourceLocation(overworldCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(twilightCake), i, new ModelResourceLocation(twilightCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(miningCake), i, new ModelResourceLocation(miningCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(erebusCake), i, new ModelResourceLocation(erebusCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(voidCake), i, new ModelResourceLocation(voidCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(huntingCake), i, new ModelResourceLocation(huntingCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(lostcitiesCake), i, new ModelResourceLocation(lostcitiesCake.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(customCake), i, new ModelResourceLocation(customCake.getRegistryName(), "inventory"));
		}
	}
=======
    public static void init(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(endCake, netherCake, overworldCake, customCake);
        GameRegistry.registerTileEntity(TileDimensionCake.class, new ResourceLocation(DimensionalEdibles.MODID, "tile_dimension_cake"));
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        for (int i = 0; i <= 6; i++) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(endCake), i, new ModelResourceLocation(endCake.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(netherCake), i, new ModelResourceLocation(netherCake.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(overworldCake), i, new ModelResourceLocation(overworldCake.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(customCake), i, new ModelResourceLocation(customCake.getRegistryName(), "inventory"));
        }
    }
>>>>>>> upstream/dev-1.12.2

}
