
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.bedrockmod.client.gui.SecretCrateScreen;
import net.mcreator.bedrockmod.client.gui.RainbowCrateGUIScreen;
import net.mcreator.bedrockmod.client.gui.CrateGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BedrockmodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BedrockmodModMenus.CRATE_GUI, CrateGuiScreen::new);
			MenuScreens.register(BedrockmodModMenus.RAINBOW_CRATE_GUI, RainbowCrateGUIScreen::new);
			MenuScreens.register(BedrockmodModMenus.SECRET_CRATE, SecretCrateScreen::new);
		});
	}
}
