package argent_matter.gtec.block;


import argent_matter.gtec.GTExtendedChem;
import argent_matter.gtec.registry.GTECRegistries;
import argent_matter.util.GTECUtil;
import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.block.IFilterType;
import com.gregtechceu.gtceu.api.block.RendererBlock;
import com.gregtechceu.gtceu.api.item.RendererBlockItem;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.client.renderer.block.TextureOverrideRenderer;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.lowdragmc.lowdraglib.Platform;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.client.event.RenderHighlightEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static argent_matter.gtec.registry.GTECRegistries.REGISTRATE;


@SuppressWarnings("unused")
public class GTECBlocks {
    public static final BlockEntry<net.minecraft.world.level.block.Block> ULTRA_STERILIZING_FILTER_CASING = createCleanroomFilter(CleanroomFilterType.INSTANCE);


    private static BlockEntry<net.minecraft.world.level.block.Block> createCleanroomFilter(IFilterType filterType) {
        return REGISTRATE.block(filterType.getSerializedName(), p -> (Block) new RendererBlock(p,
                        Platform.isClient() ? new TextureOverrideRenderer(new ResourceLocation("block/cube_all"),
                                Map.of("all", GTExtendedChem.id("block/casings/cleanroom/" + filterType.getSerializedName()))) : null))
                .initialProperties(() -> Blocks.IRON_BLOCK)
                .properties(properties -> properties.strength(2.0f, 8.0f).sound(SoundType.METAL).isValidSpawn((blockState, blockGetter, blockPos, entityType) -> false))
                .blockstate(NonNullBiConsumer.noop())
                .tag(GTECUtil.MINEABLE_WITH_WRENCH, CustomTags.TOOL_TIERS[1])
                .item(RendererBlockItem::new)
                .model(NonNullBiConsumer.noop())
                .build()
                .register();
    }
    public static void init() {
    }
}
