package argent_matter.gtec.recipes;

import argent_matter.gtec.common.data.GTECMaterials;
import argent_matter.gtec.common.data.GTECRecipes;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import java.util.function.Consumer;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class PlatinumLineRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        PlatinumLineProcesses(provider);
    }
        public static void PlatinumLineProcesses(Consumer<FinishedRecipe> provider) {

        // Platinum Metallic Powder processing

            CHEMICAL_RECIPES.recipeBuilder(("dissolve_platinum_metallic_powder"))
                    .inputItems(dust, GTECMaterials.PLATINUMMETALLICPOWDER)
                    .circuitMeta(1)
                    .inputFluids(AquaRegia.getFluid(1000))
                    .outputItems(dustSmall, GTECMaterials.PLATINUMRESIDUE)
                    .outputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(1000))
                    .duration(250).EUt(VA[LV]).save(provider);

                CHEMICAL_RECIPES.recipeBuilder(("dissolve_platinum_metallic_powder_9x"))
                        .inputItems(dust, GTECMaterials.PLATINUMMETALLICPOWDER,9)
                        .circuitMeta(9)
                        .inputFluids(AquaRegia.getFluid(9000))
                        .outputItems(dust, GTECMaterials.PLATINUMRESIDUE)
                        .outputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(9000))
                        .duration(2250).EUt(VA[LV]).save(provider);

                CHEMICAL_RECIPES.recipeBuilder(("dissolve_bornite_for_platline"))
                        .inputItems(crushedPurified, Bornite,9)
                        .inputItems(dust, GTECMaterials.PLATINUMMETALLICPOWDER,9)
                        .inputFluids(AquaRegia.getFluid(10000))
                        .outputItems(dust, GTECMaterials.PLATINUMRESIDUE)
                        .outputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(10000))
                        .duration(2250).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("dissolve_chalcopyrite_for_platline"))
                    .inputItems(crushedPurified, Chalcopyrite,9)
                    .inputItems(dust, GTECMaterials.PLATINUMMETALLICPOWDER,9)
                    .inputFluids(AquaRegia.getFluid(10000))
                    .outputItems(dust, GTECMaterials.PLATINUMRESIDUE)
                    .outputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(10000))
                    .duration(2250).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("dissolve_cooperite_for_platline"))
                    .inputItems(crushedPurified, Cooperite,9)
                    .inputItems(dust, GTECMaterials.PLATINUMMETALLICPOWDER,9)
                    .inputFluids(AquaRegia.getFluid(10000))
                    .outputItems(dust, GTECMaterials.PLATINUMRESIDUE)
                    .outputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(10000))
                    .duration(2250).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("dissolve_tetrahedrite_for_platline"))
                    .inputItems(crushedPurified, Tetrahedrite,9)
                    .inputItems(dust, GTECMaterials.PLATINUMMETALLICPOWDER,9)
                    .inputFluids(AquaRegia.getFluid(10000))
                    .outputItems(dust, GTECMaterials.PLATINUMRESIDUE)
                    .outputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(10000))
                    .duration(2250).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("dissolve_pentlandite_for_platline"))
                    .inputItems(crushedPurified, Pentlandite,9)
                    .inputItems(dust, GTECMaterials.PLATINUMMETALLICPOWDER,9)
                    .inputFluids(AquaRegia.getFluid(10000))
                    .outputItems(dust, GTECMaterials.PLATINUMRESIDUE)
                    .outputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(10000))
                    .duration(2250).EUt(VA[LV]).save(provider);

            // Platinum Concentrate Processing

            LARGE_CHEMICAL_RECIPES.recipeBuilder(("tiny_platinum_dusts"))
                    .inputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(2000))
                    .inputFluids(AmmoniumChloride.getFluid(400))
                    .circuitMeta(1)
                    .outputItems(dustTiny, GTECMaterials.PLATINUMSALT,16)
                    .outputItems(dustTiny, GTECMaterials.REPERCIPITATEDPLATINUM,4)
                    .outputFluids(GTECMaterials.PALLADIUMENRICHEDAMMONIA.getFluid(400))
                    .outputFluids(NitrogenDioxide.getFluid(1000))
                    .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
                    .duration(1200).EUt(VA[LV]).save(provider);

            LARGE_CHEMICAL_RECIPES.recipeBuilder(("large_platinum_dusts"))
                    .inputFluids(GTECMaterials.PLATINUMCONCENTRATE.getFluid(18000))
                    .inputFluids(AmmoniumChloride.getFluid(3600))
                    .circuitMeta(1)
                    .outputItems(dust, GTECMaterials.PLATINUMSALT,16)
                    .outputItems(dust, GTECMaterials.REPERCIPITATEDPLATINUM,4)
                    .outputFluids(GTECMaterials.PALLADIUMENRICHEDAMMONIA.getFluid(3600))
                    .outputFluids(NitrogenDioxide.getFluid(9000))
                    .outputFluids(DilutedHydrochloricAcid.getFluid(9000))
                    .duration(1400).EUt(VA[HV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("palladium_metallic_powder_conversion"))
                    .inputItems(dust, GTECMaterials.PALLADIUMMETALLICPOWDER)
                    .circuitMeta(1)
                    .inputFluids(Ammonia.getFluid(1000))
                    .outputFluids(GTECMaterials.PALLADIUMENRICHEDAMMONIA.getFluid(1000))
                    .duration(250).EUt(VA[LV]).save(provider);

            // Platinum Dust <------ First Platline Output

            CHEMICAL_RECIPES.recipeBuilder(("completed_platinum_dust"))
                    .inputItems(dust, GTECMaterials.REPERCIPITATEDPLATINUM,4)
                    .inputItems(dust, Calcium,1)
                    .outputItems(dust, Platinum,2)
                    .outputItems(dust, CalciumChloride,3)
                    .duration(30).EUt(VA[LV]).save(provider);

            // Palladium Metallic Powder Processing

            CHEMICAL_RECIPES.recipeBuilder(("low_yeild_palladium_salt"))
                    .inputFluids(GTECMaterials.PALLADIUMENRICHEDAMMONIA.getFluid(1000))
                    .circuitMeta(2)
                    .outputItems(dust, GTECMaterials.PALLADIUMSALT,1)
                    .duration(250).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("tiny_palladium_dusts"))
                    .inputItems(dust, GTECMaterials.PALLADIUMMETALLICPOWDER,1)
                    .inputFluids(GTECMaterials.PALLADIUMENRICHEDAMMONIA.getFluid(1000))
                    .circuitMeta(1)
                    .outputItems(dustTiny, GTECMaterials.PALLADIUMSALT,16)
                    .outputItems(dustTiny, GTECMaterials.REPRECIPITATEDPALLADIUMDUST,4)
                    .duration(250).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("large_palladium_dusts"))
                    .inputItems(dust, GTECMaterials.PALLADIUMMETALLICPOWDER,9)
                    .inputFluids(GTECMaterials.PALLADIUMENRICHEDAMMONIA.getFluid(9000))
                    .circuitMeta(9)
                    .outputItems(dust, GTECMaterials.PALLADIUMSALT,16)
                    .outputItems(dust, GTECMaterials.REPRECIPITATEDPALLADIUMDUST,4)
                    .duration(2250).EUt(VA[LV]).save(provider);

            // Palladium Dust <----------- Second Platline Output

            CHEMICAL_RECIPES.recipeBuilder(("palladium_dust"))
                    .inputItems(dust, GTECMaterials.REPRECIPITATEDPALLADIUMDUST,4)
                    .inputFluids(GTECMaterials.FORMICACID.getFluid(4000))
                    .outputItems(dust, Palladium,2)
                    .outputFluids(Ammonia.getFluid(4000))
                    .outputFluids(Ethylene.getFluid(1000))
                    .duration(250).EUt(VA[LV]).save(provider);

            // Rhodium Processing Chain (FUN)

            BLAST_RECIPES.recipeBuilder(("leach_residue_one"))
                    .inputItems(dust, GTECMaterials.PLATINUMRESIDUE,1)
                    .circuitMeta(11)
                    .inputFluids(GTECMaterials.POTASSIUMDISULFATE.getFluid(360))
                    .outputFluids(RhodiumSulfate.getFluid(360))
                    .duration(200).EUt(VA[MV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("rhodium_sulfate_to_solution"))
                    .circuitMeta(1)
                    .inputFluids(Water.getFluid(10000))
                    .inputFluids(RhodiumSulfate.getFluid(11000))
                    .outputItems(dustTiny, GTECMaterials.LEACHRESIDUE,10)
                    .outputFluids(Potassium.getFluid(2000))
                    .outputFluids(GTECMaterials.RHODIUMSULFATESOLUTION.getFluid(11000))
                    .duration(300).EUt(VA[LV]).save(provider);

            LARGE_CHEMICAL_RECIPES.recipeBuilder(("bulk_rhodium_sulfate_to_solution"))
                    .circuitMeta(3)
                    .inputFluids(Water.getFluid(36000))
                    .inputFluids(RhodiumSulfate.getFluid(39000))
                    .outputItems(dust, GTECMaterials.LEACHRESIDUE,4)
                    .outputFluids(Potassium.getFluid(7200))
                    .outputFluids(GTECMaterials.RHODIUMSULFATESOLUTION.getFluid(39000))
                    .duration(1200).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("crude_rhodium_metallic_powder"))
                    .inputItems(dust, Zinc, 1)
                    .inputFluids(GTECMaterials.RHODIUMSULFATESOLUTION.getFluid(1000))
                    .outputItems(dust, GTECMaterials.ZINCSULFATE,6)
                    .outputItems(dust, GTECMaterials.CRUDERHODIUMMETAL,1)
                    .duration(300).EUt(VA[LV]).save(provider);

            BLAST_RECIPES.recipeBuilder(("rhodium_salt_ebf"))
                    .inputItems(dust, GTECMaterials.CRUDERHODIUMMETAL,1)
                    .inputItems(dust, Salt, 1)
                    .inputFluids(Chlorine.getFluid(1000))
                    .outputItems(dust, GTECMaterials.RHODIUM_SALT, 3)
                    .duration(200).EUt(VA[MV]).save(provider);

            MIXER_RECIPES.recipeBuilder(("rhodium_salt_solution"))
                    .inputItems(dust, GTECMaterials.RHODIUM_SALT, 1)
                    .inputFluids(Water.getFluid(200))
                    .outputFluids(GTECMaterials.RHODIUMSULFATESOLUTION.getFluid(200))
                    .duration(30).EUt(VA[LV]).save(provider);

           CHEMICAL_RECIPES.recipeBuilder(("rhodium_nitrate"))
                   .inputItems(dust, GTECMaterials.SODIUMNITRATE,5)
                   .inputFluids(GTECMaterials.RHODIUMSALTSOLUTION.getFluid(1000))
                   .circuitMeta(1)
                   .outputItems(dust, GTECMaterials.RHODIUMNITRATE,1)
                   .outputItems(dust, Salt,2)
                    .duration(300).EUt(VA[LV]).save(provider);

           MIXER_RECIPES.recipeBuilder(("rhodium_filter_cake_solution"))
                   .inputItems(dust, GTECMaterials.RHODIUMFILTERCAKE,1)
                   .inputFluids(Water.getFluid(1000))
                   .outputFluids(GTECMaterials.RHODIUMFILTERCAKESOLUTION.getFluid(1000))
                    .duration(300).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("reprecipitated_rhodium"))
                    .inputFluids(GTECMaterials.RHODIUMFILTERCAKESOLUTION.getFluid(1000))
                    .circuitMeta(2)
                    .outputItems(dust, GTECMaterials.REPRECIPITATEDRHODIUM,1)
                    .duration(300).EUt(VA[LV]).save(provider);

            // Rhodium Dust Output <------------ Third Platline Dust also holy shit

            CHEMICAL_RECIPES.recipeBuilder(("rhodium_dust"))
                    .inputItems(dust, GTECMaterials.REPRECIPITATEDRHODIUM,1)
                    .inputFluids(HydrochloricAcid.getFluid(1000))
                    .outputItems(dust, Rhodium,1)
                    .outputFluids(Chlorine.getFluid(1000))
                    .outputFluids(Ammonia.getFluid(1000))
                    .duration(300).EUt(VA[LV]).save(provider);

            // Ruthenium time :skull:
           BLAST_RECIPES.recipeBuilder(("rarest_metal_residue"))
                   .inputItems(dust, GTECMaterials.LEACHRESIDUE,10)
                   .inputItems(dust, Saltpeter,10)
                   .inputFluids(SaltWater.getFluid(1000))
                   .outputItems(dust, GTECMaterials.SODIUMRUTHENATE, 3)
                   .outputItems(dust, GTECMaterials.RARESTMETALRESIDUE,6)
                   .outputFluids(Steam.getFluid(1000))
                    .duration(200).EUt(VA[MV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("ruthenium_tetroxide"))
                    .inputItems(dust, GTECMaterials.SODIUMRUTHENATE,6)
                    .inputFluids(Chlorine.getFluid(3000))
                    .outputFluids(GTECMaterials.RUTHENIUMTETROXIDESOLUTION.getFluid(9000))
                    .duration(300).EUt(VA[LV]).save(provider);

            FLUID_HEATER_RECIPES.recipeBuilder(("hot_ruthenium_tetroxide"))
                    .inputFluids(GTECMaterials.RUTHENIUMTETROXIDESOLUTION.getFluid(50))
                    .outputFluids(GTECMaterials.HOTRUTHENIUMTETROXIDESOLUTION.getFluid(50))
                    .duration(18).EUt(VA[HV]).save(provider);

            DISTILLATION_RECIPES.recipeBuilder(("hot_ruthenium_tetroxide_distill"))
                    .inputFluids(GTECMaterials.HOTRUTHENIUMTETROXIDESOLUTION.getFluid(9000))
                    .outputItems(dust, Salt,5)
                    .outputFluids(Water.getFluid(1800))
                    .outputFluids(RutheniumTetroxide.getFluid(7200))
                    .duration(1500).EUt(VA[HV]).save(provider);

            FLUID_SOLIDFICATION_RECIPES.recipeBuilder(("ruthenium_tetroxide_completion"))
                    .circuitMeta(1)
                    .inputFluids(RutheniumTetroxide.getFluid(1000))
                    .outputItems(dust, RutheniumTetroxide, 1)
                    .duration(33).EUt(VA[LV]).save(provider);

            // Ruthenium Completion <----------  Fourth Platinum Line output (im still sane)

            CHEMICAL_RECIPES.recipeBuilder(("ruthenium_dust_completion"))
                    .inputItems(dust, RutheniumTetroxide,1)
                    .inputFluids(HydrochloricAcid.getFluid(6000))
                    .outputItems(dust, Ruthenium,1)
                    .outputFluids(Water.getFluid(2000))
                    .outputFluids(Chlorine.getFluid(6000))
                    .duration(33).EUt(VA[LV]).save(provider);

            // Osmium Processing Time!

            BLAST_RECIPES.recipeBuilder(("rarest_metal_residue_ebf"))
                    .inputItems(dust, GTECMaterials.RARESTMETALRESIDUE,2)
                    .circuitMeta(11)
                    .inputFluids(HydrochloricAcid.getFluid(500))
                    .outputItems(dust, IridiumMetalResidue, 1)
                    .outputFluids(AcidicOsmiumSolution.getFluid(1000))
                    .duration(100).EUt(VA[MV]).save(provider);

            BLAST_RECIPES.recipeBuilder(("acidic_osmium_solution_distill"))
                    .inputFluids(AcidicOsmiumSolution.getFluid(1000))
                    .outputFluids(GTECMaterials.OSMIUMSOLUTION.getFluid(100))
                    .outputFluids(Water.getFluid(900))
                    .duration(150).EUt(VA[IV]).save(provider);

            // Osmium Completion <---- Fifth platline output

            CHEMICAL_RECIPES.recipeBuilder(("osmium_dust_completion"))
                    .inputFluids(HydrochloricAcid.getFluid(6000))
                    .inputFluids(AcidicOsmiumSolution.getFluid(1000))
                    .outputFluids(Water.getFluid(900))
                    .outputItems(dust, Iridium,1)
                    .outputFluids(Water.getFluid(2000))
                    .outputFluids(Chlorine.getFluid(7000))
                    .duration(300).EUt(VA[LV]).save(provider);

            // Iridium Processing!

            BLAST_RECIPES.recipeBuilder(("iridium_metal_residue_process"))
                    .inputItems(dust, IridiumMetalResidue,1)
                    .circuitMeta(1)
                    .outputItems(dust, GTECMaterials.SLUDGEDUSTRESIDUE,1)
                    .outputItems(dust, GTECMaterials.IRIDIUMDIOXIDE,1)
                    .duration(200).EUt(VA[MV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("iridium_dioxide_dissolving"))
                    .inputItems(dust, GTECMaterials.IRIDIUMDIOXIDE,1)
                    .inputFluids(HydrochloricAcid.getFluid(1000))
                    .outputFluids(GTECMaterials.ACIDICIRIDIUMSOLUTION.getFluid(1000))
                    .duration(300).EUt(VA[LV]).save(provider);

            CHEMICAL_RECIPES.recipeBuilder(("iridium_chloride"))
                    .inputFluids(AmmoniumChloride.getFluid(3000))
                    .inputFluids(GTECMaterials.ACIDICIRIDIUMSOLUTION.getFluid(1000))
                    .outputItems(dust,IridiumChloride,1)
                    .outputFluids(Ammonia.getFluid(3000))
                    .duration(300).EUt(VA[LV]).save(provider);

            // Iridium Completion <-------- Holy shit Platline Finally completed


            CHEMICAL_RECIPES.recipeBuilder(("iridium_dust_completion"))
                    .inputItems(dust, IridiumChloride,1)
                    .inputItems(dust, Calcium,1)
                    .outputItems(dust, GTECMaterials.METALLICSLUDGERESIDUE,1)
                    .outputItems(dust, Iridium,1)
                    .outputFluids(CalciumChloride.getFluid(3000))
                    .duration(300).EUt(VA[EV]).save(provider);

        }
}
