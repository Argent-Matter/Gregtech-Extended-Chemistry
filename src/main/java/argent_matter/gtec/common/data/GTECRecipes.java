package argent_matter.gtec.common.data;


import argent_matter.gtec.recipes.PlatinumLineRecipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;


public class GTECRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        PlatinumLineRecipes.init(provider);

        }
}
