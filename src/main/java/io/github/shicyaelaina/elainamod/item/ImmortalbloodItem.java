
package io.github.shicyaelaina.elainamod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import io.github.shicyaelaina.elainamod.IF.ImmortalbloodsProcedure;
import io.github.shicyaelaina.elainamod.init.ElainamodModTabs;

public class ImmortalbloodItem extends Item {
	public ImmortalbloodItem() {
		super(new Item.Properties().tab(ElainamodModTabs.TAB_ELAINA_MOD).stacksTo(16).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ImmortalbloodsProcedure.execute(entity);
		return retval;
	}
}
