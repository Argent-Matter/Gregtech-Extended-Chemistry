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

        public static void modifyMaterials () {
            IronMagnetic.addFlags(GENERATE_FOIL);
            Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());
            Hafnium.setProperty(PropertyKey.BLAST, new BlastProperty(3400));
            Zirconium.setProperty(PropertyKey.INGOT, new IngotProperty());
            Zirconium.setProperty(PropertyKey.BLAST, new BlastProperty(4500));
            Gadolinium.setProperty(PropertyKey.DUST, new DustProperty());
            RutheniumTetroxide.setProperty(PropertyKey.FLUID, new FluidProperty());
            RutheniumTetroxide.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
            Iodine.setProperty(PropertyKey.FLUID, new FluidProperty());
            Iodine.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.GAS, new FluidBuilder());
        }


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
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .components(Zinc, 1, Sulfur, 1, Oxygen, 4)
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

    public static final Material HafniaZirconiaBlend = new  Material.Builder(GTExtendedChem.id("hafnia_zirconia_blend"))
            .dust(1)
            .color(0xC1A47A).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??HfZr??", true);

    public static final Material ThoriumDioxide = new  Material.Builder(GTExtendedChem.id("thorium_dioxide"))
            .dust(1)
            .color(0x33312E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ThO2", true);

    public static final Material MonaziteSulfate = new  Material.Builder(GTExtendedChem.id("monazite_sulfate"))
            .dust(1)
            .color(0x5C421B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??CeEu??", true);

    public static final Material RedZircon = new  Material.Builder(GTExtendedChem.id("red_zircon"))
            .dust(1)
            .color(0xDB2025).iconSet(SHINY)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .components(Zirconium, 1, SiliconDioxide, 2, Oxygen, 2)
            .buildAndRegister()
            .setFormula("ZrSiO4", true);

    public static final Material DilutedMonaziteSulfate = new  Material.Builder(GTExtendedChem.id("diluted_monazite_sulfate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x5C421B).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("??LaNd??", true);

    public static final Material AmmoniumNitrateSolution = new  Material.Builder(GTExtendedChem.id("ammonium_nitrate_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xFFFFFF)
            .buildAndRegister()
            .setFormula("NH4NO3", true);

    public static final Material AcidicMonazitePowder = new  Material.Builder(GTExtendedChem.id("acidic_monazite_powder"))
            .dust(1)
            .color(0x241740).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRareEarthFiltrate = new  Material.Builder(GTExtendedChem.id("monazite_rare_earth_filtrate"))
            .dust(1)
            .color(0x1A1525).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material ThoriumPhosphateCake = new  Material.Builder(GTExtendedChem.id("thorium_phosphate_cake"))
            .dust(1)
            .color(0xBF2948).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??ThP??", true);

    public static final Material NeutralizedMonaziteRareEarthFiltrate = new  Material.Builder(GTExtendedChem.id("neutralized_monazite_rare_earth_filtrate"))
            .dust(1)
            .color(0x2B1946).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRareEarthHydroxideConcentrate = new  Material.Builder(GTExtendedChem.id("monazite_rare_earth_hydroxide_concentrate"))
            .dust(1)
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material UraniumFiltrate = new  Material.Builder(GTExtendedChem.id("uranium_filtrate"))
            .dust(1)
            .color(0x224521).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??U??", true);

    public static final Material DriedMonaziteRareEarthConcentrate = new  Material.Builder(GTExtendedChem.id("dried_monazite_rare_earth_concentrate"))
            .dust(1)
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material NitrogenatedMonaziteRareEarthConcentrate = new  Material.Builder(GTExtendedChem.id("nitrogenated_monazite_rare_earth_concentrate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x453221).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??LaNd??", true);

    public static final Material NitricLeachedMonaziteMixture = new  Material.Builder(GTExtendedChem.id("nitric_leached_monazite_mixture"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x9122A8)
            .buildAndRegister();

    public static final Material NitricMonaziteLeachedConcentrate = new  Material.Builder(GTExtendedChem.id("nitric_monazatie_leached_concentrate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xF6C62C)
            .buildAndRegister()
                .setFormula("??LaNd??", true);

    public static final Material CeriumDioxide = new  Material.Builder(GTExtendedChem.id("cerium_dioxide"))
            .dust(1)
            .color(0xDEE6E7)
            .buildAndRegister()
            .setFormula("CeO2", true);

    public static final Material CeriumChloride = new  Material.Builder(GTExtendedChem.id("cerium_chloride"))
            .dust(1)
            .color(0xDEE6E7)
            .buildAndRegister()
            .setFormula("CeCl3", true);

    public static final Material CooledMonaziteRareEarthConcentrate = new  Material.Builder(GTExtendedChem.id("cooled_monazite_rare_earth_concentrate"))
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material MonaziteRarerEarthSediment = new  Material.Builder(GTExtendedChem.id("monaziterarer_earth_sediment"))
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material HeterogenousHalogenicMonaziteRareEarthMixture = new  Material.Builder(GTExtendedChem.id("heterogenic_halogenic_monazite_rare_earth_mixture"))
            .dust(1)
            .color(0x5B480B).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material SamaricResidue = new  Material.Builder(GTExtendedChem.id("samaric_residue"))
            .dust(1)
            .color(0xC4AB94).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??SmGd??", true);
    public static final Material SaturatedMonazatiteRareEarth = new  Material.Builder(GTExtendedChem.id("satured_monazite_rare_earth"))
            .dust(1)
            .color(0x5B480B).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material EuropiumIIIOxide = new  Material.Builder(GTExtendedChem.id("europium_iii_oxide"))
            .dust(1)
            .color(0xF4C8F4).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("????", true);

    public static final Material Oxalate = new  Material.Builder(GTExtendedChem.id("oxalate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x47AD1F)
            .buildAndRegister()
            .setFormula("H2C2O4", true);


    public static final Material CeriumOxalate = new  Material.Builder(GTExtendedChem.id("cerium_oxalate"))
            .dust(1)
            .color(0xE4D7C5).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("Ce2(C2O4)3", true);

    public static final Material CeriumIIIOxide = new  Material.Builder(GTExtendedChem.id("cerium_iii_oxide"))
            .dust(1)
            .color(0xD8DA2F).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("Ce2O3", true);

    public static final Material NeutralizedUraniumFiltrate = new  Material.Builder(GTExtendedChem.id("neutralized_uranium_filtrate"))
            .dust(1)
            .color(0xA62424).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??U??", true);

    public static final Material Hafnia = new  Material.Builder(GTExtendedChem.id("hafnia"))
            .dust(1)
            .color(0xBA9288).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("HfO2", true);

    public static final Material Zirconia = new  Material.Builder(GTExtendedChem.id("zirconia"))
            .dust(1)
            .color(0x7F4334).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZrO2", true);

    public static final Material HafniumTetrachloride = new  Material.Builder(GTExtendedChem.id("hafnium_tetrachloride"))
            .dust(1)
            .color(0xE2DEDD).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("HfCl4", true);

    public static final Material HafniumTetrachlorideSolution = new  Material.Builder(GTExtendedChem.id("hafnium_tetrachloride_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xE2DEDD).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("HfCl4", true);

    public static final Material LowPurityHafnium = new  Material.Builder(GTExtendedChem.id("low_purity_hafnium"))
            .dust(1).fluid()
            .color(0xCCC3C1).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("??Hf??", true);

    public static final Material HafniumIodide = new  Material.Builder(GTExtendedChem.id("hafnium_idodide"))
            .dust(1)
            .color(0xCB3818).iconSet(METALLIC)
            .components(GTECMaterials.LowPurityHafnium, 1, Iodine, 4)
            .flags(DISABLE_DECOMPOSITION)
            .buildAndRegister()
            .setFormula("HfI4", true);

    public static final Material ZirconiumTetrachloride = new  Material.Builder(GTExtendedChem.id("zirconium_tetrachloride"))
            .dust(1)
            .color(0xA6786E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZrCl4", true);

    public static final Material ZirconiumTetrachlorideSolution = new  Material.Builder(GTExtendedChem.id("zirconium_tetrachloride_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xA6786E).iconSet(METALLIC)
            .buildAndRegister()
            .setFormula("ZrCl4", true);

    public static final Material ThoriumPhosphateConcentrate = new  Material.Builder(GTExtendedChem.id("thorium_phosphate_concentrate"))
            .dust()
            .color(0xE27717).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("??ThP??", true);

    public static final Material Alumina = new  Material.Builder(GTExtendedChem.id("alumina"))
            .dust()
            .color(0x64B5BF).iconSet(SHINY)
            .buildAndRegister()
            .setFormula("Al2O3", true);

    public static final Material EuropiumOxide = new  Material.Builder(GTExtendedChem.id("europium_oxide"))
            .dust()
            .color(0xEBE2EC).iconSet(ROUGH)
            .buildAndRegister()
            .setFormula("EuO", true);

    public static final Material VanadiumPentoxide = new  Material.Builder(GTExtendedChem.id("vanadium_pentoxide"))
            .dust()
            .color(0xD0BD3F).iconSet(SHINY)
            .components(Vanadium, 2, Oxygen, 5)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .buildAndRegister()
            .setFormula("V2O5" , true);

    public static final Material SodiumFormate = new  Material.Builder(GTExtendedChem.id("sodium_formate"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xE33BA7)
            .buildAndRegister()
            .setFormula("HCOONa" , true);

    public static final Material SodiumSulfate = new  Material.Builder(GTExtendedChem.id("sodium_sulfate"))
            .dust()
            .color(0xE33BA7)
            .components(Sulfur, 1, Oxygen,4, Sodium, 2)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .buildAndRegister()
            .setFormula("Na2SO4" , true);

    /*
    // Naquadah Line Stuff
    public static final Material Ether = new  Material.Builder(GTExtendedChem.id("ether"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0xE4BF33)
            .buildAndRegister()
            .setFormula("CH3CH2OCH2CH3" , true);

    public static final Material AntimonyTrichloride = new  Material.Builder(GTExtendedChem.id("antimony_trichloride"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x53B917)
            .buildAndRegister()
            .setFormula("SbCl3" , true);

    public static final Material AntimonyPentachloride = new  Material.Builder(GTExtendedChem.id("antimony_pentachloride"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x3C8A0D)
            .buildAndRegister()
            .setFormula("SbCl5" , true);

    public static final Material AntimonyPentachlorideSolution = new  Material.Builder(GTExtendedChem.id("antimony_pentachloride_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x3C8A0D)
            .buildAndRegister()
            .setFormula("SbCl5" , true);

    public static final Material AntimonyPentafluoride = new  Material.Builder(GTExtendedChem.id("antimony_pentafluoride"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x11D0C6)
            .buildAndRegister()
            .setFormula("SbF5" , true);

    public static final Material AntimonyPentafluorideSolution = new  Material.Builder(GTExtendedChem.id("antimony_pentafluoride_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x11D0C6)
            .buildAndRegister()
            .setFormula("SbF5" , true);

    public static final Material LowQualityNaquadahEmulsion = new  Material.Builder(GTExtendedChem.id("low_quality_naquadah_emulsion"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x042422)
            .buildAndRegister()
            .setFormula("??NqGaAd??" , true);

    public static final Material LowQualityNaquadahSolution = new  Material.Builder(GTExtendedChem.id("low_quality_naquadah_solution"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
            .color(0x383030)
            .buildAndRegister()
            .setFormula("??NqAd??" , true);

    public static final Material NaquadahOxideMixture = new  Material.Builder(GTExtendedChem.id("naquadah_oxide_mixture"))
            .dust(1).iconSet(METALLIC)
            .color(0x042422)
            .buildAndRegister()
            .setFormula("??NqTiGaAd??" , true);

    public static final Material GalliumHydroxide = new  Material.Builder(GTExtendedChem.id("gallium_hydroxide"))
            .dust(1).iconSet(ROUGH)
            .color(0x767676)
            .buildAndRegister()
            .setFormula("Ga(OH)3" , true);

    public static final Material EthylHexanol = new  Material.Builder(GTExtendedChem.id("ethyl_hexanol"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder()).iconSet(ROUGH)
            .color(0x6AC418)
            .components(Carbon, 8, Hydrogen, 18, Oxygen, 1)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .buildAndRegister()
            .setFormula("C8H18O" , true);

    public static final Material P507 = new  Material.Builder(GTExtendedChem.id("p_507"))
            .fluid(FluidStorageKeys.LIQUID, new FluidBuilder()).iconSet(ROUGH)
            .color(0x64C70A)
            .components(Carbon, 16, Phosphorus, 1, Hydrogen, 35, Oxygen, 3)
            .flags(DECOMPOSITION_BY_ELECTROLYZING)
            .buildAndRegister()
            .setFormula("(C8H17)PO3H" , true);

/*
This has to wait until a figure out more ways for naquadah processing thats more humane
     */
}
