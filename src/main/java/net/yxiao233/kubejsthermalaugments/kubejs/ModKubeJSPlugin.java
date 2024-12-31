package net.yxiao233.kubejsthermalaugments.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.registry.RegistryInfo;
import net.yxiao233.kubejsthermalaugments.kubejs.items.*;

public class ModKubeJSPlugin extends KubeJSPlugin {
    @Override
    public void init() {
        RegistryInfo.ITEM.addType("thermal:upgrade_augment", UpgradeAugmentItemBuilder.class,UpgradeAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:machine_speed_augment", MachineSpeedAugmentItemBuilder.class,MachineSpeedAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:machine_efficiency_augment", MachineEfficiencyAugmentItemBuilder.class,MachineEfficiencyAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:rf_coil_xfer_augment", RFCoilXferAugmentItemBuilder.class,RFCoilXferAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:rf_coil_storage_augment", RFCoilStorageAugmentItemBuilder.class,RFCoilStorageAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:rf_coil_augment", RFCoilAugmentItemBuilder.class,RFCoilAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:fluid_tank_augment", FluidTankAugmentItemBuilder.class,FluidTankAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:potion_duration_augment", PotionDurationAugmentItemBuilder.class,PotionDurationAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:potion_amplifier_augment", PotionAmplifierAugmentItemBuilder.class,PotionAmplifierAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:dynamo_fuel_augment", DynamoFuelAugmentItemBuilder.class,DynamoFuelAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:dynamo_output_augment", DynamoOutputAugmentItemBuilder.class,DynamoOutputAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:machine_catalyst_augment", MachineCatalystAugmentItemBuilder.class,MachineCatalystAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:machine_output_augment", MachineOutputAugmentItemBuilder.class,MachineOutputAugmentItemBuilder::new);
        RegistryInfo.ITEM.addType("thermal:area_radius_augment", AreaRadiusAugmentItemBuilder.class,AreaRadiusAugmentItemBuilder::new);
    }
}
