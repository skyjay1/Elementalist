package com.github.qpcrummer.elementalist.util;

import eu.pb4.polymer.api.item.PolymerItem;
import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;

/**
 * @author QPCrummer
 * @since ${version}
 **/
public class ModelledPolymerItem extends Item implements PolymerItem {
    private final PolymerModelData customModelData;

    public ModelledPolymerItem(Settings settings, PolymerModelData customModelData) {
        super(settings);
        this.customModelData = customModelData;
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return customModelData.item();
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return customModelData.value();
    }
}