package hayen.mecano.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hayen.mecano.reference.ItemNames;
import hayen.mecano.reference.ModReference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MecanoItems extends Item{

	/* Items instance */
	public static final MecanoItems cloth = (MecanoItems)(new MecanoItems().setUnlocalizedName(ItemNames.CLOTH));
	public static final MecanoItems straps = (MecanoItems)(new MecanoItems().setUnlocalizedName(ItemNames.LEATHER_STRAP));
	public static final MecanoItems hide = (MecanoItems)(new MecanoItems().setUnlocalizedName(ItemNames.HIDE));

	public static void init(){
		// Item initialisation
		GameRegistry.registerItem(cloth, ItemNames.CLOTH);
		GameRegistry.registerItem(straps, ItemNames.LEATHER_STRAP);
		GameRegistry.registerItem(hide, ItemNames.HIDE);
	}

	public MecanoItems(){
		super();
	}

	@Override
	public String getUnlocalizedName(){
		return String.format("item.%s%s", ModReference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s", ModReference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
