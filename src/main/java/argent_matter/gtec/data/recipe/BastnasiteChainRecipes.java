package argent_matter.gtec.data.recipe;

import net.minecraft.data.recipes.FinishedRecipe;
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
import net.minecraft.world.item.crafting.BlastingRecipe;

import javax.swing.plaf.multi.MultiViewportUI;
import java.util.function.Consumer;

public class BastnasiteChainRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        bastnasitechainProcesses(provider);
    }
    public static void bastnasitechainProcesses(Consumer<FinishedRecipe> provider) {
        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("muddy_bastnasite_rare_earth_solution"))
                .inputItems(crushed, Bastnasite,2)
                .inputFluids(NitricAcid.getFluid(700))
                .outputItems(dust, SiliconDioxide,1)
                .outputFluids(GTECMaterials.MuddyBastnasiteRareEarthSolution.getFluid(400))
                .blastFurnaceTemp(800)
                .duration(400).EUt(VA[EV]).save(provider);

        CRACKING_RECIPES.recipeBuilder(GTExtendedChem.id("steam_cracked_bastnasite_mud"))
                .inputFluids(Steam.getFluid(1000))
                .inputFluids(GTECMaterials.MuddyBastnasiteRareEarthSolution.getFluid(1000))
                .outputFluids(GTECMaterials.SteamCrackedMuddyBastnasiteRareEarthSolution.getFluid(2000))
                .duration(600).EUt(VA[HV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("hexafluorosilic_acid"))
                .inputItems(dust, Silicon,1)
                .inputFluids(HydrofluoricAcid.getFluid(6000))
                .outputFluids(Hydrogen.getFluid(4000))
                .outputFluids(GTECMaterials.HexafluorosilicAcid.getFluid(1000))
                .duration(400).EUt(VA[MV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("hexafluorosilic_acid"))
                .inputItems(dust, Salt,4)
                .inputFluids(GTECMaterials.HexafluorosilicAcid.getFluid(1000))
                .outputFluids(HydrochloricAcid.getFluid(2000))
                .outputFluids(GTECMaterials.Sodiumfluorosilicate.getFluid(1000))
                .duration(600).EUt(VA[HV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTExtendedChem.id("conditioned_bastnasite_mud"))
                .circuitMeta(6)
                .inputFluids(GTECMaterials.SteamCrackedMuddyBastnasiteRareEarthSolution.getFluid(1000))
                .inputFluids(GTECMaterials.Sodiumfluorosilicate.getFluid(320))
                .outputFluids(GTECMaterials.ConditionedBastnasiteMud.getFluid(1320))
                .duration(800).EUt(VA[MV]).save(provider);

        // Disollution Tank Soon to be added!
        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("diluted_bastnasite_mud"))
                .inputItems(dust, Saltpeter,1)
                .inputFluids(GTECMaterials.ConditionedBastnasiteMud.getFluid(1000))
                .inputFluids(Water.getFluid(10000))
                .outputFluids(GTECMaterials.DilutedBastnasiteMud.getFluid(11000))
                .blastFurnaceTemp(2400)
                .duration(1000).EUt(VA[EV]).save(provider);

        CENTRIFUGE_RECIPES.recipeBuilder("filtered_bastnasite_mud")
                .inputFluids(GTECMaterials.DilutedBastnasiteMud.getFluid(1000))
                .chancedOutput(dust, SiliconDioxide,1,9000,0)
                .chancedOutput(dust, Rutile,1,7500,0)
                .chancedOutput(dust, GTECMaterials.RedZircon,1, 1000,0)
                .chancedOutput(dust, Ilmenite,1,500,0)
                .outputFluids(GTECMaterials.FilteredBastnasiteMud.getFluid(400))
                .duration(400).EUt(VA[HV]).save(provider);

        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("bastnasite_rare_earth_oxides"))
                .inputFluids(GTECMaterials.FilteredBastnasiteMud.getFluid(1000))
                .outputItems(dust, GTECMaterials.BastnasiteRareEarthOxides,1)
                .blastFurnaceTemp(1400)
                .duration(500).EUt(VA[EV]).save(provider);

        CHEMICAL_BATH_RECIPES.recipeBuilder(GTExtendedChem.id("acid_leached_bastnasite_rare_earth_oxides_dust"))
                .inputItems(dust, GTECMaterials.BastnasiteRareEarthOxides,1)
                .inputFluids(HydrochloricAcid.getFluid(500))
                .outputItems(dust, GTECMaterials.AcidLeachedBastnasiteRareEarthOxides,1)
                .duration(200).EUt(VA[LV]).save(provider);

        BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("roasted_rare_earth_oxides_dust"))
                .inputItems(dust, GTECMaterials.AcidLeachedBastnasiteRareEarthOxides,1)
                .inputFluids(Oxygen.getFluid(1000))
                .outputItems(dust, GTECMaterials.RoastedRareEarthOxides,1)
                .outputFluids(Fluorine.getFluid(13))
                .blastFurnaceTemp(1200)
                .duration(600).EUt(VA[MV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTExtendedChem.id("wet_rare_earth_oxides"))
                .circuitMeta(7)
                .inputItems(dust, GTECMaterials.RoastedRareEarthOxides,1)
                .inputFluids(Water.getFluid(200))
                .outputItems(dust, GTECMaterials.WetRareEarthOxides,1)
                .duration(100).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("cerium_oxidesed_rare_earth_oxides_dust"))
                .inputItems(dust, GTECMaterials.WetRareEarthOxides,1)
                .inputFluids(Fluorine.getFluid(4000))
                .outputItems(dust, GTECMaterials.CeriumOxidisedRareEarthOxides,1)
                .duration(300).EUt(VA[HV]).save(provider);

        CENTRIFUGE_RECIPES.recipeBuilder(GTExtendedChem.id("cerium_oxidesed_rare_earth_oxides_dust_separation"))
                .inputItems(dust, GTECMaterials.CeriumOxidisedRareEarthOxides,1)
                .outputItems(dust, GTECMaterials.BastnasiteRareEarthOxides,1)
                .chancedOutput(dust, GTECMaterials.CeriumDioxide,1,7000,0)
                .duration(600).EUt(VA[HV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTExtendedChem.id("nitrogenated_bastnassite_rarer_earth_oxides"))
                .inputItems(dust, GTECMaterials.BastnasiteRareEarthOxides,1)
                .inputFluids(NitricAcid.getFluid(400))
                .outputFluids(GTECMaterials.NitrogenatedRarerEarthOxidess.getFluid(1000))
                .duration(300).EUt(VA[HV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("bastnasite_rare_earth_oxides_suspension"))
                .inputFluids(GTECMaterials.NitrogenatedRarerEarthOxidess.getFluid(1000))
                .inputFluids(Acetone.getFluid(1000))
                .outputFluids(GTECMaterials.BastnasiteRarerEarthOxidessSuspension.getFluid(1000))
                .duration(700).EUt(VA[HV]).save(provider);

        CENTRIFUGE_RECIPES.recipeBuilder(GTExtendedChem.id("bastnasite_rare_earth_oxides_suspension_separation"))
                .inputFluids(GTECMaterials.BastnasiteRarerEarthOxidessSuspension.getFluid(1000))
                .chancedOutput(dust, GTECMaterials.NeodymiumRareEarthConcentrate,1,5000,0)
                .chancedOutput(dust, GTECMaterials.SamaricRareEarthConcentrate,1,5000,0)
                .outputFluids(GTECMaterials.DilutedAcetone.getFluid(750))
                .duration(900).EUt(VA[HV]).save(provider);

        DISTILLERY_RECIPES.recipeBuilder(GTExtendedChem.id("back_to_acetone"))
                .inputFluids(GTECMaterials.DilutedAcetone.getFluid(50))
                .outputFluids(Acetone.getFluid(30))
                .duration(24).EUt(VA[MV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("neodymium_rare_earth_concentrate_separation"))
                .inputItems(dust, GTECMaterials.NeodymiumRareEarthConcentrate,2)
                .inputFluids(HydrochloricAcid.getFluid(2000))
                .outputItems(dust, GTECMaterials.LanthanumChloride,1)
                .outputItems(dust, GTECMaterials.NeodymiumOxide,1)
                .duration(900).EUt(VA[EV]).save(provider);

        ELECTROLYZER_RECIPES.recipeBuilder(GTExtendedChem.id("lanthanum_chloride_separation"))
                .inputItems(dust, GTECMaterials.LanthanumChloride,4)
                .outputItems(dust, Lanthanum,1)
                .outputFluids(Chlorine.getFluid(3000))
                .duration(54).EUt(VA[MV]).save(provider);

        ELECTROLYZER_RECIPES.recipeBuilder(GTExtendedChem.id("neodymium_oxide_separation"))
                .inputItems(dust, GTECMaterials.NeodymiumOxide,5)
                .outputItems(dust, Neodymium,2)
                .outputFluids(Oxygen.getFluid(3000))
                .duration(70).EUt(VA[MV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("fluorinated_samaric_residue_dust"))
            .inputItems(dust, GTECMaterials.SamaricRareEarthConcentrate,1)
            .inputFluids(HydrofluoricAcid.getFluid(2000))
            .outputItems(dust, GTECMaterials.FluorinatedSamaricConcentrate,1)
            .duration(300).EUt(VA[HV]).save(provider);

    BLAST_RECIPES.recipeBuilder(GTExtendedChem.id("samarium_terbium_mixture_dust"))
            .inputItems(dust, GTECMaterials.FluorinatedSamaricConcentrate,8)
            .inputItems(dust, Calcium,4)
            .outputItems(dust, Holmium,1)
            .outputItems(dust, GTECMaterials.SamariumTerbiumMixture,4)
            .outputFluids(GTECMaterials.CalciumFluoride.getFluid(12000))
            .blastFurnaceTemp(1200)
            .duration(1600).EUt(VA[EV]).save(provider);

    FLUID_SOLIDFICATION_RECIPES.recipeBuilder(GTExtendedChem.id("calcium_fluoride_solidifaction"))
            .inputFluids(GTECMaterials.CalciumFluoride.getFluid(1000))
            .outputItems(dust, GTECMaterials.CalciumFluoride,1)
            .duration(25).EUt(VA[LV]).save(provider);

    // Large Chemical Plant To be added if needed
    LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("hydrated_ammonium_nitrate_slurry"))
            .circuitMeta(14)
            .inputFluids(Ammonia.getFluid(4000))
            .inputFluids(NitricAcid.getFluid(4000))
            .outputFluids(GTECMaterials.HydratedAmmoniumNitrateSlurry.getFluid(5184))
            .duration(1200).EUt(VA[MV]).save(provider);

    // Dehydrator To be added!
    FLUID_SOLIDFICATION_RECIPES.recipeBuilder("ammonium_nitrate_solidifaction")
            .circuitMeta(8)
            .inputFluids(GTECMaterials.HydratedAmmoniumNitrateSlurry.getFluid(144))
            .outputItems(dust, GTECMaterials.AmmoniumNitrate,1)
            .duration(225).EUt(VA[HV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("nitrogenated_samarium_terbium_mixture_dust"))
            .inputItems(dust, GTECMaterials.SamariumTerbiumMixture,1)
            .inputItems(dust, GTECMaterials.AmmoniumNitrate,9)
            .outputItems(dust, GTECMaterials.NitrogenatedSamariumTerbiumMixture,1)
            .duration(600).EUt(VA[HV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder(GTExtendedChem.id("samaric_residue_bastnasite_line_completion"))
            .inputItems(dust, GTECMaterials.NitrogenatedSamariumTerbiumMixture,4)
            .inputItems(dust, Copper,1)
            .outputItems(dust, GTECMaterials.TerbiumNitrate,2)
            .outputItems(dust, GTECMaterials.SamaricResidue,2)
            .duration(3200).EUt(VA[EV]).save(provider);

    ELECTROLYZER_RECIPES.recipeBuilder(GTExtendedChem.id("terbium_completion"))
            .inputItems(dust, GTECMaterials.TerbiumNitrate,5)
            .outputItems(dust, Terbium,1)
            .outputFluids(Oxygen.getFluid(3000))
            .outputFluids(Nitrogen.getFluid(1000))
            .duration(32).EUt(VA[MV]).save(provider);
    }
}
