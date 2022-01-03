
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.bedrockmod.entity.RainbowBowEntity;
import net.mcreator.bedrockmod.entity.OPCowEntity;
import net.mcreator.bedrockmod.entity.DarkBowEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockmodModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<OPCowEntity> OP_COW = register("op_cow",
			EntityType.Builder.<OPCowEntity>of(OPCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(OPCowEntity::new).fireImmune().sized(0.9f, 1.4f));
	public static final EntityType<RainbowBowEntity> RAINBOW_BOW = register("entitybulletrainbow_bow",
			EntityType.Builder.<RainbowBowEntity>of(RainbowBowEntity::new, MobCategory.MISC).setCustomClientFactory(RainbowBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<DarkBowEntity> DARK_BOW = register("entitybulletdark_bow",
			EntityType.Builder.<DarkBowEntity>of(DarkBowEntity::new, MobCategory.MISC).setCustomClientFactory(DarkBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			OPCowEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(OP_COW, OPCowEntity.createAttributes().build());
	}
}
