package argent_matter.gtec.common.data;

import argent_matter.gtec.GTExtendedChem;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;



public class GTECMaterials {
    public static void init() {
    }

    public static void modifyMaterials() {
        IronMagnetic.addFlags(GENERATE_FOIL);
        Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Hafnium.setProperty(PropertyKey.BLAST, new BlastProperty(3400));
        Zirconium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Zirconium.setProperty(PropertyKey.BLAST, new BlastProperty(4500));
        Gadolinium.setProperty(PropertyKey.DUST, new DustProperty());
        Holmium.setProperty(PropertyKey.DUST, new DustProperty());
        Terbium.setProperty(PropertyKey.DUST, new DustProperty());
        RutheniumTetroxide.setProperty(PropertyKey.FLUID, new FluidProperty());
        RutheniumTetroxide.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
        Iodine.setProperty(PropertyKey.FLUID, new FluidProperty());
        Iodine.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.GAS, new FluidBuilder());
    }

// Starting Over...

    // Nuclear Update
    /*
    public static final Material URANIUM_CONCENTRATE = new Material.Builder(GTExtendedChem.id("uranium_concentrate"))
            .dust(1)
            .color(0x877924).iconSet(DULL)
            .buildAndRegister()
            .setFormula("U3O8", true);

    public static final Material SODIUM_CARBONATE = new Material.Builder(GTExtendedChem.id("sodium_carbonate"))
            .dust(1)
            .color(0xD6D6D6).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("Na2CO3", true);

    public static final Material URANIUM_LEACHATE = new Material.Builder(GTExtendedChem.id("uranium_leachate"))
            .fluid()
            .color(0xA3D14C).iconSet(DULL)
            .buildAndRegister();

    public static final Material TRIBUTYL_PHOSPHATE = new Material.Builder(GTExtendedChem.id("tributyl_phosphate"))
            .fluid()
            .color(0xA3D14C).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("Na2CO3", true);

}
     */

    // PlatinumLine
    public static final Material PlatinumMetallicPowder = new Material.Builder(GTExtendedChem.id("platinum_metallic_powder"))
            .dust(1)
            .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
            .buildAndRegister()
            .setFormula("??PtPdIrOsRhRu??", true);

    public static final Material PlatinumResidue = new Material.Builder(GTExtendedChem.id("platinum_residue"))
            .dust(1)
            .color(0x64601C)
            .buildAndRegister()
            .setFormula("??IrOsRhRu??", true);

    public static final Material PlatinumConcentrate = new Material.Builder(GTExtendedChem.id("platinum_concentrate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
            .buildAndRegister();

    public static final Material PlatinumSalt = new Material.Builder(GTExtendedChem.id("platinum_salt"))
            .dust(1)
            .color(0xF0EC9A).iconSet(MaterialIconSet.DULL)
            .buildAndRegister();

    public static final Material RefinedPlatlinumSalt = new Material.Builder(GTExtendedChem.id("refined_platinum_salt"))
            .dust(1)
            .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
            .buildAndRegister();

    public static final Material ReprecipitatedPlatinum = new Material.Builder(GTExtendedChem.id("reprecipitated_platinum"))
            .dust(1)
            .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
            .buildAndRegister()
            .setFormula("PtCl", true);

    public static final Material PalladiumEnrichedAmmonia = new Material.Builder(GTExtendedChem.id("palladium_enriched_ammonia"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x65655E)
            .buildAndRegister()
            .setFormula("?Pd", true);

    public static final Material PalladiumMetallicPowder = new Material.Builder(GTExtendedChem.id("palladium_metallic_powder"))
            .dust(1)
            .color(0x65655E).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??Pd??", true);

    public static final Material PalladiumSalt = new Material.Builder(GTExtendedChem.id("palladium_salt"))
            .dust(1)
            .color(0x65655E).iconSet(METALLIC)
            .buildAndRegister();

    public static final Material ReprecipitatedPalladium = new Material.Builder(GTExtendedChem.id("reprecipitated_palladium"))
            .dust(1)
            .color(0x65655E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("Pd2NH4", true);

    public static final Material FormicAcid = new Material.Builder(GTExtendedChem.id("formic_acid"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xDCA358)
            .buildAndRegister()
            .setFormula("CH2O2", true);

    public static final Material PotassiumDisulfate = new Material.Builder(GTExtendedChem.id("potassium_disulfate"))
            .dust(1)
            .color(0xEEA23E)
            .buildAndRegister()
            .setFormula("K2S2O7", true);

    public static final Material RhodiumSulfateSolution = new Material.Builder(GTExtendedChem.id("diluted_rhodium_sulfate_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xDB973B)
            .buildAndRegister();

    public static final Material LeachResidue = new Material.Builder(GTExtendedChem.id("leach_residue"))
            .dust(1)
            .color(0x543A17)
            .buildAndRegister()
            .setFormula("??IrOsRu??", true);

    public static final Material CrudeRhodiumMetal = new Material.Builder(GTExtendedChem.id("crude_rhodium_metal"))
            .dust(1)
            .color(0xDB973B).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??Rh??", true);

    public static final Material RhodiumSalt = new Material.Builder(GTExtendedChem.id("rhodium_salt"))
            .dust(1)
            .color(0xDB973B).iconSet(SHINY)
            .buildAndRegister();

    public static final Material RhodiumSaltSolution = new Material.Builder(GTExtendedChem.id("rhodium_salt_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x91AEC4)
            .buildAndRegister();

    public static final Material ZincSulfate = new Material.Builder(GTExtendedChem.id("zinc_sulfate"))
            .dust(1)
            .color(0x7C4D0E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZnSO4", true);

    public static final Material SodiumNitrate = new Material.Builder(GTExtendedChem.id("sodium_nitrate"))
            .dust(1)
            .color(0x498EC2)
            .buildAndRegister()
            .setFormula("NaNO3", true);

    public static final Material RhodiumNitrate = new Material.Builder(GTExtendedChem.id("rhodium_nitrate"))
            .dust(1)
            .color(0x614A0F).iconSet(METALLIC)
            .buildAndRegister();

    public static final Material RhodiumFilterCake = new Material.Builder(GTExtendedChem.id("rhodium_filter_cake"))
            .dust(1)
            .color(0x614A0F).iconSet(METALLIC)
            .buildAndRegister();

    public static final Material RhodiumFilterCakeSolution = new Material.Builder(GTExtendedChem.id("rhodium_filter_cake_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x4C6584)
            .buildAndRegister();

    public static final Material ReprecipitatedRhodium = new Material.Builder(GTExtendedChem.id("reprecipitated_rhodium"))
            .dust(1)
            .color(0xDB973B).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("Rh2NH4", true);

    public static final Material RarestMetalResidue = new Material.Builder(GTExtendedChem.id("rarest_metal_residue"))
            .dust(1)
            .color(0x5C4E35).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??OsIr??", true);

    public static final Material SodiumRuthenate = new Material.Builder(GTExtendedChem.id("sodium_ruthenate"))
            .dust(1)
            .color(0x3290BD).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("Na2RuO3", true);

    public static final Material RutheniumTetroxideSolution = new Material.Builder(GTExtendedChem.id("ruthenium_tetroxide_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x9FAAAF)
            .buildAndRegister()
            .setFormula("???", true);

    public static final Material HotRutheniumTetroxideSolution = new Material.Builder(GTExtendedChem.id("hot_ruthenium_tetroxide_solution"))
            .gas()
            .color(0x9FAAAF)
            .buildAndRegister()
            .setFormula("???", true);

    public static final Material OsmiumSolution = new Material.Builder(GTExtendedChem.id("osmium_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x7E6642)
            .buildAndRegister()
            .setFormula("???", true);

    public static final Material SludgeDustResidue = new Material.Builder(GTExtendedChem.id("sludge_dust_residue"))
            .dust(1)
            .color(0x775A30)
            .flags(DECOMPOSITION_BY_CENTRIFUGING)
            .components(SiliconDioxide, 3, Gold, 2)
            .buildAndRegister()
            .setFormula("(SiO2)3Au2", true);

    public static final Material IridiumDioxide = new Material.Builder(GTExtendedChem.id("iridium_dioxide"))
            .dust(1)
            .color(0x694B20).iconSet(ROUGH)
            .flags(DISABLE_DECOMPOSITION)
            .components(Iridium, 1, Oxygen, 2)
            .buildAndRegister()
            .setFormula("IrO2", true);

    public static final Material MetallicSludgeResidue = new Material.Builder(GTExtendedChem.id("metallic_sludge_residue"))
            .dust(1)
            .color(0x694B20).iconSet(ROUGH)
            .flags(DECOMPOSITION_BY_CENTRIFUGING)
            .components(Nickel, 1, Copper, 1)
            .buildAndRegister()
            .setFormula("NiCu", true);

    public static final Material AcidicIridiumSolution = new Material.Builder(GTExtendedChem.id("acidic_iridium_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x694B20)
            .buildAndRegister()
            .setFormula("???", true);
    // Monazite Chain Materials

    public static final Material MuddyMonaziteRareEarthSolution = new Material.Builder(GTExtendedChem.id("muddy_monazite_rare_earth_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x694C22).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??LaNdZr??", true);

    public static final Material DilutedMonaziteRareEarthMud = new Material.Builder(GTExtendedChem.id("diluted_monazite_rare_earth_mud"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x835D27).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??LaNdHf??", true);

    public static final Material HafniaZirconiaBlend = new Material.Builder(GTExtendedChem.id("hafnia_zirconia_blend"))
            .dust(1)
            .color(0xC1A47A).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??HfZr??", true);

    public static final Material ThoriumDioxide = new Material.Builder(GTExtendedChem.id("thorium_dioxide"))
            .dust(1)
            .color(0x33312E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ThO2", true);

    public static final Material MonaziteSulfate = new Material.Builder(GTExtendedChem.id("monazite_sulfate"))
            .dust(1)
            .color(0x5C421B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??CeEu??", true);

    public static final Material RedZircon = new Material.Builder(GTExtendedChem.id("red_zircon"))
            .dust(1)
            .color(0xDB2025).iconSet(SHINY)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .components(Zirconium, 1, SiliconDioxide, 2, Oxygen, 2)
            .buildAndRegister()
            .setFormula("ZrSiO4", true);

    public static final Material DilutedMonaziteSulfate = new Material.Builder(GTExtendedChem.id("diluted_monazite_sulfate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x5C421B).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("??LaNd??", true);

    public static final Material AmmoniumNitrateSolution = new Material.Builder(GTExtendedChem.id("ammonium_nitrate_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xFFFFFF)
            .buildAndRegister()
            .setFormula("NH4NO3", true);

    public static final Material AcidicMonazitePowder = new Material.Builder(GTExtendedChem.id("acidic_monazite_powder"))
            .dust(1)
            .color(0x241740).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRareEarthFiltrate = new Material.Builder(GTExtendedChem.id("monazite_rare_earth_filtrate"))
            .dust(1)
            .color(0x1A1525).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material ThoriumPhosphateCake = new Material.Builder(GTExtendedChem.id("thorium_phosphate_cake"))
            .dust(1)
            .color(0xBF2948).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??ThP??", true);

    public static final Material NeutralizedMonaziteRareEarthFiltrate = new Material.Builder(GTExtendedChem.id("neutralized_monazite_rare_earth_filtrate"))
            .dust(1)
            .color(0x2B1946).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRareEarthHydroxideConcentrate = new Material.Builder(GTExtendedChem.id("monazite_rare_earth_hydroxide_concentrate"))
            .dust(1)
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material UraniumFiltrate = new Material.Builder(GTExtendedChem.id("uranium_filtrate"))
            .dust(1)
            .color(0x224521).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??U??", true);

    public static final Material DriedMonaziteRareEarthConcentrate = new Material.Builder(GTExtendedChem.id("dried_monazite_rare_earth_concentrate"))
            .dust(1)
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material NitrogenatedMonaziteRareEarthConcentrate = new Material.Builder(GTExtendedChem.id("nitrogenated_monazite_rare_earth_concentrate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??LaNd??", true);

    public static final Material NitricLeachedMonaziteMixture = new Material.Builder(GTExtendedChem.id("nitric_leached_monazite_mixture"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x9122A8)
            .buildAndRegister();

    public static final Material NitricMonaziteLeachedConcentrate = new Material.Builder(GTExtendedChem.id("nitric_monazatie_leached_concentrate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xF6C62C)
            .buildAndRegister()
            .setFormula("??LaNd??", true);

    public static final Material CeriumDioxide = new Material.Builder(GTExtendedChem.id("cerium_dioxide"))
            .dust(1)
            .color(0xDEE6E7)
            .buildAndRegister()
            .setFormula("CeO2", true);

    public static final Material CeriumChloride = new Material.Builder(GTExtendedChem.id("cerium_chloride"))
            .dust(1)
            .color(0xDEE6E7)
            .buildAndRegister()
            .setFormula("CeCl3", true);

    public static final Material CooledMonaziteRareEarthConcentrate = new Material.Builder(GTExtendedChem.id("cooled_monazite_rare_earth_concentrate"))
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRarerEarthSediment = new Material.Builder(GTExtendedChem.id("monaziterarer_earth_sediment"))
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material HeterogenousHalogenicMonaziteRareEarthMixture = new Material.Builder(GTExtendedChem.id("heterogenic_halogenic_monazite_rare_earth_mixture"))
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material SamaricResidue = new Material.Builder(GTExtendedChem.id("samaric_residue"))
            .dust(1)
            .color(0xC4AB94).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??SmGd??", true);
    public static final Material SaturatedMonazatiteRareEarth = new Material.Builder(GTExtendedChem.id("satured_monazite_rare_earth"))
            .dust(1)
            .color(0x5B480B).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material EuropiumIIIOxide = new Material.Builder(GTExtendedChem.id("europium_iii_oxide"))
            .dust(1)
            .color(0xF4C8F4).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material Oxalate = new Material.Builder(GTExtendedChem.id("oxalate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x47AD1F)
            .buildAndRegister()
            .setFormula("H2C2O4", true);


    public static final Material CeriumOxalate = new Material.Builder(GTExtendedChem.id("cerium_oxalate"))
            .dust(1)
            .color(0xE4D7C5).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("Ce2(C2O4)3", true);

    public static final Material CeriumIIIOxide = new Material.Builder(GTExtendedChem.id("cerium_iii_oxide"))
            .dust(1)
            .color(0xD8DA2F).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("Ce2O3", true);

    public static final Material NeutralizedUraniumFiltrate = new Material.Builder(GTExtendedChem.id("neutralized_uranium_filtrate"))
            .dust(1)
            .color(0xA62424).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??U??", true);

    public static final Material Hafnia = new Material.Builder(GTExtendedChem.id("hafnia"))
            .dust(1)
            .color(0xBA9288).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("HfO2", true);

    public static final Material Zirconia = new Material.Builder(GTExtendedChem.id("zirconia"))
            .dust(1)
            .color(0x7F4334).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZrO2", true);

    public static final Material HafniumTetrachloride = new Material.Builder(GTExtendedChem.id("hafnium_tetrachloride"))
            .dust(1)
            .color(0xE2DEDD).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("HfCl4", true);

    public static final Material HafniumTetrachlorideSolution = new Material.Builder(GTExtendedChem.id("hafnium_tetrachloride_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xE2DEDD).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("HfCl4", true);

    public static final Material LowPurityHafnium = new Material.Builder(GTExtendedChem.id("low_purity_hafnium"))
            .dust(1).fluid()
            .color(0xCCC3C1).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??Hf??", true);

    public static final Material HafniumIodide = new Material.Builder(GTExtendedChem.id("hafnium_idodide"))
            .dust(1)
            .color(0xCB3818).iconSet(METALLIC)
            .components(GTECMaterials.LowPurityHafnium, 1, Iodine, 4)
            .flags(DISABLE_DECOMPOSITION)
            .buildAndRegister()
            .setFormula("HfI4", true);

    public static final Material ZirconiumTetrachloride = new Material.Builder(GTExtendedChem.id("zirconium_tetrachloride"))
            .dust(1)
            .color(0xA6786E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZrCl4", true);

    public static final Material ZirconiumTetrachlorideSolution = new Material.Builder(GTExtendedChem.id("zirconium_tetrachloride_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xA6786E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZrCl4", true);

    public static final Material ThoriumPhosphateConcentrate = new Material.Builder(GTExtendedChem.id("thorium_phosphate_concentrate"))
            .dust()
            .color(0xE27717).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??ThP??", true);

    public static final Material Alumina = new Material.Builder(GTExtendedChem.id("alumina"))
            .dust()
            .color(0x64B5BF).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("Al2O3", true);

    public static final Material EuropiumOxide = new Material.Builder(GTExtendedChem.id("europium_oxide"))
            .dust()
            .color(0xEBE2EC).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("EuO", true);

    public static final Material VanadiumPentoxide = new Material.Builder(GTExtendedChem.id("vanadium_pentoxide"))
            .dust()
            .color(0xD0BD3F).iconSet(SHINY)
            .components(Vanadium, 2, Oxygen, 5)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .buildAndRegister()
            .setFormula("V2O5", true);

    public static final Material SodiumFormate = new Material.Builder(GTExtendedChem.id("sodium_formate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xE33BA7)
            .buildAndRegister()
            .setFormula("HCOONa", true);

    public static final Material SodiumSulfate = new Material.Builder(GTExtendedChem.id("sodium_sulfate"))
            .dust()
            .color(0xE33BA7)
            .components(Sulfur, 1, Oxygen, 4, Sodium, 2)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .buildAndRegister()
            .setFormula("Na2SO4", true);

    // Bastnasite Chain Stuff
    public static final Material MuddyBastnasiteRareEarthSolution = new Material.Builder(GTExtendedChem.id("muddy_bastnasite_rare_earth_solution"))
            .fluid()
            .color(0xA6501E)
            .buildAndRegister()
            .setFormula("??LaCeY??", true);

    public static final Material SteamCrackedMuddyBastnasiteRareEarthSolution = new Material.Builder(GTExtendedChem.id("steam_cracked_muddy_bastnasite_rare_earth_solution"))
            .fluid()
            .color(0x9E4C1C)
            .buildAndRegister()
            .setFormula("??LaCeY??", true);


    public static final Material HexafluorosilicAcid = new Material.Builder(GTExtendedChem.id("hexafluorosilic_acid"))
            .fluid()
            .color(0x2E6AB9)
            .buildAndRegister()
            .setFormula("H2SiF6", true);


    public static final Material Sodiumfluorosilicate = new Material.Builder(GTExtendedChem.id("sodiumfluorosilicate"))
            .fluid()
            .color(0xB7801B)
            .buildAndRegister()
            .setFormula("Na2SiF6", true);


    public static final Material ConditionedBastnasiteMud = new Material.Builder(GTExtendedChem.id("conditioned_bastnasite_mud"))
            .fluid()
            .color(0xA6501E)
            .buildAndRegister()
            .setFormula("??LaCeY??", true);


    public static final Material DilutedBastnasiteMud = new Material.Builder(GTExtendedChem.id("diluted_bastnasite_mud"))
            .fluid()
            .color(0xA6501E)
            .buildAndRegister()
            .setFormula("??LaCeY??", true);


    public static final Material FilteredBastnasiteMud = new Material.Builder(GTExtendedChem.id("filtered_bastnasite_mud"))
            .fluid()
            .color(0xA6501E)
            .buildAndRegister()
            .setFormula("??LaCeY??", true);

    public static final Material BastnasiteRareEarthOxides = new Material.Builder(GTExtendedChem.id("bastnasite_rare_earth_oxides"))
            .dust(1).iconSet(METALLIC)
            .color(0xA6501E)
            .buildAndRegister();

    public static final Material AcidLeachedBastnasiteRareEarthOxides = new Material.Builder(GTExtendedChem.id("acid_leached_astnasite_rare_earth_oxides"))
            .dust(1).iconSet(ROUGH)
            .color(0xA6501E)
            .buildAndRegister()
            .setFormula("??LaCeY??", true);

    public static final Material RoastedRareEarthOxides = new Material.Builder(GTExtendedChem.id("roasted_rare_earth_oxides"))
            .dust(1).iconSet(METALLIC)
            .color(0x8A5E0C)
            .buildAndRegister();

    public static final Material WetRareEarthOxides = new Material.Builder(GTExtendedChem.id("wet_rare_earth_oxides"))
            .dust(1).iconSet(DULL)
            .color(0x8A5E0C)
            .buildAndRegister();

    public static final Material CeriumOxidisedRareEarthOxides = new Material.Builder(GTExtendedChem.id("cerium_oxidised_rare_earth_oxides"))
            .dust(1).iconSet(METALLIC)
            .color(0x8A5E0C)
            .buildAndRegister();
    public static final Material NitrogenatedRarerEarthOxidess = new Material.Builder(GTExtendedChem.id("nitrogenated_rarer_earth_oxides"))
            .fluid()
            .color(0xA6501)
            .buildAndRegister();

    public static final Material BastnasiteRarerEarthOxidessSuspension = new Material.Builder(GTExtendedChem.id("bastnasite_rarer_earth_oxides_suspension"))
            .fluid()
            .color(0xA6501)
            .buildAndRegister();

    public static final Material NeodymiumRareEarthConcentrate = new Material.Builder(GTExtendedChem.id("neodymium_rare_earth_concentrate"))
            .dust().iconSet(METALLIC)
            .color(0xA6501)
            .buildAndRegister()
            .setFormula("??LaNdPr?", true);

    public static final Material SamaricRareEarthConcentrate = new Material.Builder(GTExtendedChem.id("samaric_rare_earth_concentrate"))
            .dust().iconSet(METALLIC)
            .color(0xA6501)
            .buildAndRegister()
            .setFormula("??SmHoTb??", true);
    public static final Material DilutedAcetone = new Material.Builder(GTExtendedChem.id("diluted_acetone"))
            .fluid()
            .color(0xFFFFFF)
            .buildAndRegister();

    public static final Material FluorinatedSamaricConcentrate = new Material.Builder(GTExtendedChem.id("fluorinated_samaric_concentrate"))
            .dust().iconSet(METALLIC)
            .color(0xCEA5B7)
            .buildAndRegister()
            .setFormula("??SmHo??", true);

    public static final Material SamariumTerbiumMixture = new Material.Builder(GTExtendedChem.id("samarium_terbium_mixture"))
            .dust().iconSet(METALLIC)
            .color(0xBC9BAA)
            .buildAndRegister()
            .setFormula("??SmTb??", true);

    public static final Material NitrogenatedSamariumTerbiumMixture = new Material.Builder(GTExtendedChem.id("nitrogenated_samarium_terbium_mixture"))
            .dust().iconSet(METALLIC)
            .color(0xBC9BAA)
            .buildAndRegister()
            .setFormula("??SmTbY??NH4NO3", true);

    public static final Material TerbiumNitrate = new Material.Builder(GTExtendedChem.id("terbium_nitrate"))
            .dust().iconSet(METALLIC)
            .color(0x56C14D)
            .buildAndRegister()
            .setFormula("TbNO3", true);

    public static final Material CalciumFluoride = new Material.Builder(GTExtendedChem.id("calcium_fluoride"))
            .fluid()
            .dust()
            .components(Calcium, 1, Oxygen, 2)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .color(0xC5CBC4)
            .buildAndRegister()
            .setFormula("CaF2", true);

    public static final Material HydratedAmmoniumNitrateSlurry = new Material.Builder(GTExtendedChem.id("hydrated_ammonium_nitrate_slurry"))
            .fluid()
            .color(0xB767D1)
            .buildAndRegister();

    public static final Material AmmoniumNitrate = new Material.Builder(GTExtendedChem.id("ammonium_nitrate"))
            .dust()
            .color(0xB767D1)
            .buildAndRegister()
            .setFormula("N2H4O3", true);

    public static final Material LanthanumChloride = new Material.Builder(GTExtendedChem.id("lanthanum_chloride"))
            .dust().iconSet(METALLIC)
            .color(0x4C6B4E)
            .buildAndRegister()
            .setFormula("LaCl3", true);

    public static final Material NeodymiumOxide = new Material.Builder(GTExtendedChem.id("neodymium_oxide"))
            .dust().iconSet(METALLIC)
            .color(0x4C6B4E)
            .buildAndRegister()
            .setFormula("Nd2O3", true);

}

// The New Platinum Line Stuff

    /*
    public static final Material RoastedCooperite = new Material.Builder(GTExtendedChem.id("roasted_cooperite"))
            .dust().iconSet(ROUGH)
            .color(0x908129)
            .buildAndRegister()
            .setFormula("IDK YET", true);

    public static final Material NickelDepletedCooperite = new Material.Builder(GTExtendedChem.id("nickel_depleted_cooperite"))
            .dust().iconSet(METALLIC)
            .color(0x908129)
            .buildAndRegister()
            .setFormula("Ni?", true);

    public static final Material CooperiteSolution = new Material.Builder(GTExtendedChem.id("cooperite_solution"))
            .fluid()
            .color(0x908129)
            .buildAndRegister()
            .setFormula("Ni?", true);

    public static final Material NickelCarboryl = new Material.Builder(GTExtendedChem.id("nickel_carboryl"))
            .fluid()
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .color(0x4DAA9D)
            .components(Nickel, 1, CarbonMonoxide, 4)
            .buildAndRegister();

    public static final Material PlatinumDepletedCooperiteSolution = new Material.Builder(GTExtendedChem.id("platinum_depleted_cooperite_solution"))
            .fluid()
            .color(0xB9B344)
            .buildAndRegister();

    public static final Material AmmoniumHexachloroplatinate = new Material.Builder(GTExtendedChem.id("ammonium_hexachloroplatinate"))
            .dust().iconSet(METALLIC)
            .color(0xCECA7B)
            .buildAndRegister();

    public static final Material AmmoniumHexachloropalladate = new Material.Builder(GTExtendedChem.id("ammonium_hexapalladate"))
            .dust().iconSet(METALLIC)
            .color(0x9C9B90)
            .buildAndRegister();

    public static final Material TetraamminePalladiumChloride = new Material.Builder(GTExtendedChem.id("tetraammine_palladium_chloride"))
            .dust().iconSet(METALLIC)
            .color(0x9C9B90)
            .buildAndRegister();

    public static final Material InsoluablePLatinumGroupResidue = new Material.Builder(GTExtendedChem.id("insoluable_platinum_group_residue"))
            .dust().iconSet(METALLIC)
            .color(0xC4C094)
            .buildAndRegister();
}
     */