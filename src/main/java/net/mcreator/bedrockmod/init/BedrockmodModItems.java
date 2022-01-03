
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrockmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bedrockmod.item.WagyuItem;
import net.mcreator.bedrockmod.item.SupeItem;
import net.mcreator.bedrockmod.item.SecretKeyItem;
import net.mcreator.bedrockmod.item.RainbowKeyItem;
import net.mcreator.bedrockmod.item.RainbowFlintSteelItem;
import net.mcreator.bedrockmod.item.RainbowBowItem;
import net.mcreator.bedrockmod.item.RainbowArrowItem;
import net.mcreator.bedrockmod.item.MegaKeyItem;
import net.mcreator.bedrockmod.item.KeyItem;
import net.mcreator.bedrockmod.item.GoldenKeyItem;
import net.mcreator.bedrockmod.item.GlassBreakerItem;
import net.mcreator.bedrockmod.item.FlightFeatherItem;
import net.mcreator.bedrockmod.item.EvilFlintSteelItem;
import net.mcreator.bedrockmod.item.DarkSwordItem;
import net.mcreator.bedrockmod.item.DarkStickItem;
import net.mcreator.bedrockmod.item.DarkShovelItem;
import net.mcreator.bedrockmod.item.DarkPickaxeItem;
import net.mcreator.bedrockmod.item.DarkIngotItem;
import net.mcreator.bedrockmod.item.DarkHoeItem;
import net.mcreator.bedrockmod.item.DarkFeatherItem;
import net.mcreator.bedrockmod.item.DarkBreakerItem;
import net.mcreator.bedrockmod.item.DarkBowItem;
import net.mcreator.bedrockmod.item.DarkAxeItem;
import net.mcreator.bedrockmod.item.DarkArrowItem;
import net.mcreator.bedrockmod.item.DarkArmorItem;
import net.mcreator.bedrockmod.item.BedrockSwordItem;
import net.mcreator.bedrockmod.item.BedrockStickItem;
import net.mcreator.bedrockmod.item.BedrockShovelItem;
import net.mcreator.bedrockmod.item.BedrockPickaxeItem;
import net.mcreator.bedrockmod.item.BedrockIngotItem;
import net.mcreator.bedrockmod.item.BedrockHoeItem;
import net.mcreator.bedrockmod.item.BedrockAxeItem;
import net.mcreator.bedrockmod.item.BedrockArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockmodModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item BEDROCK_INGOT = register(new BedrockIngotItem());
	public static final Item BEDROCK_ORE = register(BedrockmodModBlocks.BEDROCK_ORE, BedrockmodModTabs.TAB_RAINBOW_TAB);
	public static final Item BEDROCK_BLOCK = register(BedrockmodModBlocks.BEDROCK_BLOCK, BedrockmodModTabs.TAB_RAINBOW_TAB);
	public static final Item BEDROCK_PICKAXE = register(new BedrockPickaxeItem());
	public static final Item BEDROCK_AXE = register(new BedrockAxeItem());
	public static final Item BEDROCK_SWORD = register(new BedrockSwordItem());
	public static final Item BEDROCK_SHOVEL = register(new BedrockShovelItem());
	public static final Item BEDROCK_HOE = register(new BedrockHoeItem());
	public static final Item BEDROCK_ARMOR_HELMET = register(new BedrockArmorItem.Helmet());
	public static final Item BEDROCK_ARMOR_CHESTPLATE = register(new BedrockArmorItem.Chestplate());
	public static final Item BEDROCK_ARMOR_LEGGINGS = register(new BedrockArmorItem.Leggings());
	public static final Item BEDROCK_ARMOR_BOOTS = register(new BedrockArmorItem.Boots());
	public static final Item BEDROCK_STICK = register(new BedrockStickItem());
	public static final Item SUPE = register(new SupeItem());
	public static final Item WAGYU = register(new WagyuItem());
	public static final Item OP_COW = register(
			new SpawnEggItem(BedrockmodModEntities.OP_COW, -16776961, -65536, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("op_cow_spawn_egg"));
	public static final Item RAINBOW_ARROW = register(new RainbowArrowItem());
	public static final Item RAINBOW_BOW = register(new RainbowBowItem());
	public static final Item RAINBOW_GLASS = register(BedrockmodModBlocks.RAINBOW_GLASS, BedrockmodModTabs.TAB_RAINBOW_TAB);
	public static final Item GLASS_BREAKER = register(new GlassBreakerItem());
	public static final Item FLIGHT_FEATHER = register(new FlightFeatherItem());
	public static final Item DARK_INGOT = register(new DarkIngotItem());
	public static final Item DARK_ORE = register(BedrockmodModBlocks.DARK_ORE, BedrockmodModTabs.TAB_RAINBOW_TAB);
	public static final Item DARK_BLOCK = register(BedrockmodModBlocks.DARK_BLOCK, BedrockmodModTabs.TAB_RAINBOW_TAB);
	public static final Item DARK_PICKAXE = register(new DarkPickaxeItem());
	public static final Item DARK_AXE = register(new DarkAxeItem());
	public static final Item DARK_SWORD = register(new DarkSwordItem());
	public static final Item DARK_SHOVEL = register(new DarkShovelItem());
	public static final Item DARK_HOE = register(new DarkHoeItem());
	public static final Item DARK_ARMOR_HELMET = register(new DarkArmorItem.Helmet());
	public static final Item DARK_ARMOR_CHESTPLATE = register(new DarkArmorItem.Chestplate());
	public static final Item DARK_ARMOR_LEGGINGS = register(new DarkArmorItem.Leggings());
	public static final Item DARK_ARMOR_BOOTS = register(new DarkArmorItem.Boots());
	public static final Item DARK_STICK = register(new DarkStickItem());
	public static final Item DARK_ARROW = register(new DarkArrowItem());
	public static final Item DARK_BOW = register(new DarkBowItem());
	public static final Item DARK_GLASS = register(BedrockmodModBlocks.DARK_GLASS, BedrockmodModTabs.TAB_RAINBOW_TAB);
	public static final Item DARK_BREAKER = register(new DarkBreakerItem());
	public static final Item DARK_FEATHER = register(new DarkFeatherItem());
	public static final Item LOCKED_CRATE = register(BedrockmodModBlocks.LOCKED_CRATE, BedrockmodModTabs.TAB_KEYS);
	public static final Item KEY = register(new KeyItem());
	public static final Item RAINBOW_CRATE = register(BedrockmodModBlocks.RAINBOW_CRATE, BedrockmodModTabs.TAB_KEYS);
	public static final Item SECRET_KEY = register(new SecretKeyItem());
	public static final Item RAINBOW_KEY = register(new RainbowKeyItem());
	public static final Item SECRET_CRATE_BOX = register(BedrockmodModBlocks.SECRET_CRATE_BOX, BedrockmodModTabs.TAB_KEYS);
	public static final Item GOLDEN_KEY = register(new GoldenKeyItem());
	public static final Item MEGA_KEY = register(new MegaKeyItem());
	public static final Item MEGA_CRATE = register(BedrockmodModBlocks.MEGA_CRATE, BedrockmodModTabs.TAB_KEYS);
	public static final Item CRAFTING_CRATE = register(BedrockmodModBlocks.CRAFTING_CRATE, BedrockmodModTabs.TAB_KEYS);
	public static final Item DARK_TNT = register(BedrockmodModBlocks.DARK_TNT, BedrockmodModTabs.TAB_RAINBOW_TAB);
	public static final Item RAINBOW_TNT = register(BedrockmodModBlocks.RAINBOW_TNT, BedrockmodModTabs.TAB_RAINBOW_TAB);
	public static final Item RAINBOW_FLINT_STEEL = register(new RainbowFlintSteelItem());
	public static final Item EVIL_FLINT_STEEL = register(new EvilFlintSteelItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
