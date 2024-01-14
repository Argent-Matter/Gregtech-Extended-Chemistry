package argent_matter.gtec.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import net.minecraft.world.item.crafting.BlastingRecipe;

import javax.swing.plaf.ProgressBarUI;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;


public class GTECMaterials {
    public static void init() {
        IronMagnetic.addFlags(GENERATE_FOIL);
        Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Gadolinium.setProperty(PropertyKey.DUST, new DustProperty());
        RutheniumTetroxide.setProperty(PropertyKey.FLUID, new FluidProperty());
        RutheniumTetroxide.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
        Iodine.setProperty(PropertyKey.FLUID, new FluidProperty());
        Iodine.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.GAS,new FluidBuilder());
    }


    // PlatinumLine
    public static final Material PlatinumMetallicPowder = new Material.Builder("platinum_metallic_powder")
            .dust(1)
            .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
            .buildAndRegister()
            .setFormula("??PtPdIrOsRhRu??", true);

    public static final Material PlatinumResidue = new Material.Builder("platinum_residue")
            .dust(1)
            .color(0x64601C)
            .buildAndRegister()
            .setFormula("??IrOsRhRu??", true);

    public static final Material PlatinumConcentrate = new Material.Builder("platinum_concentrate")
            .fluid()
            .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
            .buildAndRegister();

    public static final Material PlatinumSalt = new Material.Builder("platinum_salt")
            .dust(1)
            .color(0xF0EC9A).iconSet(MaterialIconSet.DULL)
            .buildAndRegister();

    public static final Material RefinedPlatlinumSalt = new Material.Builder("refined_platinum_salt")
            .dust(1)
            .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
            .buildAndRegister();

    public static final Material RepercipitatedPlatinum = new Material.Builder("repercipitated_platinum")
            .dust(1)
            .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
            .buildAndRegister()
            .setFormula("PtCl", true);

    public static final Material PalladiumEnrichedAmmonia = new Material.Builder("palladium_enriched_ammonia")
            .fluid()
            .color(0x65655E)
            .buildAndRegister()
            .setFormula("?Pd", true);

    public static final Material PalladiumMetallicPowder = new Material.Builder("palladium_metallic_powder")
            .dust(1)
            .color(0x65655E).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??Pd??", true);

    public static final Material PalladiumSalt = new Material.Builder("palladium_salt")
            .dust(1)
            .color(0x65655E).iconSet(METALLIC)
            .buildAndRegister();

    public static final Material RepercipitatedPalladium = new Material.Builder("reprecipitated_palladium")
            .dust(1)
            .color(0x65655E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("Pd2NH4", true);

    public static final Material FormicAcid = new Material.Builder("formic_acid")
            .fluid()
            .color(0xDCA358)
            .buildAndRegister()
            .setFormula("CH2O2", true);

    public static final Material PotassiumDisulfate = new Material.Builder("potassium_disulfate")
            .dust(1)
            .color(0xEEA23E)
            .buildAndRegister()
            .setFormula("K2S2O7", true);

    public static final Material RhodiumSulfateSolution = new Material.Builder("diluted_rhodium_sulfate_solution")
            .fluid()
            .color(0xDB973B)
            .buildAndRegister();

    public static final Material LeachResidue = new Material.Builder("leach_residue")
            .dust(1)
            .color(0x543A17)
            .buildAndRegister()
            .setFormula("??IrOsRu??", true);

    public static final Material CrudeRhodiumMetal = new Material.Builder("crude_rhodium_metal")
            .dust(1)
            .color(0xDB973B).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??Rh??", true);

    public static final Material RhodiumSalt = new Material.Builder("rhodium_salt")
            .dust(1)
            .color(0xDB973B).iconSet(SHINY)
            .buildAndRegister();

    public static final Material RhodiumSaltSolution = new Material.Builder("rhodium_salt_solution")
            .fluid()
            .color(0x91AEC4)
            .buildAndRegister();

    public static final Material ZincSulfate = new Material.Builder("zinc_sulfate")
            .dust(1)
            .color(0x7C4D0E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZnSO4", true);

    public static final Material SodiumNitrate = new Material.Builder("sodium_nitrate")
            .dust(1)
            .color(0x498EC2)
            .buildAndRegister()
            .setFormula("NaNo3", true);

    public static final Material RhodiumNitrate = new Material.Builder("rhodium_nitrate")
            .dust(1)
            .color(0x614A0F).iconSet(METALLIC)
            .buildAndRegister();

    public static final Material RhodiumFilterCake = new Material.Builder("rhodium_filter_cake")
            .dust(1)
            .color(0x614A0F).iconSet(METALLIC)
            .buildAndRegister();

    public static final Material RhodiumFilterCakeSolution = new Material.Builder("rhodium_filter_cake_solution")
            .fluid()
            .color(0x4C6584)
            .buildAndRegister();

    public static final Material ReprecipitatedRhodium = new Material.Builder("reprecipitated_rhodium")
            .dust(1)
            .color(0xDB973B).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("Rh2NH4", true);

    public static final Material RarestMetalResidue = new Material.Builder("rarest_metal_residue")
            .dust(1)
            .color(0x5C4E35).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??OsIr??", true);

    public static final Material SodiumRuthenate = new Material.Builder("sodium_ruthenate")
            .dust(1)
            .color(0x3290BD).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("Na2RuO3", true);

    public static final Material RutheniumTetroxideSolution = new Material.Builder("ruthenium_tetroxide_solution")
            .fluid()
            .color(0x9FAAAF)
            .buildAndRegister()
            .setFormula("???", true);

    public static final Material HotRutheniumTetroxideSolution = new Material.Builder("hot_ruthenium_tetroxide_solution")
            .gas()
            .color(0x9FAAAF)
            .buildAndRegister()
            .setFormula("???", true);

    public static final Material OsmiumSolution = new Material.Builder("osmium_solution")
            .fluid()
            .color(0x7E6642)
            .buildAndRegister()
            .setFormula("???", true);

    public static final Material SludgeDustResidue = new Material.Builder("sludge_dust_residue")
            .dust(1)
            .color(0x775A30)
            .flags(DECOMPOSITION_BY_CENTRIFUGING)
            .components(SiliconDioxide, 3, Gold, 2)
            .buildAndRegister()
            .setFormula("(SiO2)3Au2", true);

    public static final Material IridiumDioxide = new Material.Builder("iridium_dioxide")
            .dust(1)
            .color(0x694B20).iconSet(ROUGH)
            .flags(DISABLE_DECOMPOSITION)
            .components(Iridium, 1, Oxygen, 2)
            .buildAndRegister()
            .setFormula("IrO2", true);

    public static final Material MetallicSludgeResidue = new Material.Builder("metallic_sludge_residue")
            .dust(1)
            .color(0x694B20).iconSet(ROUGH)
            .flags(DECOMPOSITION_BY_CENTRIFUGING)
            .components(Nickel, 1, Copper, 1)
            .buildAndRegister()
            .setFormula("NiCu", true);

    public static final Material AcidicIridiumSolution = new Material.Builder("acidic_iridium_solution")
            .fluid()
            .color(0x694B20)
            .buildAndRegister()
            .setFormula("???", true);


    // Monazite Chain Materials

    public static final Material MuddyMonaziteRareEarthSolution = new Material.Builder("muddy_monazite_rare_earth_solution")
            .fluid()
            .color(0x694C22).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??LaNdZr??", true);

    public static final Material DilutedMonaziteRareEarthMud = new Material.Builder("diluted_monazite_rare_earth_mud")
            .fluid()
            .color(0x835D27).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??LaNdHf??", true);

    public static final Material HafniaZirconiaBlend = new  Material.Builder("hafnia_zirconia_blend")
            .dust(1)
            .color(0xC1A47A).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??HfZr??", true);

    public static final Material ThoriumDioxide = new  Material.Builder("thorium_dioxide")
            .dust(1)
            .color(0x33312E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ThO2", true);

    public static final Material MonaziteSulfate = new  Material.Builder("monazite_sulfate")
            .dust(1)
            .color(0x5C421B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??CeEu??", true);

    public static final Material RedZircon = new  Material.Builder("red_zircon")
            .dust(1)
            .color(0xDB2025).iconSet(SHINY)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .components(Zirconium, 1, SiliconDioxide, 2, Oxygen, 2)
            .buildAndRegister()
            .setFormula("ZrSiO4", true);

    public static final Material DilutedMonaziteSulfate = new  Material.Builder("diluted_monazite_sulfate")
            .fluid()
            .color(0x5C421B).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("??LaNd??", true);

    public static final Material AmmoniumNitrateSolution = new  Material.Builder("ammonium_nitrate_solution")
            .fluid()
            .color(0xFFFFFF)
            .buildAndRegister()
            .setFormula("NH4NO3", true);

    public static final Material AcidicMonazitePowder = new  Material.Builder("acidic_monazite_powder")
            .dust(1)
            .color(0x241740).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRareEarthFiltrate = new  Material.Builder("monazite_rare_earth_filtrate")
            .dust(1)
            .color(0x1A1525).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material ThoriumPhosphateCake = new  Material.Builder("thorium_phosphate_cake")
            .dust(1)
            .color(0xBF2948).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??ThP??", true);

    public static final Material NeutralizedMonaziteRareEarthFiltrate = new  Material.Builder("neutralized_monazite_rare_earth_filtrate")
            .dust(1)
            .color(0x2B1946).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRareEarthHydroxideConcentrate = new  Material.Builder("monazite_rare_earth_hydroxide_concentrate")
            .dust(1)
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material UraniumFiltrate = new  Material.Builder("uranium_filtrate")
            .dust(1)
            .color(0x224521).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??U??", true);

    public static final Material DriedMonaziteRareEarthConcentrate = new  Material.Builder("dried_monazite_rare_earth_concentrate")
            .dust(1)
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material NitrogenatedMonaziteRareEarthConcentrate = new  Material.Builder("nitrogenated_monazite_rare_earth_concentrate")
            .fluid()
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??LaNd??", true);

    public static final Material NitricLeachedMonaziteMixture = new  Material.Builder("nitric_leached_monazite_mixture")
            .fluid()
            .color(0x9122A8)
            .buildAndRegister();

    public static final Material NitricMonaziteLeachedConcentrate = new  Material.Builder("nitric_monazatie_leached_concentrate")
            .fluid()
            .color(0xF6C62C)
            .buildAndRegister()
                .setFormula("??LaNd??", true);

    public static final Material CeriumDioxide = new  Material.Builder("cerium_dioxide")
            .dust(1)
            .color(0xDEE6E7)
            .buildAndRegister()
            .setFormula("CeO2", true);

    public static final Material CeriumChloride = new  Material.Builder("cerium_chloride")
            .dust(1)
            .color(0xDEE6E7)
            .buildAndRegister()
            .setFormula("CeCl3", true);

    public static final Material CooledMonaziteRareEarthConcentrate = new  Material.Builder("cooled_monazite_rare_earth_concentrate")
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRarerEarthSediment = new  Material.Builder("monaziterarer_earth_sediment")
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material HeterogenousHalogenicMonaziteRareEarthMixture = new  Material.Builder("heterogenic_halogenic_monazite_rare_earth_mixture")
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material SamaricResidue = new  Material.Builder("samaric_residue")
            .dust(1)
            .color(0xC4AB94).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??SmGd??", true);
    public static final Material SaturatedMonazatiteRareEarth = new  Material.Builder("satured_monazite_rare_earth")
            .dust(1)
            .color(0x5B480B).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material EuropiumIIIOxide = new  Material.Builder("europium_iii_oxide")
            .dust(1)
            .color(0xF4C8F4).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material Oxalate = new  Material.Builder("oxalate")
            .fluid()
            .color(0x47AD1F)
            .buildAndRegister()
            .setFormula("H2C2O4", true);


    public static final Material CeriumOxalate = new  Material.Builder("cerium_oxalate")
            .dust(1)
            .color(0xE4D7C5).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("Ce2(C2O4)3", true);

    public static final Material CeriumIIIOxide = new  Material.Builder("cerium_iii_oxide")
            .dust(1)
            .color(0xD8DA2F).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("Ce2(C2O4)3", true);

    public static final Material NeutralizedUraniumFiltrate = new  Material.Builder("neutralized_uranium_filtrate")
            .dust(1)
            .color(0xA62424).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??U??", true);

    public static final Material Hafnia = new  Material.Builder("hafnia")
            .dust(1)
            .color(0xBA9288).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("HfO2", true);

    public static final Material Zirconia = new  Material.Builder("zirconia")
            .dust(1)
            .color(0x7F4334).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZrO2", true);

    public static final Material HafniumTetrachloride = new  Material.Builder("hafnium_tetrachloride")
            .dust(1).fluid()
            .color(0xE2DEDD).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("HfCl4", true);

    public static final Material LowPurityHafnium = new  Material.Builder("low_purity_hafnium")
            .dust(1).fluid()
            .color(0xCCC3C1).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??Hf??", true);

    public static final Material HafniumIodide = new  Material.Builder("hafnium_idodide")
            .dust(1)
            .color(0xCB3818).iconSet(METALLIC)
            .components(GTECMaterials.LowPurityHafnium, 1, Iodine, 4)
            .flags(DISABLE_DECOMPOSITION)
            .buildAndRegister()
            .setFormula("HfI4", true);












}
