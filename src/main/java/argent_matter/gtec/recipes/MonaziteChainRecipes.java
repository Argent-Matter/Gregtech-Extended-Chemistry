package argent_matter.gtec.recipes;

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

public class MonaziteChainRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        MonazitechainProcesses(provider);
    }

    public static void MonazitechainProcesses(Consumer<FinishedRecipe> provider) {

        BLAST_RECIPES.recipeBuilder("monazite_digestion")
                .inputItems(crushed, Monazite, 2)
                .inputFluids(NitricAcid.getFluid(700))
                .outputItems(dust,SiliconDioxide,1)
                .outputFluids(GTECMaterials.MuddyMonaziteRareEarthSolution.getFluid(400))
                .blastFurnaceTemp(2400)
                .duration(400).EUt(VA[EV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("monazite_rare_earth_solution_dilution")
                .inputItems(dust, Saltpeter,1)
                .inputFluids(GTECMaterials.MuddyMonaziteRareEarthSolution.getFluid(1000))
                .inputFluids(Water.getFluid(10000))
                .circuitMeta(1)
                .outputItems(dustTiny, GTECMaterials.HafniaZirconiaBlend,4)
                .outputItems(dust, GTECMaterials.ThoriumDioxide,1)
                .outputItems(dustTiny, Monazite,2)
                .outputFluids(GTECMaterials.DilutedMonaziteRareEarthMud.getFluid(11000))
                .duration(900).EUt(VA[HV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("bulk_monazite_rare_earth_solution_dilution")
                .inputItems(dust, Saltpeter,9)
                .inputFluids(GTECMaterials.MuddyMonaziteRareEarthSolution.getFluid(9000))
                .inputFluids(Water.getFluid(90000))
                .circuitMeta(9)
                .outputItems(dust, GTECMaterials.HafniaZirconiaBlend,4)
                .outputItems(dust, GTECMaterials.ThoriumDioxide,9)
                .outputItems(dust, Monazite,2)
                .outputFluids(GTECMaterials.DilutedMonaziteRareEarthMud.getFluid(99000))
                .duration(8100).EUt(VA[HV]).save(provider);

        SIFTER_RECIPES.recipeBuilder("diluted_rare_mud_sifting")
                .inputFluids(GTECMaterials.DilutedMonaziteRareEarthMud.getFluid(1000))
                .chancedOutput(dust, GTECMaterials.MonaziteSulfate, 9000,10)
                .chancedOutput(dust, SiliconDioxide, 7500,10)
                .chancedOutput(dust, Rutile, 2000,50)
                .chancedOutput(dust, GTECMaterials.RedZircon, 500,10)
                .chancedOutput(dust, Ilmenite, 2000,1)
                .duration(400).EUt(VA[HV]).save(provider);

        MIXER_RECIPES.recipeBuilder("diluted_monazite_sulfate")
                .inputItems(dust, GTECMaterials.MonaziteSulfate,1)
                .inputFluids(Water.getFluid(6000))
                .outputFluids(GTECMaterials.DilutedMonaziteSulfate.getFluid(7000))
                .duration(480).EUt(VA[HV]).save(provider);


        LARGE_CHEMICAL_RECIPES.recipeBuilder("acidic_monazite_dust")
                .inputFluids(GTECMaterials.DilutedMonaziteSulfate.getFluid(1000))
                .inputFluids(GTECMaterials.AmmoniumNitrateSolution.getFluid(200))
                .circuitMeta(13)
                .outputItems(dustTiny, GTECMaterials.AcidicMonazitePowder,3)
                .duration(480).EUt(VA[HV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("bulk_acidic_monazite_dust")
                .inputFluids(GTECMaterials.DilutedMonaziteSulfate.getFluid(9000))
                .inputFluids(GTECMaterials.AmmoniumNitrateSolution.getFluid(1800))
                .circuitMeta(14)
                .outputItems(dust, GTECMaterials.AcidicMonazitePowder,3)
                .duration(4320).EUt(VA[HV]).save(provider);

        SIFTER_RECIPES.recipeBuilder("acidic_monazite_sifting")
                .inputItems(dust, GTECMaterials.AcidicMonazitePowder,1)
                .chancedOutput(dust, GTECMaterials.MonaziteRareEarthFiltrate, 9000,0)
                .chancedOutput(dust, GTECMaterials.ThoriumPhosphateCake, 7000,0)
                .duration(600).EUt(VA[HV]).save(provider);

        CHEMICAL_BATH_RECIPES.recipeBuilder("neutralized_monazite")
                .inputItems(dust, GTECMaterials.MonaziteRareEarthFiltrate,1)
                .inputFluids(HydrochloricAcid.getFluid(320))
                .outputItems(dust, GTECMaterials.NeutralizedMonaziteRareEarthFiltrate,1)
                .duration(120).EUt(VA[HV]).save(provider);

        SIFTER_RECIPES.recipeBuilder("neutralized_monazite_sifting")
                .inputItems(dust, GTECMaterials.NeutralizedMonaziteRareEarthFiltrate,1)
                .chancedOutput(dust, GTECMaterials.MonaziteRareEarthHydroxideConcentrate, 9000,0)
                .chancedOutput(dust, GTECMaterials.UraniumFiltrate, 5000,0)
                .chancedOutput(dust, GTECMaterials.UraniumFiltrate, 4000,0)
                .duration(800).EUt(VA[HV]).save(provider);

        BLAST_RECIPES.recipeBuilder("dried_monazite_rare_earth")
                .inputItems(dust, GTECMaterials.MonaziteRareEarthHydroxideConcentrate,1)
                .outputItems(dust, GTECMaterials.DriedMonaziteRareEarthConcentrate,1)
                .blastFurnaceTemp(1200)
                .duration(300).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("nitrogenated_monazite_rare_earth_concentrate")
                .inputItems(dust, GTECMaterials.DriedMonaziteRareEarthConcentrate,1)
                .inputFluids(NitricAcid.getFluid(500))
                .outputFluids(GTECMaterials.NitrogenatedMonaziteRareEarthConcentrate.getFluid(1000))
                .duration(500).EUt(VA[HV]).save(provider);

        MIXER_RECIPES.recipeBuilder("nitric_leached_monazite_mixture")
                .inputFluids(Water.getFluid(1000))
                .inputFluids(GTECMaterials.NitrogenatedMonaziteRareEarthConcentrate.getFluid(100))
                .outputFluids(GTECMaterials.NitricLeachedMonaziteMixture.getFluid(1000))
                .duration(200).EUt(VA[MV]).save(provider);

        SIFTER_RECIPES.recipeBuilder("nitric_leached_monazite_sifting")
                .inputFluids(GTECMaterials.NitricLeachedMonaziteMixture.getFluid(1000))
                .chancedOutput(dust, GTECMaterials.CeriumDioxide,1111,0)
                .outputFluids(GTECMaterials.NitricMonaziteLeachedConcentrate.getFluid(1000))
                .duration(400).EUt(VA[HV]).save(provider);

        VACUUM_RECIPES.recipeBuilder("cooled_monazite_rare_earth_concentrate")
                .inputFluids(GTECMaterials.NitricMonaziteLeachedConcentrate.getFluid(1000))
                .outputItems(dust, GTECMaterials.CooledMonaziteRareEarthConcentrate,1)
                .duration(100).EUt(VA[HV]).save(provider);

        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder("cooled_monazite_separation")
                .inputItems(dust, GTECMaterials.CooledMonaziteRareEarthConcentrate,1)
                .chancedOutput(dust, GTECMaterials.MonaziteRarerEarthSediment,9000,0)
                .chancedOutput(dust, GTECMaterials.EuropiumIIIOxide,5,500,0)
                .duration(600).EUt(VA[EV]).save(provider);

        BLAST_RECIPES.recipeBuilder("heterogenous_halogenic_rare_earth")
                .inputItems(dust, GTECMaterials.MonaziteRarerEarthSediment,1)
                .inputFluids(Chlorine.getFluid(1000))
                .outputItems(dust, GTECMaterials.HeterogenousHalogenicMonaziteRareEarthMixture,1)
                .duration(500).EUt(VA[HV]).save(provider);

        MIXER_RECIPES.recipeBuilder("satured_rare_earth_dust")
                .inputItems(dust, Salt,1)
                .inputItems(dust, GTECMaterials.HeterogenousHalogenicMonaziteRareEarthMixture,1)
                .inputFluids(Acetone.getFluid(1000))
                .outputItems(dust, GTECMaterials.SaturatedMonazatiteRareEarth,1)
                .duration(200).EUt(VA[HV]).save(provider);

        CENTRIFUGE_RECIPES.recipeBuilder("samaric_residue")
                .inputItems(dust, GTECMaterials.SaturatedMonazatiteRareEarth,4)
                .circuitMeta(4)
                .outputItems(dust, GTECMaterials.SamaricResidue,3)
                .outputFluids(Chloromethane.getFluid(400))
                .duration(3150).EUt(VA[EV]).save(provider);

        // Samarium/Gadolinium Dust Finally!

        SIFTER_RECIPES.recipeBuilder("samarium_dust_completion")
                .inputItems(dust, GTECMaterials.SamaricResidue,3)
                .outputItems(dust, Samarium,2)
                .outputItems(dust, Gadolinium,1)
                .duration(133).EUt(VA[EV]).save(provider);

        // Cerium Time

        CHEMICAL_RECIPES.recipeBuilder("cerium_chloride_one")
                .inputItems(dust, GTECMaterials.CeriumDioxide,3)
                .inputItems(dustSmall, AmmoniumChloride,2)
                .outputItems(dust, GTECMaterials.CeriumChloride,4)
                .outputFluids(Ammonia.getFluid(3000))
                .outputFluids(Steam.getFluid(4000))
                .duration(300).EUt(VA[HV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("cerium_oxalate")
                .inputItems(dust, GTECMaterials.CeriumChloride,8)
                .circuitMeta(1)
                .inputFluids(GTECMaterials.Oxalate.getFluid(3000))
                .outputItems(dust, GTECMaterials.CeriumOxalate,5)
                .outputFluids(HydrochloricAcid.getFluid(6000))
                .duration(300).EUt(VA[HV]).save(provider);

        BLAST_RECIPES.recipeBuilder("cerium_iii_oxide")
                .inputItems(dust, GTECMaterials.CeriumOxalate,5)
                .inputItems(dust, Carbon,3)
                .outputItems(dust, GTECMaterials.CeriumIIIOxide,5)
                .outputFluids(Chlorine.getFluid(9000))
                .blastFurnaceTemp(800)
                .duration(200).EUt(VA[HV]).save(provider);

        // Cerium Completion
        ELECTROLYZER_RECIPES.recipeBuilder("cerium_dust_completion")
                .inputItems(dust, GTECMaterials.CeriumDioxide,5)
                .outputItems(dust, Cerium,2)
                .outputFluids(Oxygen.getFluid(3000))
                .duration(70).EUt(VA[MV]).save(provider);

        // Uranium Reprocessing

        CHEMICAL_BATH_RECIPES.recipeBuilder("neutralizing_uranium_filtrate")
                .inputItems(dust, GTECMaterials.UraniumFiltrate,1)
                .inputFluids(HydrofluoricAcid.getFluid(100))
                .outputItems(dust, GTECMaterials.NeutralizedUraniumFiltrate,1)
                .duration(360).EUt(VA[MV]).save(provider);


        SIFTER_RECIPES.recipeBuilder("uranium_dust_completion")
                .inputItems(dust, GTECMaterials.NeutralizedUraniumFiltrate,1)
                .chancedOutput(dust, Uranium238, 4500,0)
                .chancedOutput(dust, Uranium238, 4000,0)
                .chancedOutput(dust, Uranium238, 3000,0)
                .chancedOutput(dust, Uranium235, 3000,0)
                .chancedOutput(dust, Uranium235, 2000,0)
                .duration(1000).EUt(VA[LV]).save(provider);

        // Hafnium Processing
        CHEMICAL_RECIPES.recipeBuilder("hafnium_tetrachloride")
                .inputItems(dust, GTECMaterials.Hafnia,3)
                .inputFluids(HydrochloricAcid.getFluid(4000))
                .outputItems(dust, GTECMaterials.HafniumTetrachloride,5)
                .outputFluids(Water.getFluid(2000))
                .duration(300).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("hafnium_tetrochloride_solution")
                .inputItems(dust, GTECMaterials.HafniumTetrachloride,5)
                .inputFluids(Water.getFluid(2000))
                .outputFluids(GTECMaterials.HafniumTetrachloride.getFluid(1000))
                .duration(200).EUt(VA[LV]).save(provider);

        BLAST_RECIPES.recipeBuilder("low_purity_hafnium")
                .inputItems(dust, Magnesium,2)
                .inputFluids(GTECMaterials.HafniumTetrachloride.getFluid(1000))
                .circuitMeta(2)
                .outputItems(dust, GTECMaterials.LowPurityHafnium,1)
                .outputItems(dust, MagnesiumChloride,6)
                .blastFurnaceTemp(2700)
                .duration(600).EUt(VA[EV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("hafnium_idodide")
                .inputItems(dust, GTECMaterials.LowPurityHafnium,1)
                .circuitMeta(1)
                .inputFluids(Iodine.getFluid(4000))
                .duration(300).EUt(VA[LV]).save(provider);

        BLAST_RECIPES.recipeBuilder("hot_hafnium_ingot")
                .inputItems(dust, GTECMaterials.HafniumIodide,5)
                .outputItems(ingot, Hafnium,1)
                .outputFluids(Iodine.getFluid(4000))
                .blastFurnaceTemp(3400)
                .duration(600).EUt(VA[LV]).save(provider);













    }
}
