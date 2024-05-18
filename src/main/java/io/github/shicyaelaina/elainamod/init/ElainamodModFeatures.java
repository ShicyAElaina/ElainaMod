
package io.github.shicyaelaina.elainamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import io.github.shicyaelaina.elainamod.world.features.plants.FlowerontheothersideFeature;
import io.github.shicyaelaina.elainamod.world.features.ores.FaramitaStoneFeature;
import io.github.shicyaelaina.elainamod.world.features.ElainasFeature;
import io.github.shicyaelaina.elainamod.ElainamodMod;

@Mod.EventBusSubscriber
public class ElainamodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ElainamodMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> FLOWERONTHEOTHERSIDE = register("flowerontheotherside", FlowerontheothersideFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, FlowerontheothersideFeature.GENERATE_BIOMES, FlowerontheothersideFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FARAMITA_STONE = register("faramita_stone", FaramitaStoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FaramitaStoneFeature.GENERATE_BIOMES, FaramitaStoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ELAINAS = register("elainas", ElainasFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, ElainasFeature.GENERATE_BIOMES, ElainasFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
