package hayen.mecano;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hayen.mecano.proxy.IProxy;
import hayen.mecano.reference.ModReference;

@Mod(modid = ModReference.MOD_ID, name = ModReference.MOD_NAME, version = ModReference.MOD_VERSION)
public class Mecano {

    @Mod.Instance(ModReference.MOD_ID)
    public static Mecano instance;

    @SidedProxy(clientSide = ModReference.CLIENT_PROXY_CLASS, serverSide = ModReference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

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
