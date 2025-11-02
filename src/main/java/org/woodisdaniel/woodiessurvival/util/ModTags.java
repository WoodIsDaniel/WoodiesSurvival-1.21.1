package org.woodisdaniel.woodiessurvival.util;

import org.woodisdaniel.woodiessurvival.WoodiesSurvival;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(WoodiesSurvival.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TIN_INGOTS =
                ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/tin"));
        public static final TagKey<Item> SILVER_INGOTS =
                ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/silver"));
        public static final TagKey<Item> BRONZE_INGOTS =
                ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/bronze"));
    }
}