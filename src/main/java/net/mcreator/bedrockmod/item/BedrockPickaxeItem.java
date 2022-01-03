
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;
import net.mcreator.bedrockmod.init.BedrockmodModItems;
import net.mcreator.bedrockmod.init.BedrockmodModBlocks;

public class BedrockPickaxeItem extends PickaxeItem {
	public BedrockPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 99999f;
			}

			public float getAttackDamageBonus() {
				return 127998f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 100000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BedrockmodModItems.BEDROCK_INGOT), new ItemStack(BedrockmodModBlocks.BEDROCK_BLOCK));
			}
		}, 1, 96f, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
		setRegistryName("bedrock_pickaxe");
	}
}
