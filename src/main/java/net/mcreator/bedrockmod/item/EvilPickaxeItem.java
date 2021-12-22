
package net.mcreator.bedrockmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bedrockmod.itemgroup.EviltabItemGroup;
import net.mcreator.bedrockmod.block.EvilBlockBlock;
import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class EvilPickaxeItem extends BedrockmodModElements.ModElement {
	@ObjectHolder("bedrockmod:evil_pickaxe")
	public static final Item block = null;

	public EvilPickaxeItem(BedrockmodModElements instance) {
		super(instance, 63);
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
				return Ingredient.fromStacks(new ItemStack(EvilBlockBlock.block));
			}
		}, 1, 96f, new Item.Properties().group(EviltabItemGroup.tab)) {
		}.setRegistryName("evil_pickaxe"));
	}
}
