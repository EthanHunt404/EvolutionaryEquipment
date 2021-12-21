
package net.mcreator.evolvingequipment.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.evolvingequipment.init.EvolvingEquipmentModItems;

public class Tier2SwordItem extends SwordItem {
	public Tier2SwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2051;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EvolvingEquipmentModItems.ENVOL_MATERIAL));
			}
		}, 3, -3f, new Item.Properties().tab(null).fireResistant());
		setRegistryName("tier_2_sword");
	}
}
