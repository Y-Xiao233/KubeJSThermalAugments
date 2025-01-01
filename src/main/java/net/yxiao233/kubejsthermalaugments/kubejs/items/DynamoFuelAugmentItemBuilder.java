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
public class DynamoFuelAugmentItemBuilder extends ItemBuilder {
    private Rarity rarity = Rarity.EPIC;
    private float fuelEnergy;
    public DynamoFuelAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }

    public DynamoFuelAugmentItemBuilder setRarityById(String rarityName, int chatFormattingId){
        this.rarity = Rarity.create(rarityName, ChatFormatting.getById(chatFormattingId));
        return this;
    }

    public DynamoFuelAugmentItemBuilder setValue(float fuelEnergy){
        this.fuelEnergy = fuelEnergy;
        return this;
    }
    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity).tab(KubeJS.tab),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_DYNAMO)
                        .mod(TAG_AUGMENT_DYNAMO_ENERGY,fuelEnergy)
                        .build());
    }
}
