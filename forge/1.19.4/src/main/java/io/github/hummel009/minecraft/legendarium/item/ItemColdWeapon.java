package io.github.hummel009.minecraft.legendarium.item;

import io.github.hummel009.minecraft.legendarium.material.ToolMaterials;
import net.minecraft.world.item.SwordItem;

public class ItemColdWeapon extends SwordItem {
	public ItemColdWeapon() {
		super(ToolMaterials.STEEL, 3, -2.4f, new Properties());
	}
}