package argent_matter.gtec.recipes;

/*
import argent_matter.gtec.GTExtendedChem;
import argent_matter.gtec.common.data.GTECMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.Objects;
import java.util.function.Consumer;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import net.minecraft.data.recipes.FinishedRecipe;


import java.util.function.Consumer;

public class NaquadahChainRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        naquadahlineProcessses(provider);
    }

    public static void naquadahlineProcessses(Consumer<FinishedRecipe> provider) {

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("ether"))
                .circuitMeta(2)
                .inputFluids(Ethanol.getFluid(1000))
                .inputFluids(SulfuricAcid.getFluid(1000))
                .outputFluids(GTECMaterials.Ether.getFluid(500))
                .outputFluids(DilutedSulfuricAcid.getFluid(1500))
                .duration(510).EUt(VA[HV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("antimony_trifluoride"))
                .circuitMeta(1)
                .inputItems(dust,Antimony,1)
                .inputFluids(GTECMaterials.Ether.getFluid(1000))
                .inputFluids(Chlorine.getFluid(3000))
                .outputFluids(GTECMaterials.AntimonyTrichloride.getFluid(1000))
                .duration(60).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("antimony_pentachloride_solution"))
                .circuitMeta(1)
                .inputFluids(GTECMaterials.AntimonyTrichloride.getFluid(1000))
                .inputFluids(Chlorine.getFluid(2000))
                .outputFluids(GTECMaterials.AntimonyPentachlorideSolution.getFluid(1000))
                .duration(180).EUt(VA[HV]).save(provider);

        DISTILLATION_RECIPES.recipeBuilder(GTExtendedChem.id("distill_antimony_pentachloride_solution"))
                .inputFluids(GTECMaterials.AntimonyPentachlorideSolution.getFluid(1000))
                .outputFluids(GTECMaterials.Ether.getFluid(1000))
                .outputFluids(GTECMaterials.AntimonyPentachloride.getFluid(1000))
                .duration(600).EUt(VA[MV]).save(provider);

        // Small Distilling Recipes

        DISTILLERY_RECIPES.recipeBuilder(GTExtendedChem.id("distillery_antimony_pentachloride_solution_id_one"))
                .circuitMeta(1)
                .inputFluids(GTECMaterials.AntimonyPentachlorideSolution.getFluid(20))
                .outputFluids(GTECMaterials.Ether.getFluid(20))
                .duration(24).EUt(VA[LV]).save(provider);

        DISTILLERY_RECIPES.recipeBuilder(GTExtendedChem.id("distillery_antimony_pentachloride_solution_id_two"))
                .circuitMeta(1)
                .inputFluids(GTECMaterials.AntimonyPentachlorideSolution.getFluid(20))
                .outputFluids(GTECMaterials.AntimonyPentachloride.getFluid(20))
                .duration(24).EUt(VA[LV]).save(provider);

        //

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("antimony_pentafluoride"))
                .circuitMeta(1)
                .inputFluids(GTECMaterials.AntimonyPentachloride.getFluid(1000))
                .inputFluids(HydrofluoricAcid.getFluid(5000))
                .outputFluids(GTECMaterials.AntimonyPentafluoride.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(5000))
                .duration(420).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("fluor_antimonic_acid")
                .circuitMeta(1)
                .inputFluids(GTECMaterials.AntimonyPentafluoride.getFluid(1000))
                .inputFluids(HydrofluoricAcid.getFluid(1000))
                .outputFluids(FluoroantimonicAcid.getFluid(1000))
                .duration(840).EUt(VA[EV]).save(provider);

        BLAST_RECIPES.recipeBuilder("naquadah_titanium_separation")
                .circuitMeta(1)
                .inputItems(dust, GTECMaterials.NaquadahOxideMixture,1)
                .inputFluids(FluoroantimonicAcid.getFluid(1500))
                .blastFurnaceTemp(3000)
                .outputItems(dust,TitaniumTrifluoride,2)
                .outputFluids(GTECMaterials.LowQualityNaquadahEmulsion.getFluid(1000))
                .duration(50).EUt(VA[HV]).save(provider);

        CENTRIFUGE_RECIPES.recipeBuilder(GTExtendedChem.id("low_quality_naquadah_emulsion_separation"))
                .circuitMeta(1)
                .chancedOutput(dust, GTECMaterials.GalliumHydroxide, 64,6250,0)
                .chancedOutput(dust, GTECMaterials.GalliumHydroxide, 48,6250,0)
                .outputItems(dust, Antimony,15)
                .inputFluids(GTECMaterials.LowQualityNaquadahEmulsion.getFluid(10000))
                .outputItems(dust, GTECMaterials.GalliumHydroxide,112)
                .outputFluids(GTECMaterials.LowQualityNaquadahSolution.getFluid(9000))
                .duration(1000).EUt(VA[EV]).save(provider);


        // P-507
        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("ethyl_hexanol"))
                .notConsumable(plate, Copper)
                .inputFluids(SeedOil.getFluid(3000))
                .inputFluids(Hydrogen.getFluid(8000))
                .outputFluids(GTECMaterials.EthylHexanol.getFluid(1000))
                .duration(400).EUt(VA[HV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("p_507"))
                .inputItems(dust, SodiumHydroxide,2)
                .inputFluids(GTECMaterials.EthylHexanol.getFluid(1000))
                .inputFluids(PhosphoricAcid.getFluid(1000))
                .inputFluids(Ethanol.getFluid(2000))
                .duration(1200).EUt(VA[EV]).save(provider);



    }
}
TODO
 */
