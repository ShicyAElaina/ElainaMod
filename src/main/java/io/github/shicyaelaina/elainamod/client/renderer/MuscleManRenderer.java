
package io.github.shicyaelaina.elainamod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import io.github.shicyaelaina.elainamod.entity.model.MuscleManModel;
import io.github.shicyaelaina.elainamod.entity.MuscleManEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MuscleManRenderer extends GeoEntityRenderer<MuscleManEntity> {
	public MuscleManRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MuscleManModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(MuscleManEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
