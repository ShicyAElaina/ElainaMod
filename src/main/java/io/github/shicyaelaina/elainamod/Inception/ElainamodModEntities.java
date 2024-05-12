
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.shicyaelaina.elainamod.Inception;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import io.github.shicyaelaina.elainamod.entity.MuscleManEntity;
import io.github.shicyaelaina.elainamod.entity.ElainaEntity;
import io.github.shicyaelaina.elainamod.ElainamodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElainamodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ElainamodMod.MODID);
	public static final RegistryObject<EntityType<ElainaEntity>> ELAINA = register("elaina", EntityType.Builder.<ElainaEntity>of(ElainaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
			.setCustomClientFactory(ElainaEntity::new).fireImmune().sized(1.4000000000000001f, 1.4f));
	public static final RegistryObject<EntityType<MuscleManEntity>> MUSCLE_MAN = register("muscle_man",
			EntityType.Builder.<MuscleManEntity>of(MuscleManEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuscleManEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ElainaEntity.init();
			MuscleManEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ELAINA.get(), ElainaEntity.createAttributes().build());
		event.put(MUSCLE_MAN.get(), MuscleManEntity.createAttributes().build());
	}
}
