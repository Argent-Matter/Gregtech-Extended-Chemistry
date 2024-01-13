package argent_matter.gtec.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.FluidProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;


public class GTECMaterials {
    public static void init() {
        IronMagnetic.addFlags(GENERATE_FOIL);
        RutheniumTetroxide.setProperty(PropertyKey.FLUID, new FluidProperty());
        RutheniumTetroxide.getProperty(PropertyKey.FLUID).getStorage().enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
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

}
