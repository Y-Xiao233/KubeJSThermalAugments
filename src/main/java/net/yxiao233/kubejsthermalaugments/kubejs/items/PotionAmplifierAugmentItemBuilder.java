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

public class PotionAmplifierAugmentItemBuilder extends ItemBuilder {
    private Rarity rarity = Rarity.EPIC;
    private float potionDuration;
    private float potionAmplifier;
    public PotionAmplifierAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }
    public PotionAmplifierAugmentItemBuilder setRarityById(String rarityName, int chatFormattingId){
        this.rarity = Rarity.create(rarityName, ChatFormatting.getById(chatFormattingId));
        return this;
    }

    public PotionAmplifierAugmentItemBuilder setValue(float potionAmplifier, float potionDuration){
        this.potionDuration = potionDuration;
        this.potionAmplifier = potionAmplifier;
        return this;
    }
    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity).tab(KubeJS.tab),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_POTION)
                        .mod(TAG_AUGMENT_POTION_AMPLIFIER,potionAmplifier)
                        .mod(TAG_AUGMENT_POTION_DURATION,potionDuration)
                        .build());
    }
}
