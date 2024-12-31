package net.yxiao233.kubejsthermalaugments.kubejs.items;

import cofh.core.util.helpers.AugmentDataHelper;
import cofh.thermal.lib.common.item.AugmentItem;
import dev.latvian.mods.kubejs.item.ItemBuilder;
import net.minecraft.ChatFormatting;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static cofh.lib.util.constants.NBTTags.*;
public class FluidTankAugmentItemBuilder extends ItemBuilder {
    private Rarity rarity = Rarity.EPIC;
    private float fluidStorage;
    public FluidTankAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }
    public FluidTankAugmentItemBuilder setRarityById(String rarityName, int chatFormattingId){
        this.rarity = Rarity.create(rarityName, ChatFormatting.getById(chatFormattingId));
        return this;
    }

    public FluidTankAugmentItemBuilder setValue(float fluidStorage){
        this.fluidStorage = fluidStorage;
        return this;
    }

    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_FLUID)
                        .mod(TAG_AUGMENT_FLUID_STORAGE,fluidStorage)
                        .build());
    }
}
