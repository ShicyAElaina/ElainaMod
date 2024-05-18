
package io.github.shicyaelaina.elainamod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElainamodModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(16, 16).setRegistryName("elainafront_2"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("elainafront_1"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("elainaside_1"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("elainaside_2"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("elainaside_3"));
		event.getRegistry().register(new Motive(32, 16).setRegistryName("elainawide_1"));
		event.getRegistry().register(new Motive(32, 16).setRegistryName("elainawideflower"));
		event.getRegistry().register(new Motive(32, 16).setRegistryName("elainawidewink"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("elainawink_1"));
	}
}
