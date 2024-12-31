package net.yxiao233.kubejsthermalaugments.kubejs.items;

import cofh.core.util.helpers.AugmentDataHelper;
import cofh.thermal.lib.common.item.AugmentItem;
import dev.latvian.mods.kubejs.item.ItemBuilder;
import net.minecraft.ChatFormatting;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static cofh.lib.util.constants.NBTTags.*;

public class UpgradeAugmentItemBuilder extends ItemBuilder {
    private float tier;
    private Rarity rarity;
    public UpgradeAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }

    public UpgradeAugmentItemBuilder setTier(float tier){
        this.tier = tier;
        return this;
    }
    public UpgradeAugmentItemBuilder setRarityById(String rarityName, int id){
        this.rarity = Rarity.create(rarityName,ChatFormatting.getById(id));
        return this;
    }
    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_UPGRADE)
                        .mod(TAG_AUGMENT_BASE_MOD,tier)
                        .build());
    }
}
