package argent_matter.gtec.data.lang;

import argent_matter.gtec.common.data.GTECMaterials;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.tterrag.registrate.providers.RegistrateLangProvider;

import java.util.Set;

import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {
    private static final Set<Material> MATERIALS = Set.of(
            GTECMaterials.PLATINUMRESIDUE,
            GTECMaterials.PLATINUMCONCENTRATE,
            GTECMaterials.REPERCIPITATEDPLATINUM,
            GTECMaterials.PLATINUMSALT,
            GTECMaterials.REFINEDPLATINUMSALT,
            GTECMaterials.PALLADIUMENRICHEDAMMONIA,
            GTECMaterials.PALLADIUMMETALLICPOWDER,
            GTECMaterials.REPRECIPITATEDPALLADIUMDUST,
            GTECMaterials.PALLADIUMSALT,
            GTECMaterials.FORMICACID,
            GTECMaterials.LEACHRESIDUE,
            GTECMaterials.POTASSIUMDISULFATE,
            GTECMaterials.RHODIUMSULFATESOLUTION,
            GTECMaterials.CRUDERHODIUMMETAL,
            GTECMaterials.ZINCSULFATE,
            GTECMaterials.RHODIUM_SALT,
            GTECMaterials.RHODIUMSALTSOLUTION,
            GTECMaterials.SODIUMNITRATE,
            GTECMaterials.RHODIUMNITRATE,
            GTECMaterials.RHODIUMFILTERCAKE,
            GTECMaterials.RHODIUMFILTERCAKESOLUTION,
            GTECMaterials.REPRECIPITATEDRHODIUM,
            GTECMaterials.RARESTMETALRESIDUE,
            GTECMaterials.SODIUMRUTHENATE,
            GTECMaterials.RUTHENIUMTETROXIDESOLUTION,
            GTECMaterials.HOTRUTHENIUMTETROXIDESOLUTION,
            GTECMaterials.OSMIUMSOLUTION,
            GTECMaterials.SLUDGEDUSTRESIDUE,
            GTECMaterials.IRIDIUMDIOXIDE,
            GTECMaterials.ACIDICIRIDIUMSOLUTION,
            GTECMaterials.METALLICSLUDGERESIDUE

    );

    public static void init(RegistrateLangProvider provider) {
        // materials
        for (Material material : MATERIALS) {
            provider.add(material.getUnlocalizedName(), toEnglishName(material.getName()));

        }
    }
}
