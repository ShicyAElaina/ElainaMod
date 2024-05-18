
package io.github.shicyaelaina.elainamod.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import io.github.shicyaelaina.elainamod.init.ElainamodModTabs;

public class MajobroochItem extends Item implements ICurioItem {
	public MajobroochItem() {
		super(new Item.Properties().tab(ElainamodModTabs.TAB_ELAINA_MOD).stacksTo(1).rarity(Rarity.COMMON));
	}
}
