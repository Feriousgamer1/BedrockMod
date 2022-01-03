
package net.mcreator.bedrockmod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class DarkArrowItem extends Item {
	public DarkArrowItem() {
		super(new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("dark_arrow");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
