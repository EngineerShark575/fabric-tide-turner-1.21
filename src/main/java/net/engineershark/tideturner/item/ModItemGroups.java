package net.engineershark.tideturner.item;

import net.engineershark.tideturner.TideTurner;
import net.engineershark.tideturner.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TideTurner.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tideturner.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.CAULIFLOWER);

                        entries.add(ModItems.STARLIGHT_ASHES);


                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TideTurner.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tideturner.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);

                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                    }).build());




    public static void registerItemGroups() {
        TideTurner.LOGGER.info("Registring item groups for " + TideTurner.MOD_ID);
    }
}