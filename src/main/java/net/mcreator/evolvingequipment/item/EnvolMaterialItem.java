
package net.mcreator.evolvingequipment.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.evolvingequipment.init.EvolvingEquipmentModTabs;

import java.util.List;

public class EnvolMaterialItem extends Item {
	public EnvolMaterialItem() {
		super(new Item.Properties().tab(EvolvingEquipmentModTabs.TAB_EVOLVING_EQUIPTMENT_MOD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("envol_material");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("It Feels"));
		list.add(new TextComponent("Still Incomplete"));
	}
}
