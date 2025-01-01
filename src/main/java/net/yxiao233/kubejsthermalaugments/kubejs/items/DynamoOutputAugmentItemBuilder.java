package net.yxiao233.kubejsthermalaugments.kubejs.items;

import cofh.core.util.helpers.AugmentDataHelper;
import cofh.thermal.lib.item.AugmentItem;
import dev.latvian.mods.kubejs.KubeJS;
import dev.latvian.mods.kubejs.item.ItemBuilder;
import net.minecraft.ChatFormatting;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static cofh.lib.util.constants.NBTTags.*;

public class DynamoOutputAugmentItemBuilder extends ItemBuilder {
    private Rarity rarity = Rarity.EPIC;
    private float fuelEnergy;
    private float maxOutput;
    public DynamoOutputAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }

    public DynamoOutputAugmentItemBuilder setRarityById(String rarityName, int chatFormattingId){
        this.rarity = Rarity.create(rarityName, ChatFormatting.getById(chatFormattingId));
        return this;
    }

    public DynamoOutputAugmentItemBuilder setValue(float fuelEnergy, float maxOutput){
        this.fuelEnergy = fuelEnergy;
        this.maxOutput = maxOutput;
        return this;
    }
    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity).tab(KubeJS.tab),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_DYNAMO)
                        .mod(TAG_AUGMENT_DYNAMO_ENERGY,fuelEnergy)
                        .mod(TAG_AUGMENT_DYNAMO_POWER,maxOutput)
                        .build());
    }
}
