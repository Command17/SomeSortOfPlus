package com.github.command17.somesortofplus;

import com.github.command17.somesortofplus.registry.Register;
import com.github.command17.somesortofplus.util.LootTableModifier;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class SomeSortOfPlus implements ModInitializer {
	public static String MOD_ID = "somesortofplus";

	@Override
	public void onInitialize() {
		Register.registerAll();
		LootTableModifier.modifyLoots();
	}

	public static ItemGroup TAB = FabricItemGroup.builder(new Identifier(MOD_ID, "tab"))
			.icon(() -> new ItemStack(Register.LUCK_CAT))
			.build();
}
