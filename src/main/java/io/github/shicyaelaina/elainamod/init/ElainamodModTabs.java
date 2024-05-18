
package io.github.shicyaelaina.elainamod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ElainamodModTabs {
	public static CreativeModeTab TAB_ELAINA_MOD;

	public static void load() {
		TAB_ELAINA_MOD = new CreativeModeTab("tabelaina_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElainamodModItems.CROISSANTBREAD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
