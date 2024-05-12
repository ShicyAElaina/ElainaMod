
package io.github.shicyaelaina.elainamod.clienta.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import io.github.shicyaelaina.elainamod.entity.model.ElainaModel;
import io.github.shicyaelaina.elainamod.entity.ElainaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ElainaRenderer extends GeoEntityRenderer<ElainaEntity> {
	public ElainaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ElainaModel());
		this.shadowRadius = 2f;
	}

	@Override
	public RenderType getRenderType(ElainaEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
