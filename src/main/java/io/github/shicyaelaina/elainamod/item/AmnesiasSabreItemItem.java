
package io.github.shicyaelaina.elainamod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import io.github.shicyaelaina.elainamod.Inception.ElainamodModTabs;

public class AmnesiasSabreItemItem extends SwordItem {
	public AmnesiasSabreItemItem() {
		super(new Tier() {
			public int getUses() {
				return 10086;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 15f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.2f, new Item.Properties().tab(ElainamodModTabs.TAB_ELAINA_MOD));
	}
}
