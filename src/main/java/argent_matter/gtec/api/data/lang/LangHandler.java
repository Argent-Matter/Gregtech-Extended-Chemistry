package argent_matter.gtec.api.data.lang;

import argent_matter.gtec.api.common.data.GTECMaterials;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.tterrag.registrate.providers.RegistrateLangProvider;

import java.util.Set;

import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {
    private static final Set<Material> MATERIALS = Set.of(
            GTECMaterials.PLATINUM_METALLIC_POWDER,
            GTECMaterials.PLATINUM_RESIDUE

    );

    public static void init(RegistrateLangProvider provider) {
        // materials
        for (Material material : MATERIALS) {
            provider.add(material.getUnlocalizedName(), toEnglishName(material.getName()));

        }
    }
}