package com.github.command17.somesortofplus.registry;

import com.github.command17.somesortofplus.SomeSortOfPlus;
import com.github.command17.somesortofplus.registry.customItems.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Register {
    public static final Item LUCK_CAT = createItem("luck_cat", new LuckCat(new Item.Settings().group(SomeSortOfPlus.TAB).rarity(Rarity.RARE).maxCount(1)));

    public static final Item SPEED_NECKLACE = createItem("speed_necklace", new SpeedNecklace(new Item.Settings().group(SomeSortOfPlus.TAB).rarity(Rarity.UNCOMMON).maxCount(1)));

    public static final Item HEART_NECKLACE = createItem("heart_necklace", new HeartNecklace(new Item.Settings().group(SomeSortOfPlus.TAB).rarity(Rarity.EPIC).maxCount(1)));

    public static final Item LUCK_CAT_SHARD = createItem("luck_cat_shard", new Item(new Item.Settings().group(SomeSortOfPlus.TAB).rarity(Rarity.UNCOMMON).maxCount(16)));

    public static final Item SPIKE_SHOES = createItem("spike_shoes", new SpikeShoes(new Item.Settings().group(SomeSortOfPlus.TAB).rarity(Rarity.COMMON).maxCount(1)));

    public static final Item SPEED_SHOES = createItem("speed_shoes", new SpeedShoes(new Item.Settings().group(SomeSortOfPlus.TAB).rarity(Rarity.EPIC).maxCount(1)));

    private static Item createItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SomeSortOfPlus.MOD_ID, name), item);
    }

    public static void registerAll() {}
}
