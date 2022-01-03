
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;
import net.mcreator.bedrockmod.init.BedrockmodModItems;

public class BedrockSwordItem extends SwordItem {
	public BedrockSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 127998f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BedrockmodModItems.BEDROCK_INGOT));
			}
		}, 3, 16f, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
		setRegistryName("bedrock_sword");
	}
}
