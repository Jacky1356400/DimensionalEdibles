package jackyy.dimensionaledibles.registry;

import jackyy.dimensionaledibles.DimensionalEdibles;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = DimensionalEdibles.MODID, name = "DimensionalEdibles", category = DimensionalEdibles.MODID)
public class ModConfig {


    public static DimensionConfig ender = new DimensionConfig("End", 1, "minecraft:ender_eye");
    public static DimensionConfig erebus = new DimensionConfig("Erebus", 66, "minecraft:rotten_flesh");
    public static DimensionConfig hunting = new DimensionConfig("Hunting", 28885, "minecraft:log");
    public static DimensionConfig lostcities = new DimensionConfig("Lost Cities", 111, "minecraft:wool");
    public static DimensionConfig mining = new DimensionConfig("Mining", -6, "minecraft:iron_ore");
    public static DimensionConfig nether = new DimensionConfig("Nether", -1, "minecraft:obsidian");
    public static DimensionConfig overworld = new DimensionConfig("Overworld", 0, "minecraft:sapling");
    public static DimensionConfig twilight = new DimensionConfig("Twilight", 7, "minecraft:diamond");
    public static DimensionConfig thevoid = new DimensionConfig("Void", 43, "minecraft:ender_pearl");

    public static class DimensionConfig {
        @Config.Comment("This is the label that is shown over the cake in the world.")
        @Config.Name("Label")
        public String name;

        @Config.Comment("Set to true to enable the apple or cake for this dimension.")
        @Config.Name("Enable Apple")
        public boolean enableApple = true;
        @Config.Name("Enable Cake")
        public boolean enableCake = true;


        @Config.Comment("Tweaks can break things.  Do not change unless you know what you're doing!")
        @Config.Name("Dimension ID")
        public Integer dimID;
        @Config.Comment("Cake Fuel is the item that is required to refuel the cake.")
        @Config.Name("Cake Fuel")
        public String fuel;
        @Config.Comment("Determines if the cake needs to be fueled before it can be used.")
        @Config.Name("Pre-Fueled")
        public boolean preFueled = false;
        @Config.Comment("Set to true so when the cake is used, a slice is consumed.  If set to false, the cake must be a full cake to be usable.")
        @Config.Name("Consume Slices")
        public boolean consumeSlices = true;
        @Config.Comment({ "Custom Coordinates will teleport players to this specific location.", "Otherwise, spawn platform will be used by default." })
        @Config.Name("Enable Custom Coordinates")
        public boolean useCustomCoords = false;
        @Config.Name("Custom Coordinates")
        public CustomCoords customCoords = new CustomCoords();

        public static class CustomCoords {
            public double x = 0.0D;
            public double y = 64.0D;
            public double z = 0.0D;
        }
        DimensionConfig(String passedName, int passedID, String passedFuel) {
            this.name = passedName;
            this.dimID = passedID;
            this.fuel = passedFuel;
        }
    }

    public static CustomEdible customEdible = new CustomEdible();
    public static class CustomEdible {
        @Config.Comment("Set to true to enable custom cakes.")
        @Config.Name("Enable Cakes")
        public boolean enableCakes = true;

        @Config.Comment("Set to true to enable custom apples.")
        @Config.Name("Enable Apples")
        public boolean enableApples = true;
        @Config.Comment({
            "Set a list of dimensions to add cakes / apples for.",
            "Format: <Dimension ID>, <Cake / Apple Name>",
            "Example: 0, Overworld",
            "Note: \"Cake\" is automatically appended onto the end of the name for cakes."
        })
        public String[] dimensions = new String[0];
        public CustomCake customCake = new CustomCake();
        public static class CustomCake {
            @Config.Comment("Set to true to make all Custom Cakes pre-fueled upon placed.")
            public boolean preFueled = false;
            @Config.Comment({
                "Set the fuel used by Custom Cakes.",
                "Format: <Dimension ID>, <Fuel Registry Name>",
                "Example: 0, minecraft:apple"
            })
            public String[] fuel = new String[0];
        }
    }

    @Config.Comment("Set to true to disable the activation of vanilla End Portal.")
    public static boolean disableVanillaEndPortal = false;

    @Mod.EventBusSubscriber
    public static class ConfigHolder {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(DimensionalEdibles.MODID)) {
                ConfigManager.sync(DimensionalEdibles.MODID, Config.Type.INSTANCE);
            }
        }
    }

}
