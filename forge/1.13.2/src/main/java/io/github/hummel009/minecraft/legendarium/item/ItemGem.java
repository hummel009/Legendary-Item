package io.github.hummel009.minecraft.legendarium.item;

import io.github.hummel009.minecraft.legendarium.init.ItemGroups;
import net.minecraft.item.Item;

public class ItemGem extends Item {
	public ItemGem() {
		super(new Properties().maxStackSize(1).group(ItemGroups.TAB_ARTIFACTS));
	}
}