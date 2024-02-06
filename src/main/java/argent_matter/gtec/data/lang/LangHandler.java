package argent_matter.gtec.data.lang;

import argent_matter.gtec.common.data.GTECMaterials;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.tterrag.registrate.providers.RegistrateLangProvider;

import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;

import java.util.Set;

import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {
    private static final Set<Material> MATERIALS = Set.of(
    );


    public static void init(RegistrateLangProvider provider) {

        // materials
        for (Material material : MATERIALS) {
            provider.add(material.getUnlocalizedName(), toEnglishName(material.getName()));
        }
        multilineLang(provider, "item.gtec.echo_processor.tooltip", "§7I dont know anymore...\n§3ZPM-Tier Circuit");
        multilineLang(provider, "item.gtec.echo_processor_assembly.tooltip", "§7Is it Dead or is it Alive?\n§3UV-Tier Circuit");
        multilineLang(provider, "item.gtec.echo_processor_supercomputer.tooltip", "§7This seems normal.(If you can call this normal)\n§3UHV-Tier Circuit");
        multilineLang(provider, "item.gtec.echo_processor_mainframe.tooltip", "§7What have i done?\n§3UEV-Tier Circuit");
    }
}
