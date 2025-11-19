package com.vordix;

import com.mojang.authlib.yggdrasil.response.UserAttributesResponse;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.ai.brain.task.MoveItemsTask;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.server.world.BlockEvent;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.test.BlockBasedTestInstance;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import org.lwjgl.opengl.GLDebugMessageAMDCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterCraftableGunpowder implements ModInitializer {
	public static final String MOD_ID = "better-craftable-gunpowder";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID + ": Viel Spass beim Spielen ;)");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
/*      Code für wenn ein Item einfach in der Hand explodieren soll bei benutzung
        UseItemCallback.EVENT.register((player, world, hand) -> {
            if (!player.isSpectator() && player.getMainHandStack().isOf(Items.FLINT_AND_STEEL) && world instanceof ServerWorld serverWorld) {
                serverWorld.createExplosion(null, player.getBlockX(), player.getBlockY(), player.getBlockZ(), 2.0F, World.ExplosionSourceType.TNT);
            }
           return ActionResult.PASS;
        });

        */
        ModItems.initialize();
        ModBlocks.initalize();
		LOGGER.info("Hello from Vordix, creator of the 'Better Craftable Gunpowder' Mod");
	}



}