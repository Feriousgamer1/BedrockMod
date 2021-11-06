
package net.mcreator.bedrockmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bedrockmod.itemgroup.BedrockItemGroup;
import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class BedrockSwordItem extends BedrockmodModElements.ModElement {
	@ObjectHolder("bedrockmod:bedrock_sword")
	public static final Item block = null;
	public BedrockSwordItem(BedrockmodModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 127998f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BedrockIngotItem.block));
			}
		}, 3, 16f, new Item.Properties().group(BedrockItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("bedrock_sword"));
	}
}
