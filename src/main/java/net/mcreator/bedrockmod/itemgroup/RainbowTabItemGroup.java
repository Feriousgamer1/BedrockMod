
package net.mcreator.bedrockmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bedrockmod.block.BedrockBlockBlock;
import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class RainbowTabItemGroup extends BedrockmodModElements.ModElement {
	public RainbowTabItemGroup(BedrockmodModElements instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrainbow_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BedrockBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
