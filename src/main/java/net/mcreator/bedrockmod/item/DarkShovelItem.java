
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class DarkShovelItem extends ShovelItem {
	public DarkShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 30;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, 16f, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
		setRegistryName("dark_shovel");
	}
}
