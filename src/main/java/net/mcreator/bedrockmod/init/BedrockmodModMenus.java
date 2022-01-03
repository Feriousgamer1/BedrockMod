
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.bedrockmod.world.inventory.SecretCrateMenu;
import net.mcreator.bedrockmod.world.inventory.RainbowCrateGUIMenu;
import net.mcreator.bedrockmod.world.inventory.CrateGuiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockmodModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CrateGuiMenu> CRATE_GUI = register("crate_gui", (id, inv, extraData) -> new CrateGuiMenu(id, inv, extraData));
	public static final MenuType<RainbowCrateGUIMenu> RAINBOW_CRATE_GUI = register("rainbow_crate_gui",
			(id, inv, extraData) -> new RainbowCrateGUIMenu(id, inv, extraData));
	public static final MenuType<SecretCrateMenu> SECRET_CRATE = register("secret_crate",
			(id, inv, extraData) -> new SecretCrateMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
