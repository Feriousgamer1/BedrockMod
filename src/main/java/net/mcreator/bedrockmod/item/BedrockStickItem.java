
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class BedrockStickItem extends Item {
	public BedrockStickItem() {
		super(new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("bedrock_stick");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
