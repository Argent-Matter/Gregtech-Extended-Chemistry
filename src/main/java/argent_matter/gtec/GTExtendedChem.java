package argent_matter.gtec;


import argent_matter.gtec.common.data.*;
import argent_matter.gtec.data.GTECDatagen;
import com.gregtechceu.gtceu.config.ConfigHolder;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(argent_matter.gtec.GTExtendedChem.MOD_ID)
public class GTExtendedChem {
    public static final String MOD_ID = "gtec";
    public static final Logger LOGGER = LogManager.getLogger();


    public static void init() {
        ConfigHolder.init();

        GTECBlocks.init();
        GTECRecipeTypes.init();
        GTECMachines.init();
        GTECItems.init();

        GTECDatagen.init();

        GTECRegistries.REGISTRATE.registerRegistrate();

    }

    public GTExtendedChem() {
        ConfigHolder.init();

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        // Initialize GT stuffs

    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}

