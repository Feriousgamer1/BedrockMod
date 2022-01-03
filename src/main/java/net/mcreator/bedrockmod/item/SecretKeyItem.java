
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class SecretKeyItem extends Item {
	public SecretKeyItem() {
		super(new Item.Properties().tab(BedrockmodModTabs.TAB_KEYS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("secret_key");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
