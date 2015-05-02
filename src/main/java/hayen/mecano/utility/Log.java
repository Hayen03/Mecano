package hayen.mecano.utility;

import cpw.mods.fml.common.FMLLog;
import hayen.mecano.reference.ModReference;
import org.apache.logging.log4j.Level;

public class Log {

	public static void log(Level lvl, Object msg){
		FMLLog.log(ModReference.MOD_ID, lvl, msg.toString());
	}

	public static void info(Object msg){
		log(Level.INFO, msg);
	}

	public static void error(Object msg){
		log(Level.ERROR, msg);
	}

	public static void warning(Object msg){
		log(Level.WARN, msg);
	}

	public static void debug(Object msg){
		log(Level.DEBUG, msg);
	}

	public static void fatal(Object msg){
		log(Level.FATAL, msg);
	}

	public static void off(Object msg){
		log(Level.OFF, msg);
	}

	public static void all(Object msg){
		log(Level.ALL, msg);
	}

	public static void trace(Object msg){
		log(Level.TRACE, msg);
	}

}
