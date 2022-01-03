
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;

public class DarkBreakerItem extends PickaxeItem {
	public DarkBreakerItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 128000f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 1200;
			}

			public int getEnchantmentValue() {
				return 1000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, 96f, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB));
		setRegistryName("dark_breaker");
	}
}
