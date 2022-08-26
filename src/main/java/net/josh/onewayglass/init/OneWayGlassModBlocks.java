
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.josh.onewayglass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.josh.onewayglass.block.OneWayGlassBlock;
import net.josh.onewayglass.OneWayGlassMod;

public class OneWayGlassModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OneWayGlassMod.MODID);
	public static final RegistryObject<Block> ONE_WAY_GLASS = REGISTRY.register("one_way_glass", () -> new OneWayGlassBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			OneWayGlassBlock.registerRenderLayer();
		}
	}
}
