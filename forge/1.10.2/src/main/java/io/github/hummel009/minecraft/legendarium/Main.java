package io.github.hummel009.minecraft.legendarium;

import io.github.hummel009.minecraft.legendarium.handler.ForgeEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = "legendarium", useMetadata = true)
@SuppressWarnings("UtilityClassWithPublicConstructor")
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	public Main() {
		EventBus forgeEventBus = MinecraftForge.EVENT_BUS;
		ForgeEventHandler forgeEventHandler = new ForgeEventHandler();
		forgeEventBus.register(forgeEventHandler);
	}
}