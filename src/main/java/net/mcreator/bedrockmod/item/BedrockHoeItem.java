
package net.mcreator.bedrockmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.bedrockmod.itemgroup.BedrockItemGroup;
import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class BedrockHoeItem extends BedrockmodModElements.ModElement {
	@ObjectHolder("bedrockmod:bedrock_hoe")
	public static final Item block = null;
	public BedrockHoeItem(BedrockmodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
		}, 0, 6f, new Item.Properties().group(BedrockItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("bedrock_hoe"));
	}
}
