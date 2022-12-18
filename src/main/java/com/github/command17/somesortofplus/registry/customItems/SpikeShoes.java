package com.github.command17.somesortofplus.registry.customItems;

import com.github.command17.somesortofplus.SomeSortOfPlus;
import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;

import java.util.UUID;

public class SpikeShoes extends TrinketItem {
    public SpikeShoes(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var multiplier = super.getModifiers(stack, slot, entity, uuid);

        multiplier.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uuid, SomeSortOfPlus.MOD_ID + "spike_shoes", 0.05, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        multiplier.put(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, new EntityAttributeModifier(uuid, SomeSortOfPlus.MOD_ID + "spike_shoes", 0.05, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

        return multiplier;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onEquip(stack, slot, entity);
        entity.playSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0f, 1.0f);
    }
}
