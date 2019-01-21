package jackyy.dimensionaledibles.block;

import jackyy.dimensionaledibles.DimensionalEdibles;
import jackyy.dimensionaledibles.block.tile.TileDimensionCake;
import jackyy.dimensionaledibles.registry.ModConfig;
import jackyy.dimensionaledibles.util.TeleporterHandler;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockErebusCake extends BlockCakeBase implements ITileEntityProvider {
	public ModConfig.DimensionConfig config = ModConfig.erebus;
    public String cakeName = "erebus";

    public BlockErebusCake() {
        super();
        setRegistryName(DimensionalEdibles.MODID + ":" + cakeName + "_cake");
        setTranslationKey(DimensionalEdibles.MODID + "." + cakeName + "_cake");
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        int meta = getMetaFromState(world.getBlockState(pos)) - 1;
        ItemStack stack = player.getHeldItem(hand);
        if (!stack.isEmpty() && stack.getItem() == Item.REGISTRY.getObject(new ResourceLocation(config.fuel))) {
            if (meta >= 0) {
                world.setBlockState(pos, state.withProperty(BITES, meta), 2);
                if (!player.capabilities.isCreativeMode) {
                    stack.shrink(1);
                }
                return true;
            }
        } else {
            if (world.provider.getDimension() != config.dimID) {
                if (!world.isRemote) {
                    if (player.capabilities.isCreativeMode) {
                        teleportPlayer(world, player);
                    } else {
                        consumeCake(world, pos, player);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void teleportPlayer(World world, EntityPlayer player) {
        EntityPlayerMP playerMP = (EntityPlayerMP) player;
        BlockPos coords;
        if (config.useCustomCoords) {
            coords = new BlockPos(config.customCoords.x, config.customCoords.y, config.customCoords.z);
        } else {
            coords = TeleporterHandler.getDimPos(playerMP, config.dimID, player.getPosition());
        }
        TeleporterHandler.updateDimPos(playerMP, world.provider.getDimension(), player.getPosition());
        TeleporterHandler.teleport(playerMP, config.dimID, coords.getX(), coords.getY(), coords.getZ(), playerMP.server.getPlayerList());
    }

    private void consumeCake(World world, BlockPos pos, EntityPlayer player) {
        if (player.canEat(true)) {
            int l = world.getBlockState(pos).getValue(BITES);
            if ((config.consumeSlices && (l < 6)) || (!config.consumeSlices && (l == 0))) {
                player.getFoodStats().addStats(2, 0.1F);
                if (config.consumeSlices) {
                    world.setBlockState(pos, world.getBlockState(pos).withProperty(BITES, l + 1), 3);
                }
                teleportPlayer(world, player);
            }
        }
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        return config.preFueled ? getDefaultState().withProperty(BITES, 0) : getDefaultState().withProperty(BITES, 6);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list) {
        if (config.enableCake)
            list.add(new ItemStack(this));
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileDimensionCake(config.dimID, config.name);
    }

}
