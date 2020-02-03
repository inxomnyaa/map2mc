package eu.jgdi.mc.map2mc.model.minecraft;

import java.util.Map;

import static java.util.Map.entry;

public enum Block {

    DIRT("dirt"),
    STONE("stone"),
    UNKNOWN("gold_block"),
    WATER("water"),
    BEDROCK("bedrock"),
    COAL_ORE("coal_ore"),
    IRON_ORE("iron_ore"),
    GOLD_ORE("gold_ore"),
    DIAMOND_ORE("diamond_ore"),
    EMERALD_ORE("emerald_ore");

    public static String UNDEFINED = "--undefined--";

    public static String AIR = "air";

    private final String blockId;

    Block(String id) {
        this.blockId = id;
    }

    public String getBlockId() {
        return blockId;
    }

    public static final Map<String, Integer> EXPECTED_BLOCK_TYPES = Map.ofEntries(
            entry(UNDEFINED, 1), // do not warn, wenn some mappings are undefined
            entry(AIR, 1), // do not warn, wenn some mappings are undefined
            // Blocks:
            entry("andesite", 1),
            entry("birch_fence", 1),
            entry("birch_planks", 1),
            entry("bricks", 1),
            entry("clay_block", 1),
            entry("coarse_dirt", 1),
            entry("cobblestone", 1),
            entry("cracked_stone_bricks", 1),
            entry("cut_red_sandstone", 1),
            entry("cut_sandstone", 1),
            entry("diorite", 1),
            entry("dirt", 1),
            entry("farmland", 1),
            entry("gold_block", 1),
            entry("granite", 1),
            entry("grass_block", 1),
            entry("grass_path", 1),
            entry("gravel", 1),
            entry("mossy_stone_bricks", 1),
            entry("oak_planks", 1),
            entry("polished_andesite", 1),
            entry("polished_diorite", 1),
            entry("podzol", 1),
            entry("quartz_block", 1),
            entry("quartz_pillar", 1),
            entry("red_sand", 1),
            entry("red_sandstone", 1),
            entry("sand", 1),
            entry("sandstone", 1),
            entry("smooth_quartz", 1),
            entry("smooth_red_sandstone", 1),
            entry("smooth_sandstone", 1),
            entry("snow_block", 1),
            entry("stone", 1),
            entry("stone_bricks", 1),
            entry("water", 1),
            // Concrete:
            entry("white_concrete", 1),
            entry("white_concrete_powder", 1),
            entry("yellow_concrete", 1),
            entry("yellow_concrete_powder", 1),
            entry("black_concrete", 1),
            entry("black_concrete_powder", 1),
            entry("cyan_concrete", 1),
            entry("cyan_concrete_powder", 1),
            entry("gray_concrete", 1),
            entry("gray_concrete_powder", 1),
            entry("green_concrete", 1),
            entry("green_concrete_powder", 1),
            entry("light_blue_concrete", 1),
            entry("light_blue_concrete_powder", 1),
            entry("magenta_concrete", 1),
            entry("magenta_concrete_powder", 1),
            entry("red_concrete", 1),
            entry("red_concrete_powder", 1),

            // Items:
            entry("acacia_sapling", 1),
            entry("azure_bluet", 1),
            entry("allium", 1),
            entry("dandelion", 1),
            entry("cactus", 1),
            entry("bamboo", 1),
            entry("bee_hive", 1),
            entry("bee_nest", 1),
            entry("blue_orchid", 1),
            entry("brain_coral", 1),
            entry("brain_coral_fan", 1),
            entry("brown_mushroom", 1),
            entry("bubble_coral", 1),
            entry("bubble_coral_fan", 1),
            entry("cornflower", 1),
            entry("birch_leaves", 1),
            entry("birch_log", 1),
            entry("birch_sapling", 1),
            entry("campfire", 1),
            entry("cobweb", 1),
            entry("carrots", 1),
            entry("dead_bush", 1),
            entry("dark_oak_leaves", 1),
            entry("dark_oak_log", 1),
            entry("dark_oak_sapling", 1),
            entry("dark_oak_fence", 1),
            entry("fern", 1),
            entry("grass", 1),
            entry("jungle_leaves", 1),
            entry("jungle_log", 1),
            entry("jungle_sapling", 1),
            entry("lantern", 1),
            entry("large_fern", 1),
            entry("lilac", 1),
            entry("lily_of_the_valley", 1),
            entry("melon", 1),
            entry("melon_stem", 1),
            entry("oak_fence", 1),
            entry("oak_leaves", 1),
            entry("oak_log", 1),
            entry("oak_sapling", 1),
            entry("orange_tulip", 1),
            entry("oxeye_daisy", 1),
            entry("pink_tulip", 1),
            entry("peony", 1),
            entry("poppy", 1),
            entry("potatoes", 1),
            entry("pumpkin", 1),
            entry("pumpkin_stem", 1),
            entry("red_mushroom", 1),
            entry("red_tulip", 1),
            entry("redstone_torch", 1),
            entry("rose_bush", 1),
            entry("sugar_cane", 1),
            entry("sea_lantern", 1),
            entry("spruce_log", 1),
            entry("spruce_sapling", 1),
            entry("sweet_berries", 1),
            entry("tall_grass", 1),
            entry("wheat", 1),
            entry("white_tulip", 1),
            entry("wither_rose", 1),

            // water plants and animals
            entry("kelp", 1),
            entry("kelp_plant", 1),
            entry("sea_pickle", 1),
            entry("seagrass", 1),

            // coral
            entry("brain_coral_block", 1),
            entry("bubble_coral_block", 1),
            entry("fire_coral", 1),
            entry("fire_coral_block", 1),
            entry("fire_coral_fan", 1),
            entry("horn_coral", 1),
            entry("horn_coral_block", 1),
            entry("horn_coral_fan", 1),
            entry("tube_coral_block", 1),
            entry("tube_coral_fan", 1)

    );
}
