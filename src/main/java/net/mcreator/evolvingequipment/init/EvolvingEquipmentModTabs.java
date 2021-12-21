
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.evolvingequipment.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EvolvingEquipmentModTabs {
	public static CreativeModeTab TAB_EVOLVING_EQUIPTMENT_MOD_TAB;

	public static void load() {
		TAB_EVOLVING_EQUIPTMENT_MOD_TAB = new CreativeModeTab("tabevolving_equiptment_mod_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EvolvingEquipmentModItems.GENERIC_SWORD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
