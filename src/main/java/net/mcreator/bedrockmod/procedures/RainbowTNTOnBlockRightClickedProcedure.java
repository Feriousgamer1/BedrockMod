package net.mcreator.bedrockmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bedrockmod.init.BedrockmodModItems;

public class RainbowTNTOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == BedrockmodModItems.RAINBOW_FLINT_STEEL) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Explosion.BlockInteraction.BREAK);
		}
	}
}
