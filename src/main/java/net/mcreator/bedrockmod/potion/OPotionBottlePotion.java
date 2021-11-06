
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
			super(new EffectInstance(Effects.SPEED, 9999, 3, true, true), new EffectInstance(Effects.HASTE, 9999, 5, false, true),
					new EffectInstance(Effects.INSTANT_HEALTH, 9999, 20, false, true), new EffectInstance(Effects.STRENGTH, 9999, 20, false, true),
					new EffectInstance(Effects.REGENERATION, 9999, 20, false, true), new EffectInstance(Effects.RESISTANCE, 9999, 20, false, true),
					new EffectInstance(Effects.FIRE_RESISTANCE, 9999, 20, false, true),
					new EffectInstance(Effects.WATER_BREATHING, 9999, 20, false, true),
					new EffectInstance(Effects.HEALTH_BOOST, 9999, 20, false, true), new EffectInstance(Effects.ABSORPTION, 9999, 20, false, true),
					new EffectInstance(Effects.LUCK, 9999, 20, false, true), new EffectInstance(Effects.CONDUIT_POWER, 9999, 20, false, true),
					new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 9999, 20, false, true),
					new EffectInstance(Effects.DOLPHINS_GRACE, 9999, 20, false, true));
			setRegistryName("o_potion_bottle");
		}
	}
}
