
package net.mcreator.bedrockmod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.bedrockmod.potion.YourAHorriblePersonPotion;
import net.mcreator.bedrockmod.block.EvilBlockBlock;

@BedrockmodModElements.ModElement.Tag
public class EvilPotionBrewingRecipe extends BedrockmodModElements.ModElement {
	public EvilPotionBrewingRecipe(BedrockmodModElements instance) {
		super(instance, 44);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.POTION;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == EvilBlockBlock.block.asItem();
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), YourAHorriblePersonPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
