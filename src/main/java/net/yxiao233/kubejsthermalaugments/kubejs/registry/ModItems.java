package net.yxiao233.kubejsthermalaugments.kubejs.registry;

import cofh.core.util.helpers.AugmentDataHelper;
import cofh.thermal.lib.common.item.AugmentItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yxiao233.kubejsthermalaugments.Kubejsthermalaugments;

import static cofh.lib.util.constants.NBTTags.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Kubejsthermalaugments.MODID);
    public static int name;
    public static String NAME(){
        name++;
        return String.valueOf(name);
    }
    public static final Item.Properties properties = new Item.Properties().rarity(Rarity.EPIC);
    public static final RegistryObject<Item> UPGRADE_AUGMENT = ITEMS.register(NAME(), () -> new AugmentItem(properties,
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_UPGRADE)
                    .mod(TAG_AUGMENT_BASE_MOD,8F)
                    .build()));


    public static final RegistryObject<Item> SPEED_AUGMENT = ITEMS.register(NAME(), () -> new AugmentItem(properties,
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_MACHINE)
                    .mod(TAG_AUGMENT_MACHINE_POWER,1.15F)
                    .mod(TAG_AUGMENT_MACHINE_ENERGY,1.2F)
                    .build()));
}
