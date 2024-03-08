
package com.obscuria.aquamirae.registry;

import com.obscuria.aquamirae.Aquamirae;
import com.obscuria.aquamirae.common.item.*;
import com.obscuria.aquamirae.common.item.armor.AbyssalArmor;
import com.obscuria.aquamirae.common.item.armor.TerribleArmor;
import com.obscuria.aquamirae.common.item.armor.ThreeBoltArmor;
import com.obscuria.aquamirae.compat.curios.item.*;
import com.obscuria.aquamirae.common.item.weapon.*;
import com.obscuria.core.api.registry.RegistryHandler;
import com.obscuria.core.api.registry.RegistrySupplier;
import com.obscuria.core.common.item.ObscureRarity;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import org.jetbrains.annotations.ApiStatus;

import java.util.function.Function;
import java.util.function.Supplier;

@ApiStatus.NonExtendable
public interface AquamiraeItems {
	RegistryHandler<Item> HANDLER = RegistryHandler.create(Registries.ITEM, Aquamirae.MODID);

	RegistrySupplier<Item> RUNE_OF_THE_STORM = simple("rune_of_the_storm", RuneOfTheStormItem::new);
	RegistrySupplier<Item> TERRIBLE_SWORD = simple("terrible_sword", TerribleSword::new);
	RegistrySupplier<Item> DIVIDER = simple("divider", Divider::new);
	RegistrySupplier<Item> FIN_CUTTER = simple("fin_cutter", FinCutter::new);
	RegistrySupplier<Item> REMNANTS_SABER = simple("remnants_saber", RemnantsSaber::new);
	RegistrySupplier<Item> POISONED_BLADE = simple("poisoned_blade", PoisonedBlade::new);
	RegistrySupplier<Item> CORAL_LANCE = simple("coral_lance", CoralLance::new);
	RegistrySupplier<Item> DAGGER_OF_GREED = simple("dagger_of_greed", DaggerOfGreed::new);
	RegistrySupplier<Item> WHISPER_OF_THE_ABYSS = simple("whisper_of_the_abyss", WhisperOfTheAbyss::new);
	RegistrySupplier<Item> SWEET_LANCE = simple("sweet_lance", SweetLance::new);
	RegistrySupplier<Item> TERRIBLE_HELMET = simple("terrible_helmet", TerribleArmor.Helmet::new);
	RegistrySupplier<Item> TERRIBLE_CHESTPLATE = simple("terrible_chestplate", TerribleArmor.Chestplate::new);
	RegistrySupplier<Item> TERRIBLE_LEGGINGS = simple("terrible_leggings", TerribleArmor.Leggings::new);
	RegistrySupplier<Item> TERRIBLE_BOOTS = simple("terrible_boots", TerribleArmor.Boots::new);
	RegistrySupplier<Item> THREE_BOLT_HELMET = simple("three_bolt_helmet", ThreeBoltArmor.Helmet::new);
	RegistrySupplier<Item> THREE_BOLT_SUIT = simple("three_bolt_suit", ThreeBoltArmor.Suit::new);
	RegistrySupplier<Item> THREE_BOLT_LEGGINGS = simple("three_bolt_leggings", ThreeBoltArmor.Leggings::new);
	RegistrySupplier<Item> THREE_BOLT_BOOTS = simple("three_bolt_boots", ThreeBoltArmor.Boots::new);
	RegistrySupplier<Item> ABYSSAL_TIARA = simple("abyssal_tiara", AbyssalArmor.Tiara::new);
	RegistrySupplier<Item> ABYSSAL_HEAUME = simple("abyssal_heaume", AbyssalArmor.Heaume::new);
	RegistrySupplier<Item> ABYSSAL_BRIGANTINE = simple("abyssal_brigantine", AbyssalArmor.Brigantine::new);
	RegistrySupplier<Item> ABYSSAL_LEGGINGS = simple("abyssal_leggings", AbyssalArmor.Leggings::new);
	RegistrySupplier<Item> ABYSSAL_BOOTS = simple("abyssal_boots", AbyssalArmor.Boots::new);
	RegistrySupplier<Item> SHIP_GRAVEYARD_ECHO = simple("ship_graveyard_echo", ShipGraveyardEchoItem::new);
	RegistrySupplier<Item> DEAD_SEA_SCROLL = simple("dead_sea_scroll", DeadSeaScrollItem::new);
	RegistrySupplier<Item> SHELL_HORN = simple("shell_horn", ShellHornItem::new);
	RegistrySupplier<Item> PIRATE_POUCH = simple("pirate_pouch", PiratePouchItem::new);
	RegistrySupplier<Item> TREASURE_POUCH = simple("treasure_pouch", TreasurePouchItem::new);
	RegistrySupplier<Item> ENCHANTED_POUCH = simple("enchanted_pouch", EnchantedPouchItem::new);
	RegistrySupplier<Item> ABYSSAL_AMETHYST = simple("abyssal_amethyst", AbyssalAmethystItem::new);
	RegistrySupplier<Item> SHARP_BONES = simple("sharp_bones", SharpBonesItem::new);
	RegistrySupplier<Item> OXYGELIUM = simple("oxygelium", OxygeliumItem::new);
	RegistrySupplier<Item> WISTERIA_NIVEIS = simple("wisteria_niveis", WisteriaNiveisItem::new);
	RegistrySupplier<Item> LUMINESCENT_BUBBLE = simple("luminescent_bubble", LuminescentBubbleItem::new);
	RegistrySupplier<Item> PIRATE_DOUBLOON = simple("pirate_doubloon", PirateDoubloonItem::new);
	RegistrySupplier<Item> LIQUID_CURSE = simple("liquid_curse", LiquidCurseItem::new);
	RegistrySupplier<Item> OXYGEN_TANK = simple("oxygen_tank", OxygenTankItem::new);
	RegistrySupplier<Item> DEAD_SEA_RING = simple("dead_sea_ring", DeadSeaRingItem::new);
	RegistrySupplier<Item> SHOE_SPIKES = simple("shoe_spikes", ShoeSpikesItem::new);
	RegistrySupplier<Item> SHIP_GRAVEYARD_RING = simple("ship_graveyard_ring", ShipGraveyardRingItem::new);
	RegistrySupplier<Item> ICE_MAZE_RING = simple("ice_maze_ring", IceMazeRingItem::new);

	RegistrySupplier<Item> FROZEN_KEY = item("frozen_key", properties ->
			properties.stacksTo(1).rarity(Rarity.UNCOMMON));
	RegistrySupplier<Item> ANGLERS_FANG = item("anglers_fang", properties ->
			properties.stacksTo(64).rarity(Rarity.UNCOMMON));
	RegistrySupplier<Item> FIN = item("fin", properties -> properties.stacksTo(64).rarity(Rarity.COMMON)
			.food(new FoodProperties.Builder().nutrition(1).saturationMod(0f).meat().build()));
	RegistrySupplier<Item> SPINEFISH = item("spinefish", properties -> properties.stacksTo(64).rarity(Rarity.COMMON)
			.food(new FoodProperties.Builder().nutrition(2).saturationMod(0f).meat().build()));
	RegistrySupplier<Item> COOKED_SPINEFISH = item("cooked_spinefish", properties -> properties.stacksTo(64).rarity(Rarity.COMMON)
			.food(new FoodProperties.Builder().nutrition(6).saturationMod(0.4f).meat().build()));
	RegistrySupplier<Item> ESCA = item("esca", properties -> properties.stacksTo(64).rarity(Rarity.COMMON)
			.food(new FoodProperties.Builder().nutrition(6).saturationMod(0.2f)
					.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200, 0), 1).build()));
	RegistrySupplier<Item> SEA_CASSEROLE = item("sea_casserole", properties -> properties.stacksTo(64).rarity(Rarity.COMMON)
			.food(new FoodProperties.Builder().nutrition(6).saturationMod(0.4f).alwaysEat()
					.effect(() -> new MobEffectInstance(MobEffects.POISON, 1800, 1), 1)
					.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1).build()));
	RegistrySupplier<Item> SEA_STEW = item("sea_stew", properties -> properties.stacksTo(1).rarity(Rarity.UNCOMMON)
			.food(new FoodProperties.Builder().nutrition(12).saturationMod(0.8f).alwaysEat()
					.effect(() -> new MobEffectInstance(MobEffects.SATURATION, 2400, 2), 1)
					.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 0), 1).build()));
	RegistrySupplier<Item> POSEIDONS_BREAKFAST = item("poseidons_breakfast", properties -> properties.stacksTo(1).rarity(Rarity.EPIC)
			.food(new FoodProperties.Builder().nutrition(20).saturationMod(1f).alwaysEat()
					.effect(() -> new MobEffectInstance(MobEffects.SATURATION, 3600, 9), 1)
					.effect(() -> new MobEffectInstance(MobEffects.POISON, 3600, 4), 1).build()));
	RegistrySupplier<Item> SPINEFISH_BUCKET = mobBucket("spinefish_bucket",
			AquamiraeEntities.SPINEFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH);

	RegistrySupplier<Item> GOLDEN_MOTH_SPAWN_EGG = spawnEgg("golden_moth_spawn_egg",
			AquamiraeEntities.GOLDEN_MOTH, Rarity.UNCOMMON, -3381760, -205);
	RegistrySupplier<Item> CURSED_MOTH_SPAWN_EGG = spawnEgg("cursed_moth_spawn_egg",
			AquamiraeEntities.CURSED_MOTH, Rarity.UNCOMMON, 0xFFE34873, 0xFF8A2253);
	RegistrySupplier<Item> MAW_SPAWN_EGG = spawnEgg("maw_spawn_egg",
			AquamiraeEntities.MAW, Rarity.COMMON, -16764109, -16737895);
	RegistrySupplier<Item> ANGLERFISH_SPAWN_EGG = spawnEgg("anglerfish_spawn_egg",
			AquamiraeEntities.ANGLERFISH, Rarity.COMMON, -12963033, -4942746);
	RegistrySupplier<Item> MAZE_MOTHER_SPAWN_EGG = spawnEgg("maze_mother_spawn_egg",
			AquamiraeEntities.MAZE_MOTHER, Rarity.COMMON, -10092442, -39169);
	RegistrySupplier<Item> CAPTAIN_CORNELIA_SPAWN_EGG = spawnEgg("captain_cornelia_spawn_egg",
			AquamiraeEntities.CAPTAIN_CORNELIA, Rarity.EPIC, -7760229, -13355980);
	RegistrySupplier<Item> PILLAGERS_PATROL_SPAWN_EGG = spawnEgg("pillagers_patrol_spawn_egg",
			AquamiraeEntities.PILLAGERS_PATROL, Rarity.COMMON, -16751002, -16711681);
	RegistrySupplier<Item> TORTURED_SOUL_SPAWN_EGG = spawnEgg("tortured_soul_spawn_egg",
			AquamiraeEntities.TORTURED_SOUL, Rarity.COMMON, -13421773, -16724737);
	RegistrySupplier<Item> EEL_SPAWN_EGG = spawnEgg("eel_spawn_egg",
			AquamiraeEntities.EEL, Rarity.COMMON, -16764109, -16737844);
	RegistrySupplier<Item> SPINEFISH_SPAWN_EGG = spawnEgg("spinefish_spawn_egg",
			AquamiraeEntities.SPINEFISH, Rarity.COMMON, 1589067, 11451069);

	RegistrySupplier<Item> MUSIC_DISC_HORIZON = record("music_disc_horizon",
			AquamiraeSounds.RECORD_HORIZON, Rarity.RARE, 1480);
	RegistrySupplier<Item> MUSIC_DISC_FORSAKEN_DROWNAGE = record("music_disc_forsaken_drownage",
			AquamiraeSounds.RECORD_FORSAKEN_DROWNAGE, ObscureRarity.MYTHIC, 3080);

	RegistrySupplier<Item> PAINTING_ANGLERFISH = block(AquamiraeBlocks.PAINTING_ANGLERFISH, Rarity.UNCOMMON);
	RegistrySupplier<Item> PAINTING_OXYGELIUM = block(AquamiraeBlocks.PAINTING_OXYGELIUM, Rarity.UNCOMMON);
	RegistrySupplier<Item> PAINTING_TORTURED_SOUL = block(AquamiraeBlocks.PAINTING_TORTURED_SOUL, Rarity.UNCOMMON);
	RegistrySupplier<Item> PAINTING_AURORA = block(AquamiraeBlocks.PAINTING_AURORA, Rarity.UNCOMMON);
	RegistrySupplier<Item> GOLDEN_MOTH_IN_A_JAR = block(AquamiraeBlocks.GOLDEN_MOTH_IN_A_JAR, Rarity.COMMON);
	RegistrySupplier<Item> CURSED_MOTH_IN_A_JAR = block(AquamiraeBlocks.CURSED_MOTH_IN_A_JAR, Rarity.COMMON);
	RegistrySupplier<Item> FROZEN_CHEST = block(AquamiraeBlocks.FROZEN_CHEST, Rarity.UNCOMMON);
	RegistrySupplier<Item> LUMINESCENT_LAMP = block(AquamiraeBlocks.LUMINESCENT_LAMP, Rarity.COMMON);
	RegistrySupplier<Item> ELODEA = block(AquamiraeBlocks.ELODEA, Rarity.COMMON);

	private static RegistrySupplier<Item> simple(String key, Supplier<Item> supplier) {
		return HANDLER.register(key, supplier);
	}

	private static RegistrySupplier<Item> block(RegistrySupplier<Block> block, Rarity rarity) {
		return HANDLER.register(block.key().getPath(), () -> new BlockItem(block.get(),
				new Item.Properties().rarity(rarity)));
	}

	private static RegistrySupplier<Item> item(String key, Function<Item.Properties, Item.Properties> function) {
		return HANDLER.register(key, () -> new Item(function.apply(new Item.Properties())));
	}

	private static <M extends Mob> RegistrySupplier<Item> spawnEgg(String key, Supplier<EntityType<M>> entity,
												   Rarity rarity, int backColor, int color) {
		return HANDLER.register(key, () -> new ForgeSpawnEggItem(entity, backColor, color,
				new Item.Properties().rarity(rarity)));
	}

	private static RegistrySupplier<Item> record(String key, Supplier<SoundEvent> sound, Rarity rarity, int length) {
		return HANDLER.register(key, () -> new RecordItem(0, sound,
				new Item.Properties().stacksTo(1).rarity(rarity), length));
	}

	@SuppressWarnings("all")
	private static <E extends Entity> RegistrySupplier<Item> mobBucket(String key, Supplier<EntityType<E>> entity,
													Supplier<Fluid> fluid, Supplier<SoundEvent> sound) {
		return HANDLER.register(key, () -> new MobBucketItem(entity, fluid, sound,
				new Item.Properties().stacksTo(1)));
	}
}
