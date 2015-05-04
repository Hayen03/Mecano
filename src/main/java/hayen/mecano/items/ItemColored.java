package hayen.mecano.items;

import hayen.mecano.reference.ItemNames;
import net.minecraft.item.ItemStack;

public class ItemColored extends MecanoItems {

	@Override
	public String getUnlocalizedName(ItemStack itemStack){
		return super.getUnlocalizedName(itemStack) + "." + ItemNames.COLOR[itemStack.getItemDamage()];
	}

}
