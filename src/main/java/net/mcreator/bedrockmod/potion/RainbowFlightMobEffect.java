
package net.mcreator.bedrockmod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RainbowFlightMobEffect extends MobEffect {
	public RainbowFlightMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26368);
		setRegistryName("rainbow_flight");
	}

	@Override
	public String getDescriptionId() {
		return "effect.bedrockmod.rainbow_flight";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
