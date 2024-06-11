package argent_matter.gtec.data.recipe.disabled;

import argent_matter.gtec.GTExtendedChem;
import argent_matter.gtec.common.data.GTECMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import java.util.function.Consumer;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class PlatinumLineRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        platinumLineProcesses(provider);
    }

    public static void platinumLineProcesses(Consumer<FinishedRecipe> provider) {

        // Platinum Metallic Powder processing

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id(("dissolve_platinum_metallic_powder")))
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(1000))
                .outputItems(dustSmall, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("dissolve_platinum_metallic_powder_9x"))
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .circuitMeta(9)
                .inputFluids(AquaRegia.getFluid(9000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(9000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("dissolve_bornite_for_platline"))
                .inputItems(crushedPurified, Bornite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("dissolve_chalcopyrite_for_platline"))
                .inputItems(crushedPurified, Chalcopyrite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("dissolve_cooperite_for_platline"))
                .inputItems(crushedPurified, Cooperite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("dissolve_tetrahedrite_for_platline"))
                .inputItems(crushedPurified, Tetrahedrite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("dissolve_pentlandite_for_platline"))
                .inputItems(crushedPurified, Pentlandite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        // Platinum Concentrate Processing

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("tiny_platinum_dusts"))
                .inputFluids(GTECMaterials.PlatinumConcentrate.getFluid(2000))
                .inputItems(dustSmall, AmmoniumChloride, 2)
                .circuitMeta(1)
                .outputItems(dustTiny, GTECMaterials.PlatinumSalt,16)
                .outputItems(dustTiny, GTECMaterials.ReprecipitatedPlatinum,4)
                .outputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(400))
                .outputFluids(NitrogenDioxide.getFluid(1000))
                .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
                .duration(1200).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("large_platinum_dusts"))
                .inputFluids(GTECMaterials.PlatinumConcentrate.getFluid(18000))
                .inputItems(dust, AmmoniumChloride, 2)
                .circuitMeta(1)
                .outputItems(dust, GTECMaterials.PlatinumSalt,16)
                .outputItems(dust, GTECMaterials.ReprecipitatedPlatinum,4)
                .outputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(3600))
                .outputFluids(NitrogenDioxide.getFluid(9000))
                .outputFluids(DilutedHydrochloricAcid.getFluid(9000))
                .duration(1400).EUt(VA[HV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("palladium_metallic_powder_conversion"))
                .inputItems(dust, GTECMaterials.PalladiumMetallicPowder)
                .circuitMeta(1)
                .inputFluids(Ammonia.getFluid(1000))
                .outputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        // Platinum Dust <------ First Platline Output

        CHEMICAL_RECIPES.recipeBuilder("raw_platinum_separation")
                .inputItems(dust, GTECMaterials.ReprecipitatedPlatinum,4)
                .inputItems(dust, Calcium,1)
                .outputItems(dust, Platinum,2)
                .outputItems(dust, CalciumChloride,3)
                .duration(30).EUt(VA[LV]).save(provider);

        // Palladium Metallic Powder Processing

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("low_yeild_palladium_salt"))
                .inputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .circuitMeta(2)
                .outputItems(dust, GTECMaterials.PalladiumSalt,1)
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("tiny_palladium_dusts"))
                .inputItems(dust, GTECMaterials.PalladiumMetallicPowder,1)
                .inputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .circuitMeta(1)
                .outputItems(dustTiny, GTECMaterials.PalladiumSalt,16)
                .outputItems(dustTiny, GTECMaterials.ReprecipitatedPalladium,4)
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("large_palladium_dusts"))
                .inputItems(dust, GTECMaterials.PalladiumMetallicPowder,9)
                .inputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(9000))
                .circuitMeta(9)
                .outputItems(dust, GTECMaterials.PalladiumSalt,16)
                .outputItems(dust, GTECMaterials.ReprecipitatedPalladium,4)
                .duration(2250).EUt(VA[LV]).save(provider);

        // Palladium Dust <----------- Second Platline Output

        CHEMICAL_RECIPES.recipeBuilder("raw_palladium_separation")
                .inputItems(dust, GTECMaterials.ReprecipitatedPalladium,4)
                .inputFluids(GTECMaterials.FormicAcid.getFluid(4000))
                .outputItems(dust, Palladium,2)
                .outputFluids(Ammonia.getFluid(4000))
                .outputFluids(Ethylene.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        // Rhodium Processing Chain (FUN)

        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("rhodium_sulfate"))
                .inputItems(dust, GTECMaterials.PlatinumResidue,1)
                .circuitMeta(2)
                .inputItems(dustSmall, GTECMaterials.PotassiumDisulfate, 2)
                .outputFluids(RhodiumSulfate.getFluid(360))
                .outputItems(dust, GTECMaterials.LeachResidue, 1)
                .blastFurnaceTemp(775)
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("rhodium_sulfate_to_solution"))
                .circuitMeta(1)
                .inputFluids(Water.getFluid(10000))
                .inputFluids(RhodiumSulfate.getFluid(11000))
                .outputItems(dustTiny, GTECMaterials.LeachResidue,10)
                .outputFluids(Potassium.getFluid(2000))
                .outputFluids(GTECMaterials.RhodiumSulfateSolution.getFluid(11000))
                .duration(300).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("bulk_rhodium_sulfate_to_solution"))
                .circuitMeta(3)
                .inputFluids(Water.getFluid(36000))
                .inputFluids(RhodiumSulfate.getFluid(39000))
                .outputItems(dust, GTECMaterials.LeachResidue,4)
                .outputFluids(Potassium.getFluid(7200))
                .outputFluids(GTECMaterials.RhodiumSulfateSolution.getFluid(39000))
                .duration(1200).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("crude_rhodium_metallic_powder"))
                .inputItems(dust, Zinc, 1)
                .inputFluids(GTECMaterials.RhodiumSulfateSolution.getFluid(1000))
                .outputItems(dust, GTECMaterials.ZincSulfate,6)
                .outputItems(dust, GTECMaterials.CrudeRhodiumMetal,1)
                .duration(300).EUt(VA[LV]).save(provider);

        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("rhodium_salt_ebf"))
                .inputItems(dust, GTECMaterials.CrudeRhodiumMetal,1)
                .inputItems(dust, Salt, 1)
                .inputFluids(Chlorine.getFluid(1000))
                .outputItems(dust, GTECMaterials.RhodiumSalt, 3)
                .blastFurnaceTemp(600)
                .duration(200).EUt(VA[MV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTExtendedChem.id("rhodium_salt_solution"))
                .inputItems(dust, GTECMaterials.RhodiumSalt, 1)
                .inputFluids(Water.getFluid(200))
                .outputFluids(GTECMaterials.RhodiumSulfateSolution.getFluid(200))
                .duration(30).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("rhodium_nitrate"))
                .inputItems(dust, GTECMaterials.SodiumNitrate,5)
                .inputFluids(GTECMaterials.RhodiumSaltSolution.getFluid(1000))
                .circuitMeta(1)
                .outputItems(dust, GTECMaterials.RhodiumNitrate,1)
                .outputItems(dust, Salt,2)
                .duration(300).EUt(VA[LV]).save(provider);

        SIFTER_RECIPES.recipeBuilder(GTExtendedChem.id("rhodium_filter_cake"))
                .inputItems(dust, GTECMaterials.RhodiumNitrate,1)
                .chancedOutput(dust, GTECMaterials.RhodiumFilterCake,1,1000,0)
                .chancedOutput(dust, GTECMaterials.RhodiumFilterCake,1,1000,0)
                .chancedOutput(dust, GTECMaterials.RhodiumFilterCake,1,1000,0)
                .chancedOutput(dust, GTECMaterials.RhodiumFilterCake,1,1000,0)
                .chancedOutput(dust, GTECMaterials.RhodiumFilterCake,1,1000,0)
                .chancedOutput(dust, GTECMaterials.RhodiumFilterCake,1,1500,0)
                .duration(300).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("sodium_nitrate"))
                .inputItems(dust, Sodium,1)
                .inputFluids(NitricAcid.getFluid(1000))
                .outputItems(dust, GTECMaterials.SodiumNitrate,5)
                .outputFluids(Hydrogen.getFluid(1000))
                .duration(8).EUt(VA[MV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTExtendedChem.id("rhodium_salt_solution"))
                .inputItems(dust, GTECMaterials.RhodiumSalt,1)
                .inputFluids(Water.getFluid(200))
                .outputFluids(GTECMaterials.RhodiumSaltSolution.getFluid(200))
                .duration(30).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("potassium_disulfate"))
                .inputItems(dust, Potassium,2)
                .inputItems(dust, Sulfur,2)
                .inputFluids(Oxygen.getFluid(7000))
                .outputItems(dust, GTECMaterials.PotassiumDisulfate,11)
                .duration(42).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("ammonium_chloride"))
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .inputFluids(Ammonia.getFluid(1000))
                .outputItems(dust, AmmoniumChloride,1)
                .duration(400).EUt(VA[MV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTExtendedChem.id("rhodium_filter_cake_solution"))
                .inputItems(dust, GTECMaterials.RhodiumFilterCake,1)
                .inputFluids(Water.getFluid(1000))
                .outputFluids(GTECMaterials.RhodiumFilterCakeSolution.getFluid(1000))
                .duration(300).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("reprecipitated_rhodium"))
                .inputFluids(GTECMaterials.RhodiumFilterCakeSolution.getFluid(1000))
                .circuitMeta(2)
                .outputItems(dust, GTECMaterials.ReprecipitatedRhodium,1)
                .duration(300).EUt(VA[LV]).save(provider);

        // Zinc Sulfate reprocessing

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("zinc_sulfate"))
                .inputItems(dust, GTECMaterials.ZincSulfate, 6)
                .inputFluids(Hydrogen.getFluid(2000))
                .outputItems(dust, Zinc, 1)
                .outputFluids(SulfuricAcid.getFluid(1000))
                .duration(30).EUt(VA[ULV]).save(provider);

        // Rhodium Dust Output <------------ Third Platline Dust also holy shit

        CHEMICAL_RECIPES.recipeBuilder("rhodium_dust")
                .inputItems(dust, GTECMaterials.ReprecipitatedRhodium,1)
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .outputItems(dust, Rhodium,1)
                .outputFluids(Chlorine.getFluid(1000))
                .outputFluids(Ammonia.getFluid(1000))
                .duration(300).EUt(VA[LV]).save(provider);

        // Ruthenium time :skull:
        BLAST_RECIPES.recipeBuilder("rarest_metal_residue")
                .inputItems(dust, GTECMaterials.LeachResidue,10)
                .inputItems(dust, Saltpeter,10)
                .inputFluids(SaltWater.getFluid(1000))
                .outputItems(dust, GTECMaterials.SodiumRuthenate, 3)
                .outputItems(dust, GTECMaterials.RarestMetalResidue,6)
                .outputFluids(Steam.getFluid(1000))
                .blastFurnaceTemp(775)
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("ruthenium_tetroxide")
                .inputItems(dust, GTECMaterials.SodiumRuthenate,6)
                .inputFluids(Chlorine.getFluid(3000))
                .outputFluids(GTECMaterials.RutheniumTetroxideSolution.getFluid(9000))
                .duration(300).EUt(VA[LV]).save(provider);

        FLUID_HEATER_RECIPES.recipeBuilder(GTExtendedChem.id("hot_ruthenium_tetroxide"))
                .inputFluids(GTECMaterials.RutheniumTetroxideSolution.getFluid(50))
                .outputFluids(GTECMaterials.HotRutheniumTetroxideSolution.getFluid(50))
                .duration(18).EUt(VA[HV]).save(provider);

        DISTILLATION_RECIPES.recipeBuilder(GTExtendedChem.id("hot_ruthenium_tetroxide_distill"))
                .inputFluids(GTECMaterials.HotRutheniumTetroxideSolution.getFluid(9000))
                .outputItems(dustSmall, RutheniumTetroxide, 30)
                .outputFluids(Water.getFluid(5800))
                .duration(1500).EUt(VA[HV]).save(provider);

        // Ruthenium Completion <----------  Fourth Platinum Line output (im still sane)

        CHEMICAL_RECIPES.recipeBuilder("ruthenium_tetroxide_separation")
                .inputItems(dust, RutheniumTetroxide,1)
                .inputFluids(HydrochloricAcid.getFluid(6000))
                .outputItems(dust, Ruthenium,1)
                .outputFluids(Water.getFluid(2000))
                .outputFluids(Chlorine.getFluid(6000))
                .duration(33).EUt(VA[LV]).save(provider);

        // Osmium Processing Time!

        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("rarest_metal_residue_ebf"))
                .inputItems(dust, GTECMaterials.RarestMetalResidue,2)
                .circuitMeta(2)
                .inputFluids(HydrochloricAcid.getFluid(500))
                .outputItems(dust, IridiumMetalResidue, 1)
                .outputFluids(AcidicOsmiumSolution.getFluid(1000))
                .blastFurnaceTemp(775)
                .duration(100).EUt(VA[MV]).save(provider);

        DISTILLATION_RECIPES.recipeBuilder("acidic_osmium_solution_separation")
                .inputFluids(AcidicOsmiumSolution.getFluid(1000))
                .outputFluids(GTECMaterials.OsmiumSolution.getFluid(100))
                .outputFluids(DilutedHydrochloricAcid.getFluid(180))
                .duration(150).EUt(VA[IV]).save(provider);

        // Osmium Completion <---- Fifth platline output

        CHEMICAL_RECIPES.recipeBuilder("osmium_tetroxide_separation")
                .inputFluids(HydrochloricAcid.getFluid(6000))
                .inputFluids(GTECMaterials.OsmiumSolution.getFluid(1000))
                .outputItems(dust, Osmium,1)
                .outputFluids(Water.getFluid(2000))
                .outputFluids(Chlorine.getFluid(7000))
                .duration(300).EUt(VA[LV]).save(provider);

        // Iridium Processing!

        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("iridium_metal_residue_process"))
                .inputItems(dust, IridiumMetalResidue,1)
                .circuitMeta(1)
                .outputItems(dust, GTECMaterials.SludgeDustResidue,1)
                .outputItems(dust, GTECMaterials.IridiumDioxide,1)
                .blastFurnaceTemp(775)
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("iridium_dioxide_dissolving"))
                .inputItems(dust, GTECMaterials.IridiumDioxide,1)
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .outputFluids(GTECMaterials.AcidicIridiumSolution.getFluid(1000))
                .duration(300).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("iridium_chloride"))
                .inputItems(dust, AmmoniumChloride, 11)
                .inputFluids(GTECMaterials.AcidicIridiumSolution.getFluid(1000))
                .outputItems(dust,IridiumChloride,1)
                .outputFluids(Ammonia.getFluid(3000))
                .duration(300).EUt(VA[LV]).save(provider);

        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("refined_platlinum_salt_to_metallic"))
                .inputItems(dust, GTECMaterials.RefinedPlatlinumSalt,1)
                .circuitMeta(1)
                .outputItems(dust, GTECMaterials.PlatinumMetallicPowder,1)
                .outputFluids(Chlorine.getFluid(87))
                .blastFurnaceTemp(900)
                .duration(200).EUt(VA[MV]).save(provider);

        // Iridium Completion <-------- Holy shit Platline Finally completed

        CHEMICAL_RECIPES.recipeBuilder("iridium_chloride_separation")
                .inputItems(dust, IridiumChloride,1)
                .inputItems(dust, Calcium,1)
                .outputItems(dust, GTECMaterials.MetallicSludgeResidue,1)
                .outputItems(dust, Iridium,1)
                .outputItems(dust, CalciumChloride, 4)
                .duration(300).EUt(VA[EV]).save(provider);

        // Remaining Sifting Recipes
        SIFTER_RECIPES.recipeBuilder(GTExtendedChem.id("refined_platinum_salt"))
                        .inputItems(dust, GTECMaterials.PlatinumSalt,1)
                .chancedOutput(dust, GTECMaterials.RefinedPlatlinumSalt, 1500,0)
                .chancedOutput(dust, GTECMaterials.RefinedPlatlinumSalt, 1500,0)
                .chancedOutput(dust, GTECMaterials.RefinedPlatlinumSalt, 1500,0)
                .chancedOutput(dust, GTECMaterials.RefinedPlatlinumSalt, 1500,0)
                .chancedOutput(dust, GTECMaterials.RefinedPlatlinumSalt, 1500,0)
                .chancedOutput(dust, GTECMaterials.RefinedPlatlinumSalt, 2000,0)
                .duration(600).EUt(VA[LV]).save(provider);

        SIFTER_RECIPES.recipeBuilder(GTExtendedChem.id("salt_to_metallic_powder_palladium"))
                .inputItems(dust, GTECMaterials.PalladiumSalt,1)
                .chancedOutput(dust, GTECMaterials.PalladiumMetallicPowder, 1500,0)
                .chancedOutput(dust, GTECMaterials.PalladiumMetallicPowder, 1500,0)
                .chancedOutput(dust, GTECMaterials.PalladiumMetallicPowder, 1500,0)
                .chancedOutput(dust, GTECMaterials.PalladiumMetallicPowder, 1500,0)
                .chancedOutput(dust, GTECMaterials.PalladiumMetallicPowder, 1500,0)
                .chancedOutput(dust, GTECMaterials.PalladiumMetallicPowder, 2000,0)
                .duration(600).EUt(VA[LV]).save(provider);




        // The Extra Stuff Overwriting Progression ETC


        ELECTROLYZER_RECIPES.recipeBuilder("raw_platinum_separation")
                .inputItems(dust, PlatinumRaw,3)
                .outputItems(dust, GTECMaterials.PlatinumMetallicPowder,1)
                .outputFluids(Chlorine.getFluid(800))
                .duration(2400).EUt(VA[MV]).save(provider);

        ELECTROLYZER_RECIPES.recipeBuilder("decomposition_electrolyzing_cooperite")
                .inputItems(dust, Cooperite,6)
                .outputItems(dust, GTECMaterials.PlatinumMetallicPowder,3)
                .outputItems(dust, Nickel,1)
                .outputItems(dust, Sulfur,1)
                .outputItems(dust, GTECMaterials.PalladiumSalt,1)
                .duration(1200).EUt(VA[MV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_tetrahedrite")
                .inputItems(crushedPurified, Tetrahedrite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_bornite")
                .inputItems(crushedPurified, Bornite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcopyrite")
                .inputItems(crushedPurified, Chalcopyrite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_pentlandite")
                .inputItems(crushedPurified, Pentlandite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_cooperite")
                .inputItems(crushedPurified, Cooperite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(300))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcocite")
                .inputItems(crushedPurified, Chalcocite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);


        CHEMICAL_RECIPES.recipeBuilder("pgs_from_tetrahedrite")
                .inputItems(crushedPurified, Tetrahedrite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_bornite")
                .inputItems(crushedPurified, Bornite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcopyrite")
                .inputItems(crushedPurified, Chalcopyrite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_pentlandite")
                .inputItems(crushedPurified, Pentlandite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_cooperite")
                .inputItems(crushedPurified, Cooperite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(300))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcocite")
                .inputItems(crushedPurified, Chalcocite,1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);



        CHEMICAL_RECIPES.recipeBuilder("inert_metal_mixture_separation")
                .inputItems(dust, InertMetalMixture,1)
                .outputItems(dust, GTECMaterials.SodiumRuthenate,1)
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("inert_metal_mixture_separation")
                .inputItems(dust, InertMetalMixture,1)
                .outputItems(dust, GTECMaterials.SodiumRuthenate,1)
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("rarest_metal_mixture_separation")
                .inputItems(dust, RarestMetalMixture,1)
                .outputItems(dust, GTECMaterials.IridiumDioxide,1)
                .duration(250).EUt(VA[UV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("rarest_metal_mixture_separation")
                .inputItems(dust, RarestMetalMixture,1)
                .outputItems(dust, GTECMaterials.IridiumDioxide,1)
                .duration(250).EUt(VA[UV]).save(provider);

        CENTRIFUGE_RECIPES.recipeBuilder("iridium_metal_residue_separation")
                .inputItems(dust, IridiumMetalResidue,1)
                .outputItems(dust, PlatinumSludgeResidue,1)
                .duration(250).EUt(VA[LV]).save(provider);

        // Formic Acid
        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("sodium_formate"))
                .inputItems(dust, SodiumHydroxide,3)
                .inputFluids(CarbonMonoxide.getFluid(1000))
                .outputFluids(GTECMaterials.SodiumFormate.getFluid(1000))
                .duration(15).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("formic_acid"))
                .inputFluids(GTECMaterials.SodiumFormate.getFluid(2000))
                .inputFluids(SulfuricAcid.getFluid(1000))
                .circuitMeta(1)
                .outputFluids(GTECMaterials.FormicAcid.getFluid(2000))
                .outputItems(dust, GTECMaterials.SodiumSulfate,7)
                .duration(15).EUt(VA[LV]).save(provider);

        // Nickel Replacement

        CHEMICAL_BATH_RECIPES.recipeBuilder("bathe_nickel_crushed_ore_to_purified_ore")
                .inputItems(crushed, Nickel,1)
                .inputFluids(Mercury.getFluid(100))
                .outputItems(crushedPurified, Nickel,1)
                .chancedOutput(dust, GTECMaterials.PlatinumMetallicPowder,1,7000,580)
                .chancedOutput(dust, Stone,1,4000,650)
                .duration(600).EUt(VA[LV]).save(provider);
    }
}
