package com.drzenovka.leatherexpanded.init;

import com.drzenovka.leatherexpanded.armor.HideArmor;
import com.drzenovka.leatherexpanded.item.ColdFlame;
import com.drzenovka.leatherexpanded.item.PeltCreator;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static ToolMaterial COLDFLAME = EnumHelper.addToolMaterial("COLDFLAME", 2, 32, 6.0F, 2.0F, 22);
	public static ArmorMaterial HIDE = EnumHelper.addArmorMaterial("HIDE", 4, new int[] {1,2,2,1}, 9);
	public static ArmorMaterial CLOTH = EnumHelper.addArmorMaterial("CLOTH", 30, new int[] {1,1,1,1}, 5);
	
	public static Item hideHelmet = new HideArmor("hideHelmet", HIDE, "hideArmor", 0);
	public static Item hideChestplate = new HideArmor("hideChestplate", HIDE, "hideArmor", 1);
	public static Item hideLeggings = new HideArmor("hideLeggings", HIDE, "hideArmor", 2);
	public static Item hideBoots = new HideArmor("hideBoots", HIDE, "hideArmor", 3);
	public static Item clothHelmet = new HideArmor("clothHelmet", HIDE, "clothArmor", 0);
	public static Item clothChestplate = new HideArmor("clothChestplate", HIDE, "clothArmor", 1);
	public static Item clothLeggings = new HideArmor("clothLeggings", HIDE, "clothArmor", 2);
	public static Item clothBoots = new HideArmor("clothBoots", HIDE, "clothArmor", 3);
	public static Item coldFlame = new ColdFlame("coldFlame", COLDFLAME);
	
	public static final PeltCreator peltCreator = new PeltCreator();
	
	
	public static final void init() 
	{
		GameRegistry.registerItem(peltCreator, "peltCreator");
		
		GameRegistry.registerItem(coldFlame, "coldFlame");
		GameRegistry.registerItem(hideHelmet, "hideHelmet");
		GameRegistry.registerItem(hideChestplate, "hideChestplate");
		GameRegistry.registerItem(hideLeggings, "hideLeggings");
		GameRegistry.registerItem(hideBoots, "hideBoots");
		GameRegistry.registerItem(clothHelmet, "clothHelmet");
		GameRegistry.registerItem(clothChestplate, "clothChestplate");
		GameRegistry.registerItem(clothLeggings, "clothLeggings");
		GameRegistry.registerItem(clothBoots, "clothBoots");
	}
}
