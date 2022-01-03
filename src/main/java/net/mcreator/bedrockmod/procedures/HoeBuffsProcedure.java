package net.mcreator.bedrockmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HoeBuffsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.FARMLAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.FARMLAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.FARMLAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.FARMLAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), Blocks.FARMLAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), Blocks.FARMLAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Blocks.FARMLAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), Blocks.FARMLAND.defaultBlockState(), 3);
		}
	}
}
