
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class EvilFlintSteelItem extends Item {
	public EvilFlintSteelItem() {
		super(new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("evil_flint_steel");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
