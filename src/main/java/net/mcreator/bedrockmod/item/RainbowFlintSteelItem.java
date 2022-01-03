
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class RainbowFlintSteelItem extends Item {
	public RainbowFlintSteelItem() {
		super(new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("rainbow_flint_steel");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
