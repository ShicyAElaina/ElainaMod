package io.github.shicyaelaina.elainamod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import io.github.shicyaelaina.elainamod.entity.ElainaEntity;

public class ElainaModel extends AnimatedGeoModel<ElainaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ElainaEntity entity) {
		return new ResourceLocation("elainamod", "animations/elaina.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ElainaEntity entity) {
		return new ResourceLocation("elainamod", "geo/elaina.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ElainaEntity entity) {
		return new ResourceLocation("elainamod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
