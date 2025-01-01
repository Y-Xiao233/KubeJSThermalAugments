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

public class UpgradeAugmentItemBuilder extends ItemBuilder {
    private float scaleFactor;
    private Rarity rarity = Rarity.EPIC;
    public UpgradeAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }

    public UpgradeAugmentItemBuilder setValue(float scaleFactor){
        this.scaleFactor = scaleFactor;
        return this;
    }
    public UpgradeAugmentItemBuilder setRarityById(String rarityName, int chatFormattingId){
        this.rarity = Rarity.create(rarityName,ChatFormatting.getById(chatFormattingId));
        return this;
    }
    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity).tab(KubeJS.tab),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_UPGRADE)
                        .mod(TAG_AUGMENT_BASE_MOD,scaleFactor)
                        .build());
    }
}
