
package net.mcreator.bedrockmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class BedrockItemGroup extends BedrockmodModElements.ModElement {
	public BedrockItemGroup(BedrockmodModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbedrock") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.BEDROCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
