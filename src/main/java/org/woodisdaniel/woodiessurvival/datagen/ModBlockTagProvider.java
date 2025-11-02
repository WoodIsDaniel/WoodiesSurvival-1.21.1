package org.woodisdaniel.woodiessurvival.datagen;

import org.woodisdaniel.woodiessurvival.WoodiesSurvival;
import org.woodisdaniel.woodiessurvival.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WoodiesSurvival.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AMETHYST_ORE.get())
                .add(ModBlocks.QUARTZ_ORE.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.SILVER_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AMETHYST_ORE.get())
                .add(ModBlocks.QUARTZ_ORE.get());

    }
}