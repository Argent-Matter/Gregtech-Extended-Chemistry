package argent_matter.gtec.data.recipe;

import argent_matter.gtec.common.data.GTECItems;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import net.minecraft.data.recipes.FinishedRecipe;
import argent_matter.gtec.GTExtendedChem;
import argent_matter.gtec.common.data.GTECMaterials;
import com.sun.jna.platform.win32.WinCrypt;
import com.sun.jna.platform.win32.WinNT;
import net.minecraft.client.model.CamelModel;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.Objects;
import java.util.function.Consumer;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class CircuitRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        circuitBoardRecipess(provider);
    }
    public static void circuitBoardRecipess(Consumer<FinishedRecipe> provider) {
    }
}
