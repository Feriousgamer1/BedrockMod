package net.mcreator.bedrockmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bedrockmod.init.BedrockmodModMobEffects;
import net.mcreator.bedrockmod.init.BedrockmodModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FeatherFlyProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		Player entity = event.getPlayer();
		if (event.getHand() != entity.getUsedItemHand())
			return;
		execute(event, entity);
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BedrockmodModItems.DARK_FEATHER
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == BedrockmodModItems.FLIGHT_FEATHER) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(BedrockmodModMobEffects.RAINBOW_FLIGHT, 6000, 1));
		}
	}
}
