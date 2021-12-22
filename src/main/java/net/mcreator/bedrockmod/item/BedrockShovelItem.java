
package net.mcreator.bedrockmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bedrockmod.itemgroup.RainbowTabItemGroup;
import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class BedrockShovelItem extends BedrockmodModElements.ModElement {
	@ObjectHolder("bedrockmod:bedrock_shovel")
	public static final Item block = null;

	public BedrockShovelItem(BedrockmodModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 127998f;
			}

			public int getHarvestLevel() {
				return 30;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BedrockIngotItem.block));
			}
		}, 1, 16f, new Item.Properties().group(RainbowTabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("bedrock_shovel"));
	}
}
