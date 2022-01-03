
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class DarkIngotItem extends Item {
	public DarkIngotItem() {
		super(new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("dark_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
