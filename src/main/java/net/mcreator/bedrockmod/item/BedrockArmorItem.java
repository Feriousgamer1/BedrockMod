
package net.mcreator.bedrockmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bedrockmod.init.BedrockmodModTabs;
import net.mcreator.bedrockmod.init.BedrockmodModBlocks;

public abstract class BedrockArmorItem extends ArmorItem {
	public BedrockArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1024;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1024, 1024, 1024, 1024}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BedrockmodModBlocks.BEDROCK_BLOCK));
			}

			@Override
			public String getName() {
				return "bedrock_armor";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends BedrockArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
			setRegistryName("bedrock_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "bedrockmod:textures/models/armor/rainbow_layer_1.png";
		}
	}

	public static class Chestplate extends BedrockArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
			setRegistryName("bedrock_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "bedrockmod:textures/models/armor/rainbow_layer_1.png";
		}
	}

	public static class Leggings extends BedrockArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
			setRegistryName("bedrock_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "bedrockmod:textures/models/armor/rainbow_layer_2.png";
		}
	}

	public static class Boots extends BedrockArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
			setRegistryName("bedrock_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "bedrockmod:textures/models/armor/rainbow_layer_1.png";
		}
	}
}
