
package net.mcreator.bedrockmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.InteractionResult;

import net.mcreator.bedrockmod.procedures.HoeBuffsProcedure;
import net.mcreator.bedrockmod.init.BedrockmodModTabs;
import net.mcreator.bedrockmod.init.BedrockmodModItems;

public class BedrockHoeItem extends HoeItem {
	public BedrockHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 127998f;
			}

			public int getLevel() {
				return 30;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BedrockmodModItems.BEDROCK_INGOT));
			}
		}, 0, 6f, new Item.Properties().tab(BedrockmodModTabs.TAB_RAINBOW_TAB).fireResistant());
		setRegistryName("bedrock_hoe");
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		HoeBuffsProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return retval;
	}
}
