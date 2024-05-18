
package io.github.shicyaelaina.elainamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import io.github.shicyaelaina.elainamod.init.ElainamodModTabs;

public class ButterItem extends Item {
	public ButterItem() {
		super(new Item.Properties().tab(ElainamodModTabs.TAB_ELAINA_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}
}
