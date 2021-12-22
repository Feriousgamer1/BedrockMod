
package net.mcreator.bedrockmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.bedrockmod.itemgroup.EviltabItemGroup;
import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class DemonArrowItem extends BedrockmodModElements.ModElement {
	@ObjectHolder("bedrockmod:demon_arrow")
	public static final Item block = null;

	public DemonArrowItem(BedrockmodModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EviltabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("demon_arrow");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
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
}
