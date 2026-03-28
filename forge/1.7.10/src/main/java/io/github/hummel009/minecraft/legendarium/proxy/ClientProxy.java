package io.github.hummel009.minecraft.legendarium.proxy;

import io.github.hummel009.minecraft.legendarium.init.Items;
import io.github.hummel009.minecraft.legendarium.renderer.EpicItemRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy implements CommonProxy {
	@Override
	public void onInit() {
		for (Item item : Items.CONTENT) {
			EpicItemRenderer epicItemRenderer = EpicItemRenderer.getRendererIfEpic(item);
			if (epicItemRenderer != null) {
				MinecraftForgeClient.registerItemRenderer(item, epicItemRenderer);
			}
		}
	}
}