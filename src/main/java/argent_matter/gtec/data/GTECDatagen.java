package argent_matter.gtec.data;


import argent_matter.gtec.common.data.GTECRegistries;
import argent_matter.gtec.data.lang.LangHandler;
import com.tterrag.registrate.providers.ProviderType;

public class GTECDatagen {
    public static void init() {
        GTECRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);


    }
}