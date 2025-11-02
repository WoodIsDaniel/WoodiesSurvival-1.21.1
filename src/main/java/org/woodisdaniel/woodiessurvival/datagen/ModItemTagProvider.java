package org.woodisdaniel.woodiessurvival.datagen;

import org.woodisdaniel.woodiessurvival.WoodiesSurvival;
import org.woodisdaniel.woodiessurvival.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import org.woodisdaniel.woodiessurvival.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, WoodiesSurvival.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TIN_INGOTS)
                .add(ModItems.TIN_INGOT.get());
        tag(ModTags.Items.SILVER_INGOTS)
                .add(ModItems.SILVER_INGOT.get());
        tag(ModTags.Items.BRONZE_INGOTS)
                .add(ModItems.BRONZE_INGOT.get());
    }
}