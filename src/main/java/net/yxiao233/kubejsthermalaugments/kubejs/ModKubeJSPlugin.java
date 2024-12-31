package net.yxiao233.kubejsthermalaugments.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.registry.RegistryInfo;
import net.yxiao233.kubejsthermalaugments.kubejs.items.UpgradeAugmentItemBuilder;

public class ModKubeJSPlugin extends KubeJSPlugin {
    @Override
    public void init() {
        RegistryInfo.ITEM.addType("thermal:upgrade_augment", UpgradeAugmentItemBuilder.class,UpgradeAugmentItemBuilder::new);
    }
}
