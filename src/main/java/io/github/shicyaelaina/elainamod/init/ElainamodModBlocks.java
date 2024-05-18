
package io.github.shicyaelaina.elainamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import io.github.shicyaelaina.elainamod.block.FlowerontheothersideBlock;
import io.github.shicyaelaina.elainamod.block.FaramitaStoneBlock;
import io.github.shicyaelaina.elainamod.block.FaramitaLeaveBlock;
import io.github.shicyaelaina.elainamod.block.FaramitaGrassblocksBlock;
import io.github.shicyaelaina.elainamod.ElainamodMod;

public class ElainamodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ElainamodMod.MODID);
	public static final RegistryObject<Block> FLOWERONTHEOTHERSIDE = REGISTRY.register("flowerontheotherside", () -> new FlowerontheothersideBlock());
	public static final RegistryObject<Block> FARAMITA_STONE = REGISTRY.register("faramita_stone", () -> new FaramitaStoneBlock());
	public static final RegistryObject<Block> FARAMITA_GRASSBLOCKS = REGISTRY.register("faramita_grassblocks", () -> new FaramitaGrassblocksBlock());
	public static final RegistryObject<Block> FARAMITA_LEAVE = REGISTRY.register("faramita_leave", () -> new FaramitaLeaveBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			FlowerontheothersideBlock.registerRenderLayer();
			FaramitaGrassblocksBlock.registerRenderLayer();
		}
	}
}
