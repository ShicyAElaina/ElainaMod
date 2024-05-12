
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.shicyaelaina.elainamod.Inception;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.shicyaelaina.elainamod.clienta.renderer.MuscleManRenderer;
import io.github.shicyaelaina.elainamod.clienta.renderer.ElainaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElainamodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ElainamodModEntities.ELAINA.get(), ElainaRenderer::new);
		event.registerEntityRenderer(ElainamodModEntities.MUSCLE_MAN.get(), MuscleManRenderer::new);
	}
}
