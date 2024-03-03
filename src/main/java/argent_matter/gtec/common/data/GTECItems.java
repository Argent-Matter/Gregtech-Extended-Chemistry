package argent_matter.gtec.common.data;

import argent_matter.gtec.registry.GTECCreativeModeTabs;
import com.tterrag.registrate.util.entry.ItemEntry;
import static argent_matter.gtec.registry.GTECRegistries.REGISTRATE;
import net.minecraft.world.item.Item;


@SuppressWarnings("Convert2MethodRef")
public class GTECItems {
    static {
        REGISTRATE.creativeModeTab(() -> GTECCreativeModeTabs.ITEM);
    }


    // Echo Circuit Stuff
    public static final ItemEntry<Item> PETRIDISHWITHSCULKCULTURE = REGISTRATE.item("petri_dish_with_sculk_culture", Item::new)
            .lang("Petri Dish with Sculk Culture")
            .defaultModel()
            .register();

    public static final ItemEntry<Item> ECHO_MAINFRAME_UEV = REGISTRATE.item("echo_processor_mainframe", Item::new)
            .lang("Echo Processor Mainframe")
            .defaultModel()
            .register();

    public static final ItemEntry<Item> ECHO_SUPERCOMPUTER_UHV = REGISTRATE.item("echo_processor_supercomputer", Item::new)
            .lang("Echo Processor Supercomputer")
            .defaultModel()
            .register();

    public static final ItemEntry<Item> ECHO_PROCESSOR_ASSEMBLY_UV = REGISTRATE.item("echo_processor_assembly", Item::new)
            .lang("Echo Processor Assembly")
            .defaultModel()
            .register();

    public static final ItemEntry<Item> ECHO_PROCESSOR_ZPM = REGISTRATE.item("echo_processor", Item::new)
            .lang("Echo Processor")
            .defaultModel()
            .register();

    public static final ItemEntry<Item> ECHO_CIRCUIT_BOARD = REGISTRATE.item("echo_circuit_board", Item::new)
            .lang("Echo Circuit Board")
            .defaultModel()
            .register();
    public static final ItemEntry<Item> ECHO_PRINTED_CIRCUIT_BOARD = REGISTRATE.item("echo_printed_circuit_board", Item::new)
            .lang("Echo Printed Circuit Board")
            .defaultModel()
            .register();

    public static void init() {
    }
}
