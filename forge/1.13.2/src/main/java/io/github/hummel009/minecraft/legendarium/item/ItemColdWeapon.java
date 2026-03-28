package io.github.hummel009.minecraft.legendarium.item;

import io.github.hummel009.minecraft.legendarium.init.ItemGroups;
import io.github.hummel009.minecraft.legendarium.material.ToolMaterials;
import net.minecraft.item.ItemSword;

public class ItemColdWeapon extends ItemSword {
	public ItemColdWeapon() {
		super(ToolMaterials.STEEL, 3, -2.4f, new Properties().group(ItemGroups.TAB_ARTIFACTS));
	}
}