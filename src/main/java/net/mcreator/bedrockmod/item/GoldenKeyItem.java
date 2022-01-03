
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class GoldenKeyItem extends Item {
	public GoldenKeyItem() {
		super(new Item.Properties().tab(BedrockmodModTabs.TAB_KEYS).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("golden_key");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
