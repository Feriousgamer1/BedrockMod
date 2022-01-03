
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BedrockmodModTabs {
	public static CreativeModeTab TAB_RAINBOW_TAB;
	public static CreativeModeTab TAB_KEYS;

	public static void load() {
		TAB_RAINBOW_TAB = new CreativeModeTab("tabrainbow_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BedrockmodModBlocks.DARK_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_KEYS = new CreativeModeTab("tabkeys") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BedrockmodModItems.SECRET_KEY);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
