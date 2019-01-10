package jackyy.dimensionaledibles.registry;

import jackyy.dimensionaledibles.DimensionalEdibles;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = DimensionalEdibles.MODID, name = "DimensionalEdibles", category = DimensionalEdibles.MODID)
public class ModConfig {

	public static Custom custom = new Custom();
	public static class Custom {
		@Config.Comment("Settings for Custom Apples")
		@Config.Name("Enable Custom Apples")
		public boolean enableApple = true;
		@Config.Name("Enable Custom Cakes")
		public boolean enableCake = true;

		@Config.Comment("List of dimensions to make cakes for! Format : <Dimension ID>, <Cake Name> \nNOTE: \"Cake\" or \"Apple\" is auto appended onto the end of the block and item name.")
		public String[] dimensions = new String[0];
	}

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
		@Config.Name("Prefix for Apple and Cake.")
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
		@Config.Comment("When placed, the cake will either be full or empty based on this option.")
		@Config.Name("Full Cake")
		public boolean preFueled = false;
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
