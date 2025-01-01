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

public class RFCoilAugmentItemBuilder extends ItemBuilder {
    private Rarity rarity = Rarity.EPIC;
    private float energyStorage;
    private float energyXfer;
    public RFCoilAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }
    public RFCoilAugmentItemBuilder setRarityById(String rarityName, int chatFormattingId){
        this.rarity = Rarity.create(rarityName, ChatFormatting.getById(chatFormattingId));
        return this;
    }

    public RFCoilAugmentItemBuilder setValue(float energyStorage, float energyXfer){
        this.energyStorage = energyStorage;
        this.energyXfer = energyXfer;
        return this;
    }
    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity).tab(KubeJS.tab),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_RF)
                        .mod(TAG_AUGMENT_RF_STORAGE,energyStorage)
                        .mod(TAG_AUGMENT_RF_XFER,energyXfer)
                        .build());
    }
}
