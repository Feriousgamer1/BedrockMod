
package net.mcreator.bedrockmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bedrockmod.itemgroup.BedrockItemGroup;
import net.mcreator.bedrockmod.block.BedrockBlockBlock;
import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class BedrockPickaxeItem extends BedrockmodModElements.ModElement {
	@ObjectHolder("bedrockmod:bedrock_pickaxe")
	public static final Item block = null;
	public BedrockPickaxeItem(BedrockmodModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 99999f;
			}

			public float getAttackDamage() {
				return 127998f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 100000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BedrockIngotItem.block), new ItemStack(BedrockBlockBlock.block));
			}
		}, 1, 96f, new Item.Properties().group(BedrockItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("bedrock_pickaxe"));
	}
}
