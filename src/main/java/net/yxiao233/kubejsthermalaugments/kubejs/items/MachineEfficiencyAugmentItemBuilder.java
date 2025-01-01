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
public class MachineEfficiencyAugmentItemBuilder extends ItemBuilder {
    private Rarity rarity = Rarity.EPIC;
    private float basePower;
    private float processEnergy;
    public MachineEfficiencyAugmentItemBuilder(ResourceLocation i) {
        super(i);
    }
    public MachineEfficiencyAugmentItemBuilder setRarityById(String rarityName, int chatFormattingId){
        this.rarity = Rarity.create(rarityName, ChatFormatting.getById(chatFormattingId));
        return this;
    }

    public MachineEfficiencyAugmentItemBuilder setValue(float basePower, float processEnergy){
        this.processEnergy = processEnergy;
        this.basePower = basePower;
        return this;
    }
    @Override
    public Item createObject() {
        return new AugmentItem(new Item.Properties().rarity(rarity).tab(KubeJS.tab),
                AugmentDataHelper.builder()
                        .type(TAG_AUGMENT_TYPE_MACHINE)
                        .mod(TAG_AUGMENT_MACHINE_POWER,basePower)
                        .mod(TAG_AUGMENT_MACHINE_ENERGY,processEnergy)
                        .build());
    }
}
