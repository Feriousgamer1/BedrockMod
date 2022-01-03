
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class WagyuItem extends Item {
	public WagyuItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(1000).saturationMod(1000f).alwaysEat().meat().build()));
		setRegistryName("wagyu");
	}
}
