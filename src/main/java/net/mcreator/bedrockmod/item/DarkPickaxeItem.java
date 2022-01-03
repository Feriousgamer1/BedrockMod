
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class DarkPickaxeItem extends PickaxeItem {
	public DarkPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 99999f;
			}

			public float getAttackDamageBonus() {
				return 98f;
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
		setRegistryName("dark_pickaxe");
	}
}
