
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.evolvingequipment.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.evolvingequipment.item.Tier2SwordItem;
import net.mcreator.evolvingequipment.item.GenericSwordItem;
import net.mcreator.evolvingequipment.item.EnvolMaterialItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EvolvingEquipmentModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ENVOL_MATERIAL = register(new EnvolMaterialItem());
	public static final Item GENERIC_SWORD = register(new GenericSwordItem());
	public static final Item TIER_2_SWORD = register(new Tier2SwordItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
