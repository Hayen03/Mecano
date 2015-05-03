package hayen.mecano.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import hayen.mecano.handler.ConfigHandler;
import hayen.mecano.reference.ModReference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class GUIConfig  extends GuiConfig{

	public GUIConfig(GuiScreen parentScreen) {
		super(	parentScreen,
				new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				ModReference.MOD_ID,
				false,
				false,
				"Mecano configuration");
	}

}
