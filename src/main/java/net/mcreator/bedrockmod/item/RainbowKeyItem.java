
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class RainbowKeyItem extends Item {
	public RainbowKeyItem() {
		super(new Item.Properties().tab(BedrockmodModTabs.TAB_KEYS).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("rainbow_key");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
