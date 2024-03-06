package argent_matter.gtec;

import argent_matter.gtec.block.GTECBlocks;
import argent_matter.gtec.common.data.*;
import argent_matter.gtec.registry.GTECCreativeModeTabs;
import argent_matter.gtec.registry.GTECRegistries;
import argent_matter.gtec.data.GTECDatagen;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.config.ConfigHolder;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GTExtendedChem.MOD_ID)
public class GTExtendedChem {
    public static final String MOD_ID = "gtec";

    public static final CleanroomType CLEANER_ROOM = new CleanroomType("cleanerroom", "gtec.recipe.cleanerroom.displayname");
    public static MaterialRegistry MATERIAL_REGISTRY;

    public GTExtendedChem() {
        GTExtendedChem.init();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
    }

    public static void init() {
        ConfigHolder.init(); // Forcefully init GT config because fabric doesn't allow dependents to load after dependencies

        //.init();
        GTECRecipeTypes.init();
        GTECItems.init();
        GTECCreativeModeTabs.init();
        GTECMachines.init();
        GTECBlocks.init();

        GTECDatagen.init();
        GTECRegistries.REGISTRATE.registerRegistrate();
    }


    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
    @SubscribeEvent
    public void registerMaterialRegistry(MaterialRegistryEvent event) {
        MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(GTExtendedChem.MOD_ID);
    }

    @SubscribeEvent
    public void registerMaterials(MaterialEvent event) {
        GTECMaterials.init();
    }

    @SubscribeEvent
    public void modifyMaterials(PostMaterialEvent event) {
        GTECMaterials.modifyMaterials();
    }

    @SubscribeEvent
    public void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {
        GTECRecipeTypes.init();
    }

    @SubscribeEvent
    public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
        GTECMachines.init();
    }
}

