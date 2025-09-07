package org.woodisdaniel.woodiessurvival.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.woodisdaniel.woodiessurvival.WoodiesSurvival;
import org.woodisdaniel.woodiessurvival.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(WoodiesSurvival.MOD_ID);

    public static final DeferredBlock<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> QUARTZ_ORE = registerBlock("quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock (String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
