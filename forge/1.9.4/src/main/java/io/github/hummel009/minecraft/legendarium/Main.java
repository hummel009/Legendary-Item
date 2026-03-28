package io.github.hummel009.minecraft.legendarium;

import io.github.hummel009.minecraft.legendarium.handler.ForgeEventHandler;
import io.github.hummel009.minecraft.legendarium.init.Items;
import io.github.hummel009.minecraft.legendarium.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = "legendarium", useMetadata = true)
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@SidedProxy(clientSide = "io.github.hummel009.minecraft.legendarium.proxy.ClientProxy", serverSide = "io.github.hummel009.minecraft.legendarium.proxy.ServerProxy")
	@SuppressWarnings({"PublicField", "WeakerAccess"})
	public static CommonProxy proxy;

	public Main() {
		EventBus forgeEventBus = MinecraftForge.EVENT_BUS;
		ForgeEventHandler forgeEventHandler = new ForgeEventHandler();
		forgeEventBus.register(forgeEventHandler);
	}

	@Mod.EventHandler
	@SuppressWarnings("MethodMayBeStatic")
	public void preInit(FMLPreInitializationEvent event) {
		Items.preInit();
	}

	@Mod.EventHandler
	@SuppressWarnings("MethodMayBeStatic")
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit();
	}
}