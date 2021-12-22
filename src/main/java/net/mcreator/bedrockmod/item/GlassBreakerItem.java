
package net.mcreator.bedrockmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bedrockmod.itemgroup.RainbowTabItemGroup;
import net.mcreator.bedrockmod.BedrockmodModElements;

@BedrockmodModElements.ModElement.Tag
public class GlassBreakerItem extends BedrockmodModElements.ModElement {
	@ObjectHolder("bedrockmod:glass_breaker")
	public static final Item block = null;

	public GlassBreakerItem(BedrockmodModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 128000f;
			}

			public float getAttackDamage() {
				return -2f;
			}

			public int getHarvestLevel() {
				return 1200;
			}

			public int getEnchantability() {
				return 1000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 96f, new Item.Properties().group(RainbowTabItemGroup.tab)) {
		}.setRegistryName("glass_breaker"));
	}
}
