
package io.github.shicyaelaina.elainamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import io.github.shicyaelaina.elainamod.Inception.ElainamodModTabs;

public class DoughItem extends Item {
	public DoughItem() {
		super(new Item.Properties().tab(ElainamodModTabs.TAB_ELAINA_MOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f)

				.build()));
	}
}
