
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class DarkAxeItem extends AxeItem {
	public DarkAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 100000f;
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
				return Ingredient.EMPTY;
			}
		}, 1, 96f, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
		setRegistryName("dark_axe");
	}
}
