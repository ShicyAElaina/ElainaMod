
package io.github.shicyaelaina.elainamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import io.github.shicyaelaina.elainamod.item.SlicesofbreadItem;
import io.github.shicyaelaina.elainamod.item.MajobroochItem;
import io.github.shicyaelaina.elainamod.item.ImmortalbloodItem;
import io.github.shicyaelaina.elainamod.item.DoughItem;
import io.github.shicyaelaina.elainamod.item.CroissantbreadItem;
import io.github.shicyaelaina.elainamod.item.CookeddoughItem;
import io.github.shicyaelaina.elainamod.item.ButterItem;
import io.github.shicyaelaina.elainamod.item.AmnesiasSabreItemItem;
import io.github.shicyaelaina.elainamod.ElainamodMod;

public class ElainamodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ElainamodMod.MODID);
	public static final RegistryObject<Item> AMNESIAS_SABRE_ITEM = REGISTRY.register("amnesias_sabre_item", () -> new AmnesiasSabreItemItem());
	public static final RegistryObject<Item> CROISSANTBREAD = REGISTRY.register("croissantbread", () -> new CroissantbreadItem());
	public static final RegistryObject<Item> ELAINA_SPAWN_EGG = REGISTRY.register("elaina_spawn_egg", () -> new ForgeSpawnEggItem(ElainamodModEntities.ELAINA, -3355444, -3355393, new Item.Properties().tab(ElainamodModTabs.TAB_ELAINA_MOD)));
	public static final RegistryObject<Item> FLOWERONTHEOTHERSIDE = block(ElainamodModBlocks.FLOWERONTHEOTHERSIDE, ElainamodModTabs.TAB_ELAINA_MOD);
	public static final RegistryObject<Item> FARAMITA_STONE = block(ElainamodModBlocks.FARAMITA_STONE, ElainamodModTabs.TAB_ELAINA_MOD);
	public static final RegistryObject<Item> FARAMITA_GRASSBLOCKS = block(ElainamodModBlocks.FARAMITA_GRASSBLOCKS, ElainamodModTabs.TAB_ELAINA_MOD);
	public static final RegistryObject<Item> FARAMITA_LEAVE = block(ElainamodModBlocks.FARAMITA_LEAVE, ElainamodModTabs.TAB_ELAINA_MOD);
	public static final RegistryObject<Item> MAJOBROOCH = REGISTRY.register("majobrooch", () -> new MajobroochItem());
	public static final RegistryObject<Item> BUTTER = REGISTRY.register("butter", () -> new ButterItem());
	public static final RegistryObject<Item> DOUGH = REGISTRY.register("dough", () -> new DoughItem());
	public static final RegistryObject<Item> COOKEDDOUGH = REGISTRY.register("cookeddough", () -> new CookeddoughItem());
	public static final RegistryObject<Item> MUSCLE_MAN_SPAWN_EGG = REGISTRY.register("muscle_man_spawn_egg", () -> new ForgeSpawnEggItem(ElainamodModEntities.MUSCLE_MAN, -13108, -39322, new Item.Properties().tab(ElainamodModTabs.TAB_ELAINA_MOD)));
	public static final RegistryObject<Item> SLICESOFBREAD = REGISTRY.register("slicesofbread", () -> new SlicesofbreadItem());
	public static final RegistryObject<Item> IMMORTALBLOOD = REGISTRY.register("immortalblood", () -> new ImmortalbloodItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
