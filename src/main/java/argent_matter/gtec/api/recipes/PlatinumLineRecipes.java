package argent_matter.gtec.api.recipes;

import argent_matter.gtec.GTExtendedChem;
import argent_matter.gtec.api.common.data.GTECMaterials;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import net.minecraft.data.recipes.FinishedRecipe;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.gregtechceu.gtceu.data.recipe.misc.MetaTileEntityLoader;
import net.minecraft.data.recipes.FinishedRecipe;
import java.util.function.Consumer;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;


import java.util.function.Consumer;

public class PlatinumLineRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        GTRecipeTypes.CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("small_platinum_concentrate"))
                .inputItems(TagPrefix.dust, GTECMaterials.PLATINUM_METALLIC_POWDER, 1)
                .inputFluids(AquaRegia.getFluid(1000))
                .circuitMeta(1)
                .outputItems(TagPrefix.dustSmall, GTECMaterials.PLATINUM_RESIDUE, 1);


    }
}
