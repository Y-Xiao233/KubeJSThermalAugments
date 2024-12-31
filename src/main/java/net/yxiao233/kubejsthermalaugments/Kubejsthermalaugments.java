package net.yxiao233.kubejsthermalaugments;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Kubejsthermalaugments.MODID)
public class Kubejsthermalaugments {
    public static final String MODID = "kubejsthermalaugments";
    public Kubejsthermalaugments() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        System.out.println("1.19.2-forge");
    }
}
