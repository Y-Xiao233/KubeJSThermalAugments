# KubeJS Thermal Augments
- 为热力的各种组件添加了kubejs支持
- 你可以愉快的使用kubejs来注册热力的各种组件!

#### Upgrade Augment ```event.create(id,"thermal:upgrade_augment").setValue(scaleFactor).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(scaleFactor) 设置比例因子
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    scaleFactor:比例[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Machine Speed Augment ```event.create(id,"thermal:machine_speed_augment").setValue(basePower,processEnergy).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(basePower,processEnergy) 设置速度,能量消耗
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    basePower:基础运速[float]
    processEnergy:处理耗能[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Machine Efficiency Augment ```event.create(id,"thermal:machine_efficiency_augment").setValue(basePower,processEnergy).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(basePower,processEnergy) 设置速度,能量消耗
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    basePower:基础运速[float]
    processEnergy:处理耗能[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### RF Coil Xfer Augment ```event.create(id,"thermal:rf_coil_xfer_augment").setValue(energyStorage,energyXfer).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(energyStorage,energyXfer) 设置RF能量,RF传输
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    energyStorage:RF能量[float]
    energyXfer:RF传输[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### RF Coil Storage Augment ```event.create(id,"thermal:rf_coil_storage_augment").setValue(energyStorage,energyXfer).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(energyStorage,energyXfer) 设置RF能量,RF传输
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    energyStorage:RF能量[float]
    energyXfer:RF传输[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### RF Coil Augment ```event.create(id,"thermal:rf_coil_augment").setValue(energyStorage,energyXfer).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(energyStorage,energyXfer) 设置RF能量,RF传输
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    energyStorage:RF能量[float]
    energyXfer:RF传输[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Fluid Tank Augment ```event.create(id,"thermal:fluid_tank_augment").setValue(fluidStorage).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(fluidStorage) 设置储罐容积
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    fluidStorage:储罐容积[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Potion Duration Augment ```event.create(id,"thermal:potion_duration_augment").setValue(potionDuration).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(potionDuration) 设置效果时长
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    potionDuration:效果时长[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Potion Amplifier Augment ```event.create(id,"thermal:potion_amplifier_augment").setValue(potionAmplifier,potionDuration).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(potionAmplifier,potionDuration) 设置药水效果,效果时长
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    potionAmplifier:药水效果[float]
    potionDuration:效果时长[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Dynamo Fuel Augment ```event.create(id,"thermal:dynamo_fuel_augment").setValue(fuelEnergy).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(fuelEnergy) 设置燃料产能
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    fuelEnergy:燃料产能[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Dynamo Output Augment ```event.create(id,"thermal:dynamo_output_augment").setValue(fuelEnergy,maxOutput).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(fuelEnergy,maxOutput) 设置燃料产能,最大输出
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    fuelEnergy:燃料产能[float]
    maxOutput:最大输出[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Machine Catalyst Augment ```event.create(id,"thermal:machine_catalyst_augment").setValue(catalystUsage,processEnergy).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(catalystUsage,processEnergy) 设置催化剂用量,处理耗能
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    catalystUsage:催化剂用量[float]
    processEnergy:处理耗能[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Machine Output Augment ```event.create(id,"thermal:machine_output_augment").setValue(secondaryProduct,processEnergy).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(secondaryProduct,processEnergy) 设置副产物产出,处理耗能
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    secondaryProduct:副产物产出[float]
    processEnergy:处理耗能[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```

#### Area Radius Augment ```event.create(id,"thermal:area_radius_augment").setValue(radius).setRarityById(rarityName,chatFormattingId)```
```
参数详解:
    .setValue(radius) 设置最大半径
    .setRarityById(rarityName,chatFormattingId) 设置稀有度[可选,默认为EPIC]
    
    id:物品id[String]
    radius:最大半径[float]
    rarityName:稀有度名字[String]
    chatFormattingId:文本颜色id[int,范围:0-15]
```