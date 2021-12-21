package net.mcreator.evolvingequipment.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class CommonEvolutionTriggersProcedure {
	public static void execute(ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack) == 1
				&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) == 2) {
			itemstack.getOrCreateTag().putBoolean("IsLegitimate", (true));
			itemstack.getOrCreateTag().putString("Evolution", "Violent");
		}
	}
}
