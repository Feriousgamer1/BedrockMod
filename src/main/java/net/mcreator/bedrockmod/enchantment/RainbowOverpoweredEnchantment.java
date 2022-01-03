
package net.mcreator.bedrockmod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class RainbowOverpoweredEnchantment extends Enchantment {
	public RainbowOverpoweredEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.ARMOR, slots);
	}
}
