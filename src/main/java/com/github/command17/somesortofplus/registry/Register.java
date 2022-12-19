package com.github.command17.somesortofplus.registry;

import com.github.command17.somesortofplus.SomeSortOfPlus;
import com.github.command17.somesortofplus.registry.customItems.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class Register {
    public static final Item LUCK_CAT = createItem("luck_cat", SomeSortOfPlus.TAB, new LuckCat(new Item.Settings().rarity(Rarity.RARE).maxCount(1)));

    public static final Item SPEED_NECKLACE = createItem("speed_necklace", SomeSortOfPlus.TAB, new SpeedNecklace(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1)));

    public static final Item HEART_NECKLACE = createItem("heart_necklace", SomeSortOfPlus.TAB, new HeartNecklace(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));

    public static final Item LUCK_CAT_SHARD = createItem("luck_cat_shard", SomeSortOfPlus.TAB, new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(16)));

    public static final Item SPIKE_SHOES = createItem("spike_shoes", SomeSortOfPlus.TAB, new SpikeShoes(new Item.Settings().rarity(Rarity.COMMON).maxCount(1)));

    public static final Item SPEED_SHOES = createItem("speed_shoes", SomeSortOfPlus.TAB, new SpeedShoes(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));

    private static Item createItem(String name, ItemGroup TAB, Item item) {
        Item i = Registry.register(Registries.ITEM, new Identifier(SomeSortOfPlus.MOD_ID, name), item);

        ItemGroupEvents.modifyEntriesEvent(TAB).register(entries -> {entries.add(i);});

        return i;
    }

    public static void registerAll() {}
}
