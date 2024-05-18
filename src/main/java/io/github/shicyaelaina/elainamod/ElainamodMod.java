package io.github.shicyaelaina.elainamod;

import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

import io.github.shicyaelaina.elainamod.init.ElainamodModTabs;
import io.github.shicyaelaina.elainamod.init.ElainamodModItems;
import io.github.shicyaelaina.elainamod.init.ElainamodModFeatures;
import io.github.shicyaelaina.elainamod.init.ElainamodModEntities;
import io.github.shicyaelaina.elainamod.init.ElainamodModBlocks;
import io.github.shicyaelaina.elainamod.init.ElainamodModBiomes;

@Mod("elainamod")
public class ElainamodMod {
	public static final Logger LOGGER = LogManager.getLogger(ElainamodMod.class);
	public static final String MODID = "elainamod";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public ElainamodMod() {
		ElainamodModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ElainamodModBlocks.REGISTRY.register(bus);
		ElainamodModItems.REGISTRY.register(bus);
		ElainamodModEntities.REGISTRY.register(bus);

		ElainamodModFeatures.REGISTRY.register(bus);

		ElainamodModBiomes.REGISTRY.register(bus);

		GeckoLib.initialize();
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
