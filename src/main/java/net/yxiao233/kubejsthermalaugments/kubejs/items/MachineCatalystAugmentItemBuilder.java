package net.yxiao233.kubejsthermalaugments.kubejs.items;

import cofh.core.util.helpers.AugmentDataHelper;
import cofh.thermal.lib.common.item.AugmentItem;
import dev.latvian.mods.kubejs.item.ItemBuilder;
import net.minecraft.ChatFormatting;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static cofh.lib.util.constants.NBTTags.*;

public class MachineCatalystAugmentItemBuilder extends ItemBuilder {
    private Rarity rarity = Rarity.EPIC;
    private float catalystUsage;
    private float processEnergy;
    public MachineCatalystAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }

    public MachineCatalystAugmentItemBuilder setRarityById(String rarityName, int chatFormattingId){
        this.rarity = Rarity.create(rarityName, ChatFormatting.getById(chatFormattingId));
        return this;
    }

    public MachineCatalystAugmentItemBuilder setValue(float catalystUsage, float processEnergy){
        this.catalystUsage = catalystUsage;
        this.processEnergy = processEnergy;
        return this;
    }
    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_MACHINE)
                        .mod(TAG_AUGMENT_MACHINE_CATALYST,catalystUsage)
                        .mod(TAG_AUGMENT_MACHINE_ENERGY,processEnergy)
                        .build());
    }
}
