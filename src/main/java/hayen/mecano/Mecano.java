package hayen.mecano;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Hayen on 2015-04-28.
 */
@Mod(modid = "Mecano", name = "Mecano", version = "1.7.10-0.0")
public class Mecano {

    @Mod.Instance("Mecano")
    public static Mecano instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        /*
            block and item
        */
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        /*
            GUI and recipes stuff
         */
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
