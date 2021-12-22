
package net.mcreator.bedrockmod.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OPotionBottlePotion {
	@ObjectHolder("bedrockmod:o_potion_bottle")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.SPEED, 72000, 5, true, true), new EffectInstance(Effects.HASTE, 72000, 10, false, true),
					new EffectInstance(Effects.INSTANT_HEALTH, 72000, 100, false, true),
					new EffectInstance(Effects.STRENGTH, 72000, 255, false, true), new EffectInstance(Effects.REGENERATION, 72000, 255, false, true),
					new EffectInstance(Effects.RESISTANCE, 72000, 255, false, true),
					new EffectInstance(Effects.FIRE_RESISTANCE, 72000, 255, false, true),
					new EffectInstance(Effects.WATER_BREATHING, 72000, 255, false, true),
					new EffectInstance(Effects.HEALTH_BOOST, 72000, 100, false, true), new EffectInstance(Effects.ABSORPTION, 72000, 50, false, true),
					new EffectInstance(Effects.LUCK, 72000, 255, false, true), new EffectInstance(Effects.CONDUIT_POWER, 72000, 255, false, true),
					new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 72000, 255, false, true),
					new EffectInstance(Effects.DOLPHINS_GRACE, 72000, 255, false, true),
					new EffectInstance(Effects.SATURATION, 72000, 255, false, true));
			setRegistryName("o_potion_bottle");
		}
	}
}
