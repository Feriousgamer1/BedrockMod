
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockmodModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion O_POTION_BOTTLE = register(new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 72000, 5, true, true),
			new MobEffectInstance(MobEffects.DIG_SPEED, 72000, 10, false, true), new MobEffectInstance(MobEffects.HEAL, 72000, 100, false, true),
			new MobEffectInstance(MobEffects.DAMAGE_BOOST, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.REGENERATION, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.WATER_BREATHING, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.HEALTH_BOOST, 72000, 100, false, true),
			new MobEffectInstance(MobEffects.ABSORPTION, 72000, 50, false, true), new MobEffectInstance(MobEffects.LUCK, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.CONDUIT_POWER, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 72000, 255, false, true),
			new MobEffectInstance(MobEffects.SATURATION, 72000, 255, false, true),
			new MobEffectInstance(BedrockmodModMobEffects.RAINBOW_FLIGHT, 72000, 255, false, true)).setRegistryName("o_potion_bottle"));
	public static final Potion HALF = register(new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 4, false, true),
			new MobEffectInstance(MobEffects.REGENERATION, 3600, 4, false, true),
			new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 4, false, true),
			new MobEffectInstance(MobEffects.ABSORPTION, 3600, 4, false, true)).setRegistryName("half"));
	public static final Potion QUARTER = register(new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 2, false, true),
			new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 2, false, true), new MobEffectInstance(MobEffects.REGENERATION, 1800, 2, false, true),
			new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 2, false, true)).setRegistryName("quarter"));
	public static final Potion THREEQUARTERS = register(new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 7200, 10, false, true),
			new MobEffectInstance(MobEffects.REGENERATION, 7200, 10, false, true),
			new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 10, false, true),
			new MobEffectInstance(MobEffects.ABSORPTION, 7200, 10, false, true),
			new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 7200, 10, false, true)).setRegistryName("threequarters"));
	public static final Potion RAINBOW_FLIGHT_ITEM = register(
			new Potion(new MobEffectInstance(BedrockmodModMobEffects.RAINBOW_FLIGHT, 12000, 2, false, true)).setRegistryName("rainbow_flight_item"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
