
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.bedrockmod.block.SecretCrateBoxBlock;
import net.mcreator.bedrockmod.block.RainbowTNTBlock;
import net.mcreator.bedrockmod.block.RainbowGlassBlock;
import net.mcreator.bedrockmod.block.RainbowCrateBlock;
import net.mcreator.bedrockmod.block.MegaCrateBlock;
import net.mcreator.bedrockmod.block.LockedCrateBlock;
import net.mcreator.bedrockmod.block.DarkTNTBlock;
import net.mcreator.bedrockmod.block.DarkOreBlock;
import net.mcreator.bedrockmod.block.DarkGlassBlock;
import net.mcreator.bedrockmod.block.DarkBlockBlock;
import net.mcreator.bedrockmod.block.CraftingCrateBlock;
import net.mcreator.bedrockmod.block.BedrockOreBlock;
import net.mcreator.bedrockmod.block.BedrockBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockmodModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block BEDROCK_ORE = register(new BedrockOreBlock());
	public static final Block BEDROCK_BLOCK = register(new BedrockBlockBlock());
	public static final Block RAINBOW_GLASS = register(new RainbowGlassBlock());
	public static final Block DARK_ORE = register(new DarkOreBlock());
	public static final Block DARK_BLOCK = register(new DarkBlockBlock());
	public static final Block DARK_GLASS = register(new DarkGlassBlock());
	public static final Block LOCKED_CRATE = register(new LockedCrateBlock());
	public static final Block RAINBOW_CRATE = register(new RainbowCrateBlock());
	public static final Block SECRET_CRATE_BOX = register(new SecretCrateBoxBlock());
	public static final Block MEGA_CRATE = register(new MegaCrateBlock());
	public static final Block CRAFTING_CRATE = register(new CraftingCrateBlock());
	public static final Block DARK_TNT = register(new DarkTNTBlock());
	public static final Block RAINBOW_TNT = register(new RainbowTNTBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RainbowGlassBlock.registerRenderLayer();
			DarkGlassBlock.registerRenderLayer();
		}
	}
}
