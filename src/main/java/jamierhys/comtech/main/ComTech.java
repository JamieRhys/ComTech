package jamierhys.comtech.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = ComTech.Reference.ModInfo.ModID,
        name = ComTech.Reference.ModInfo.ModName,
        version = ComTech.Reference.ModInfo.ModVersion,
        certificateFingerprint = ComTech.FINGERPRINT,
        acceptedMinecraftVersions = ComTech.Reference.ModInfo.ModVersion,
        canBeDeactivated = true
)
public class ComTech {
    public static final String FINGERPRINT      = "b0d4c6795a6826b7838d6114dcdf0be6de2729be";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Intialising ComTech");
    }

    @EventHandler
    public void onSignatureFail(FMLFingerprintViolationEvent event) {
        // If we're in development then just ignore
        if(event.isDirectory()) { return; }

        System.out.println("=============================================");
        System.out.println("       UNAURTHORISED HACK DETECTED!          ");
        System.out.println("=============================================");
        System.out.println("Comtech fingerprint check failed.");
        System.out.println("Expected fingerprint: " + event.getExpectedFingerprint());
        System.out.println("Observed fingerprint: " + event.getFingerprints());

    }

    public static final class Reference {
        private static final String                 RootPackage             = "jamierhys." + ModInfo.ModID;

        public static final class GUI {
            public static final String              GuiFactory              = RootPackage + ".client.gui.factory.GuiFactory";
        }

        public static final class ModInfo {
            public static final String              ModID                   = "comtech";
            public static final String              ModName                 = "ComTech";
            public static final String              ModVersion              = "0.0.2";
            public static final String              Deps                    = "required-before:Forge@[14.23.5.2768,)";
            public static final String              McVersion               = "[1.12.2,)";
        }

        public static final class Proxy {
            public static final String              Client                  = RootPackage + ".proxy.ClientProxy";
            public static final String              Server                  = RootPackage + ".proxy.ServerProxy";
        }

        public static final class Resource {
            public static final String              Prefix                  = ModInfo.ModID + ".";
        }
    }

}
