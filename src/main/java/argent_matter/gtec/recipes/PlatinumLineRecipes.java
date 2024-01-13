package argent_matter.gtec.recipes;

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

        CHEMICAL_RECIPES.recipeBuilder("dissolve_platinum_metallic_powder")
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(1000))
                .outputItems(dustSmall, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("dissolve_platinum_metallic_powder_9x")
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .circuitMeta(9)
                .inputFluids(AquaRegia.getFluid(9000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(9000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("dissolve_bornite_for_platline")
                .inputItems(crushedPurified, Bornite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("dissolve_chalcopyrite_for_platline")
                .inputItems(crushedPurified, Chalcopyrite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("dissolve_cooperite_for_platline")
                .inputItems(crushedPurified, Cooperite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("dissolve_tetrahedrite_for_platline")
                .inputItems(crushedPurified, Tetrahedrite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("dissolve_pentlandite_for_platline")
                .inputItems(crushedPurified, Pentlandite,9)
                .inputItems(dust, GTECMaterials.PlatinumMetallicPowder,9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, GTECMaterials.PlatinumResidue)
                .outputFluids(GTECMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        // Platinum Concentrate Processing

        LARGE_CHEMICAL_RECIPES.recipeBuilder("tiny_platinum_dusts")
                .inputFluids(GTECMaterials.PlatinumConcentrate.getFluid(2000))
                .inputItems(dust, AmmoniumChloride, 1)
                .circuitMeta(1)
                .outputItems(dustTiny, GTECMaterials.PlatinumSalt,16)
                .outputItems(dustTiny, GTECMaterials.RepercipitatedPlatinum,4)
                .outputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(400))
                .outputFluids(NitrogenDioxide.getFluid(1000))
                .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
                .duration(1200).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("large_platinum_dusts")
                .inputFluids(GTECMaterials.PlatinumConcentrate.getFluid(18000))
                .inputItems(dust, AmmoniumChloride, 5)
                .circuitMeta(1)
                .outputItems(dust, GTECMaterials.PlatinumSalt,16)
                .outputItems(dust, GTECMaterials.RepercipitatedPlatinum,4)
                .outputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(3600))
                .outputFluids(NitrogenDioxide.getFluid(9000))
                .outputFluids(DilutedHydrochloricAcid.getFluid(9000))
                .duration(1400).EUt(VA[HV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("palladium_metallic_powder_conversion")
                .inputItems(dust, GTECMaterials.PalladiumMetallicPowder)
                .circuitMeta(1)
                .inputFluids(Ammonia.getFluid(1000))
                .outputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        // Platinum Dust <------ First Platline Output

        CHEMICAL_RECIPES.recipeBuilder("completed_platinum_dust")
                .inputItems(dust, GTECMaterials.RepercipitatedPlatinum,4)
                .inputItems(dust, Calcium,1)
                .outputItems(dust, Platinum,2)
                .outputItems(dust, CalciumChloride,3)
                .duration(30).EUt(VA[LV]).save(provider);

        // Palladium Metallic Powder Processing

        CHEMICAL_RECIPES.recipeBuilder("low_yeild_palladium_salt")
                .inputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .circuitMeta(2)
                .outputItems(dust, GTECMaterials.PalladiumSalt,1)
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("tiny_palladium_dusts")
                .inputItems(dust, GTECMaterials.PalladiumMetallicPowder,1)
                .inputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .circuitMeta(1)
                .outputItems(dustTiny, GTECMaterials.PalladiumSalt,16)
                .outputItems(dustTiny, GTECMaterials.RepercipitatedPalladium,4)
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("large_palladium_dusts")
                .inputItems(dust, GTECMaterials.PalladiumMetallicPowder,9)
                .inputFluids(GTECMaterials.PalladiumEnrichedAmmonia.getFluid(9000))
                .circuitMeta(9)
                .outputItems(dust, GTECMaterials.PalladiumSalt,16)
                .outputItems(dust, GTECMaterials.RepercipitatedPalladium,4)
                .duration(2250).EUt(VA[LV]).save(provider);

        // Palladium Dust <----------- Second Platline Output

        CHEMICAL_RECIPES.recipeBuilder("palladium_dust")
                .inputItems(dust, GTECMaterials.RepercipitatedPalladium,4)
                .inputFluids(GTECMaterials.FormicAcid.getFluid(4000))
                .outputItems(dust, Palladium,2)
                .outputFluids(Ammonia.getFluid(4000))
                .outputFluids(Ethylene.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        // Rhodium Processing Chain (FUN)

        BLAST_RECIPES.recipeBuilder("leach_residue_one")
                .inputItems(dust, GTECMaterials.PlatinumResidue,1)
                .circuitMeta(11)
                .inputFluids(GTECMaterials.PotassiumDisulfate.getFluid(360))
                .outputFluids(RhodiumSulfate.getFluid(360))
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("rhodium_sulfate_to_solution")
                .circuitMeta(1)
                .inputFluids(Water.getFluid(10000))
                .inputFluids(RhodiumSulfate.getFluid(11000))
                .outputItems(dustTiny, GTECMaterials.LeachResidue,10)
                .outputFluids(Potassium.getFluid(2000))
                .outputFluids(GTECMaterials.RhodiumSulfateSolution.getFluid(11000))
                .duration(300).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("bulk_rhodium_sulfate_to_solution")
                .circuitMeta(3)
                .inputFluids(Water.getFluid(36000))
                .inputFluids(RhodiumSulfate.getFluid(39000))
                .outputItems(dust, GTECMaterials.LeachResidue,4)
                .outputFluids(Potassium.getFluid(7200))
                .outputFluids(GTECMaterials.RhodiumSulfateSolution.getFluid(39000))
                .duration(1200).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("crude_rhodium_metallic_powder")
                .inputItems(dust, Zinc, 1)
                .inputFluids(GTECMaterials.RhodiumSulfateSolution.getFluid(1000))
                .outputItems(dust, GTECMaterials.ZincSulfate,6)
                .outputItems(dust, GTECMaterials.CrudeRhodiumMetal,1)
                .duration(300).EUt(VA[LV]).save(provider);

        BLAST_RECIPES.recipeBuilder("rhodium_salt_ebf")
                .inputItems(dust, GTECMaterials.CrudeRhodiumMetal,1)
                .inputItems(dust, Salt, 1)
                .inputFluids(Chlorine.getFluid(1000))
                .outputItems(dust, GTECMaterials.RhodiumSalt, 3)
                .duration(200).EUt(VA[MV]).save(provider);

        MIXER_RECIPES.recipeBuilder("rhodium_salt_solution")
                .inputItems(dust, GTECMaterials.RhodiumSalt, 1)
                .inputFluids(Water.getFluid(200))
                .outputFluids(GTECMaterials.RhodiumSulfateSolution.getFluid(200))
                .duration(30).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("rhodium_nitrate")
                .inputItems(dust, GTECMaterials.SodiumNitrate,5)
                .inputFluids(GTECMaterials.RhodiumSaltSolution.getFluid(1000))
                .circuitMeta(1)
                .outputItems(dust, GTECMaterials.RhodiumNitrate,1)
                .outputItems(dust, Salt,2)
                .duration(300).EUt(VA[LV]).save(provider);

        MIXER_RECIPES.recipeBuilder("rhodium_filter_cake_solution")
                .inputItems(dust, GTECMaterials.RhodiumFilterCake,1)
                .inputFluids(Water.getFluid(1000))
                .outputFluids(GTECMaterials.RhodiumFilterCakeSolution.getFluid(1000))
                .duration(300).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("reprecipitated_rhodium")
                .inputFluids(GTECMaterials.RhodiumFilterCakeSolution.getFluid(1000))
                .circuitMeta(2)
                .outputItems(dust, GTECMaterials.ReprecipitatedRhodium,1)
                .duration(300).EUt(VA[LV]).save(provider);

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
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("ruthenium_tetroxide")
                .inputItems(dust, GTECMaterials.SodiumRuthenate,6)
                .inputFluids(Chlorine.getFluid(3000))
                .outputFluids(GTECMaterials.RutheniumTetroxideSolution.getFluid(9000))
                .duration(300).EUt(VA[LV]).save(provider);

        FLUID_HEATER_RECIPES.recipeBuilder("hot_ruthenium_tetroxide")
                .inputFluids(GTECMaterials.RutheniumTetroxideSolution.getFluid(50))
                .outputFluids(GTECMaterials.HotRutheniumTetroxideSolution.getFluid(50))
                .duration(18).EUt(VA[HV]).save(provider);

        DISTILLATION_RECIPES.recipeBuilder("hot_ruthenium_tetroxide_distill")
                .inputFluids(GTECMaterials.HotRutheniumTetroxideSolution.getFluid(9000))
                .outputItems(dust, Salt,5)
                .outputFluids(Water.getFluid(1800))
                .outputFluids(RutheniumTetroxide.getFluid(7200))
                .duration(1500).EUt(VA[HV]).save(provider);

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder("ruthenium_tetroxide_completion")
                .circuitMeta(1)
                .inputFluids(RutheniumTetroxide.getFluid(1000))
                .outputItems(dust, RutheniumTetroxide, 1)
                .duration(33).EUt(VA[LV]).save(provider);

        // Ruthenium Completion <----------  Fourth Platinum Line output (im still sane)

        CHEMICAL_RECIPES.recipeBuilder("ruthenium_dust_completion")
                .inputItems(dust, RutheniumTetroxide,1)
                .inputFluids(HydrochloricAcid.getFluid(6000))
                .outputItems(dust, Ruthenium,1)
                .outputFluids(Water.getFluid(2000))
                .outputFluids(Chlorine.getFluid(6000))
                .duration(33).EUt(VA[LV]).save(provider);

        // Osmium Processing Time!

        BLAST_RECIPES.recipeBuilder("rarest_metal_residue_ebf")
                .inputItems(dust, GTECMaterials.RarestMetalResidue,2)
                .circuitMeta(11)
                .inputFluids(HydrochloricAcid.getFluid(500))
                .outputItems(dust, IridiumMetalResidue, 1)
                .outputFluids(AcidicOsmiumSolution.getFluid(1000))
                .duration(100).EUt(VA[MV]).save(provider);

        BLAST_RECIPES.recipeBuilder("acidic_osmium_solution_distill")
                .inputFluids(AcidicOsmiumSolution.getFluid(1000))
                .outputFluids(GTECMaterials.OsmiumSolution.getFluid(100))
                .outputFluids(Water.getFluid(900))
                .duration(150).EUt(VA[IV]).save(provider);

        // Osmium Completion <---- Fifth platline output

        CHEMICAL_RECIPES.recipeBuilder("osmium_dust_completion")
                .inputFluids(HydrochloricAcid.getFluid(6000))
                .inputFluids(AcidicOsmiumSolution.getFluid(1000))
                .outputFluids(Water.getFluid(900))
                .outputItems(dust, Iridium,1)
                .outputFluids(Water.getFluid(2000))
                .outputFluids(Chlorine.getFluid(7000))
                .duration(300).EUt(VA[LV]).save(provider);

        // Iridium Processing!

        BLAST_RECIPES.recipeBuilder("iridium_metal_residue_process")
                .inputItems(dust, IridiumMetalResidue,1)
                .circuitMeta(1)
                .outputItems(dust, GTECMaterials.SludgeDustResidue,1)
                .outputItems(dust, GTECMaterials.IridiumDioxide,1)
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("iridium_dioxide_dissolving")
                .inputItems(dust, GTECMaterials.IridiumDioxide,1)
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .outputFluids(GTECMaterials.AcidicIridiumSolution.getFluid(1000))
                .duration(300).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("iridium_chloride")
                .inputItems(dust, AmmoniumChloride, 88)
                .inputFluids(GTECMaterials.AcidicIridiumSolution.getFluid(1000))
                .outputItems(dust,IridiumChloride,1)
                .outputFluids(Ammonia.getFluid(3000))
                .duration(300).EUt(VA[LV]).save(provider);

        // Iridium Completion <-------- Holy shit Platline Finally completed


        CHEMICAL_RECIPES.recipeBuilder("iridium_dust_completion")
                .inputItems(dust, IridiumChloride,1)
                .inputItems(dust, Calcium,1)
                .outputItems(dust, GTECMaterials.MetallicSludgeResidue,1)
                .outputItems(dust, Iridium,1)
                .outputItems(dust, CalciumChloride, 4)
                .duration(300).EUt(VA[EV]).save(provider);

    }
}
