
package net.mcreator.bedrockmod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class OPEnchantment extends BedrockmodModElements.ModElement {
	@ObjectHolder("bedrockmod:op")
	public static final Enchantment enchantment = null;
	public OPEnchantment(BedrockmodModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("op"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEARABLE, slots);
		}

		@Override
		public int getMinLevel() {
			return 30;
		}

		@Override
		public int getMaxLevel() {
			return 1000;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 100;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
