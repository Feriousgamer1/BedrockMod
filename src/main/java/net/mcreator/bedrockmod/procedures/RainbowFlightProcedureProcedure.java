package net.mcreator.bedrockmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bedrockmod.init.BedrockmodModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RainbowFlightProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = ((entity instanceof LivingEntity _livEnt
						? _livEnt.hasEffect(BedrockmodModMobEffects.RAINBOW_FLIGHT)
						: false) == true);
				_player.onUpdateAbilities();
			}
		}
	}
}
