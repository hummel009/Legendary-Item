package io.github.hummel009.minecraft.legendarium.item;

import io.github.hummel009.minecraft.legendarium.init.ItemGroups;
import io.github.hummel009.minecraft.legendarium.init.Materials;
import net.minecraft.item.ItemSword;

public class ItemColdWeapon extends ItemSword {
	public ItemColdWeapon(int id) {
		super(id, Materials.STEEL);
		setCreativeTab(ItemGroups.TAB_ARTIFACTS);
	}
}