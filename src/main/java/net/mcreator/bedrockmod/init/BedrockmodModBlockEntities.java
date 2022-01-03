
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.bedrockmod.block.entity.SecretCrateBoxBlockEntity;
import net.mcreator.bedrockmod.block.entity.RainbowCrateBlockEntity;
import net.mcreator.bedrockmod.block.entity.LockedCrateBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockmodModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> LOCKED_CRATE = register("bedrockmod:locked_crate", BedrockmodModBlocks.LOCKED_CRATE,
			LockedCrateBlockEntity::new);
	public static final BlockEntityType<?> RAINBOW_CRATE = register("bedrockmod:rainbow_crate", BedrockmodModBlocks.RAINBOW_CRATE,
			RainbowCrateBlockEntity::new);
	public static final BlockEntityType<?> SECRET_CRATE_BOX = register("bedrockmod:secret_crate_box", BedrockmodModBlocks.SECRET_CRATE_BOX,
			SecretCrateBoxBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
