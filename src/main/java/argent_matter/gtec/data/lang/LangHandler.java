package argent_matter.gtec.data.lang;

import argent_matter.gtec.common.data.GTECMaterials;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.tterrag.registrate.providers.RegistrateLangProvider;

import java.util.Set;

import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {
    private static final Set<Material> MATERIALS = Set.of(
            GTECMaterials.PlatinumResidue,
            GTECMaterials.PlatinumConcentrate,
            GTECMaterials.RepercipitatedPlatinum,
            GTECMaterials.PlatinumSalt,
            GTECMaterials.RefinedPlatlinumSalt,
            GTECMaterials.PalladiumEnrichedAmmonia,
            GTECMaterials.PalladiumMetallicPowder,
            GTECMaterials.RepercipitatedPalladium,
            GTECMaterials.PalladiumSalt,
            GTECMaterials.FormicAcid,
            GTECMaterials.LeachResidue,
            GTECMaterials.PotassiumDisulfate,
            GTECMaterials.RhodiumSulfateSolution,
            GTECMaterials.CrudeRhodiumMetal,
            GTECMaterials.ZincSulfate,
            GTECMaterials.RhodiumSalt,
            GTECMaterials.RhodiumSaltSolution,
            GTECMaterials.SodiumNitrate,
            GTECMaterials.RhodiumNitrate,
            GTECMaterials.RhodiumFilterCake,
            GTECMaterials.RhodiumFilterCakeSolution,
            GTECMaterials.ReprecipitatedRhodium,
            GTECMaterials.RarestMetalResidue,
            GTECMaterials.SodiumRuthenate,
            GTECMaterials.RutheniumTetroxideSolution,
            GTECMaterials.HotRutheniumTetroxideSolution,
            GTECMaterials.OsmiumSolution,
            GTECMaterials.SludgeDustResidue,
            GTECMaterials.IridiumDioxide,
            GTECMaterials.AcidicIridiumSolution,
            GTECMaterials.MetallicSludgeResidue

    );

    public static void init(RegistrateLangProvider provider) {
        // materials
        for (Material material : MATERIALS) {
            provider.add(material.getUnlocalizedName(), toEnglishName(material.getName()));
        }

    }
}
