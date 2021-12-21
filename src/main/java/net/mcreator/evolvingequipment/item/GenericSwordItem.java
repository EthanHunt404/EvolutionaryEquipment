
package net.mcreator.evolvingequipment.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.evolvingequipment.procedures.CommonEvolutionTriggersProcedure;
import net.mcreator.evolvingequipment.init.EvolvingEquipmentModTabs;
import net.mcreator.evolvingequipment.init.EvolvingEquipmentModItems;

public class GenericSwordItem extends SwordItem {
	public GenericSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1562;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EvolvingEquipmentModItems.ENVOL_MATERIAL));
			}
		}, 3, -3f, new Item.Properties().tab(EvolvingEquipmentModTabs.TAB_EVOLVING_EQUIPTMENT_MOD_TAB).fireResistant());
		setRegistryName("generic_sword");
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		CommonEvolutionTriggersProcedure.execute(itemstack);
	}
}
