
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.bedrockmod.client.renderer.OPCowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BedrockmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BedrockmodModEntities.OP_COW, OPCowRenderer::new);
		event.registerEntityRenderer(BedrockmodModEntities.RAINBOW_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(BedrockmodModEntities.DARK_BOW, ThrownItemRenderer::new);
	}
}
