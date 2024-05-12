package io.github.shicyaelaina.elainamod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import io.github.shicyaelaina.elainamod.entity.MuscleManEntity;

public class MuscleManModel extends AnimatedGeoModel<MuscleManEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(MuscleManEntity entity) {
		return new ResourceLocation("elainamod", "animations/muscle_man.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(MuscleManEntity entity) {
		return new ResourceLocation("elainamod", "geo/muscle_man.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(MuscleManEntity entity) {
		return new ResourceLocation("elainamod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
