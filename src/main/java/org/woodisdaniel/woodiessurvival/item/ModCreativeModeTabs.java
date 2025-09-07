package org.woodisdaniel.woodiessurvival.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.woodisdaniel.woodiessurvival.WoodiesSurvival;
import net.minecraft.world.item.Items;
import org.woodisdaniel.woodiessurvival.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoodiesSurvival.MOD_ID);

    public static final Supplier<CreativeModeTab> GEMS_TAB = CREATIVE_MODE_TAB.register("gems_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.woodiessurvival.gem_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.DIAMOND);
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(Items.EMERALD);
                        output.accept(ModItems.TOPAZ);
                        output.accept(Items.AMETHYST_SHARD);
                        output.accept(Items.QUARTZ);
                        output.accept(Items.LAPIS_LAZULI);

                        output.accept(Blocks.DIAMOND_ORE);
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(Blocks.EMERALD_ORE);
                        output.accept(ModBlocks.TOPAZ_ORE);
                        output.accept(ModBlocks.AMETHYST_ORE);
                        output.accept(ModBlocks.QUARTZ_ORE);
                        output.accept(Blocks.LAPIS_ORE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}