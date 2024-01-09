package argent_matter.gtec.api.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;


public class GTECMaterials {

    public static void init() {
        IronMagnetic.addFlags(GENERATE_FOIL);
    }

    // PlatinumLine
public static final Material PLATINUM_METALLIC_POWDER = new Material.Builder("platinum_metallic_powder")
        .dust(1)
        .color(0xF0EC9A).iconSet(MaterialIconSet.BRIGHT)
        .components(Platinum, 1, Palladium, 1, Iridium, 1, Osmium, 1, Rhodium, 1, Ruthenium, 1)
        .buildAndRegister();

    public static final Material PLATINUM_RESIDUE = new Material.Builder("platinum_residue")
            .dust(1)
            .color(0x64601C)
            .buildAndRegister();


}
