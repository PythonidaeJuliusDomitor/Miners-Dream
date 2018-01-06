package com.lavaingot.minersdream.init;

import java.util.ArrayList;
import java.util.List;

import com.lavaingot.minersdream.Main;
import com.lavaingot.minersdream.objects.armour.ArmourBase;
import com.lavaingot.minersdream.objects.items.ItemBase;
import com.lavaingot.minersdream.objects.items.ItemDream;
import com.lavaingot.minersdream.objects.items.SubItemPropertyGetter;
import com.lavaingot.minersdream.objects.tools.ToolAxe;
import com.lavaingot.minersdream.objects.tools.ToolHoe;
import com.lavaingot.minersdream.objects.tools.ToolPickaxe;
import com.lavaingot.minersdream.objects.tools.ToolShovel;
import com.lavaingot.minersdream.objects.tools.ToolSword;
import com.lavaingot.minersdream.util.Reference;
import com.lavaingot.minersdream.util.handlers.EnumHandler;
import com.lavaingot.minersdream.util.handlers.EnumHandler.OreType;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials (name, harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial TOOL_COPPER = 		EnumHelper.addToolMaterial("tool_copper", 2, 200, 4.0F, 1.5F, 15);
	public static final ToolMaterial TOOL_ALUMINIUM =	EnumHelper.addToolMaterial("tool_aluminium", 1, 150, 8.0F, 1.0F, 50);
	public static final ToolMaterial TOOL_BISMUTH =		EnumHelper.addToolMaterial("tool_bismuth", 3, 300, 5.0F, 4.0F, 60);
	public static final ToolMaterial TOOL_CADMIUM =		EnumHelper.addToolMaterial("tool_cadmium", 1, 50, 1.2F, 0.5F, 5);
	public static final ToolMaterial TOOL_POTASSIUM =	EnumHelper.addToolMaterial("tool_potassium", 1, 60, 2.0F, 0.5F, 5);
	public static final ToolMaterial TOOL_COBALT =		EnumHelper.addToolMaterial("tool_cobalt", 3, 250, 1.0F, 1.4F, 25);
	public static final ToolMaterial TOOL_PLATINUM =	EnumHelper.addToolMaterial("tool_platinum", 3, 400, 3.0F, 10.0F, 20);
	public static final ToolMaterial TOOL_SILVER =		EnumHelper.addToolMaterial("tool_silver", 2, 400, 6.0F, 8.0F, 100);
	public static final ToolMaterial TOOL_TIN =			EnumHelper.addToolMaterial("tool_tin", 1, 100, 2.0F, 2.0F, 10);
	public static final ToolMaterial TOOL_URANIUM =		EnumHelper.addToolMaterial("tool_uranium", 3, 1000, 10.0F, 10.0F, 64);
	public static final ToolMaterial TOOL_TUNGSTEN =	EnumHelper.addToolMaterial("tool_tungsten", 2, 600, 6.0F, 5.0F, 10);
	public static final ToolMaterial TOOL_ZINC =		EnumHelper.addToolMaterial("tool_zinc", 1, 30, 6.0F, 1.0F, 50);
	
	//ArmourMaterials (name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	public static final ArmorMaterial ARMOUR_COPPER = 		EnumHelper.addArmorMaterial("armour_copper", Reference.MOD_ID + ":copper", 12, new int[]{2, 4, 9, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_ALUMINIUM = 	EnumHelper.addArmorMaterial("armour_aluminium", Reference.MOD_ID + ":aluminium", 10, new int[]{2, 4, 4, 4}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_BISMUTH = 		EnumHelper.addArmorMaterial("armour_bismuth", Reference.MOD_ID + ":bismuth", 15, new int[]{5, 10, 5, 5}, 60, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial ARMOUR_PLATINUM =		EnumHelper.addArmorMaterial("armour_platinum", Reference.MOD_ID + ":platinum", 25, new int[]{6, 12, 5, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial ARMOUR_TIN =			EnumHelper.addArmorMaterial("armour_tin", Reference.MOD_ID + ":tin", 10, new int[]{2, 4, 1, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F);
	public static final ArmorMaterial ARMOUR_URANIUM = 		EnumHelper.addArmorMaterial("armour_uranium", Reference.MOD_ID + ":uranium", 20, new int[]{5, 10, 5, 5}, 64, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial ARMOUR_TUNGSTEN =		EnumHelper.addArmorMaterial("armour_tungsten", Reference.MOD_ID + ":tungsten", 14, new int[]{3, 4, 5, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.8F);
	
	//Items
	
	public static final Item INGOT = new OreIngots("ingot", Main.mineabletab);
	
	public static final Item STICK_COBALT = 		new ItemBase("stick_cobalt", Main.mineabletabtools);
	public static final ItemDream THE_DREAM = 		new ItemDream("the_dream", Main.mineabletabtools);
	
	
	//Tools
	public static final Item PICKAXE_COPPER = 		new ToolPickaxe("pickaxe_copper", TOOL_COPPER, Main.mineabletabtools);
	public static final Item SWORD_COPPER = 		new ToolSword("sword_copper", TOOL_COPPER, Main.mineabletabtools);
	public static final Item HOE_COPPER = 			new ToolHoe("hoe_copper", TOOL_COPPER, Main.mineabletabtools);
	public static final Item AXE_COPPER = 			new ToolAxe("axe_copper", TOOL_COPPER, Main.mineabletabtools);
	public static final Item SHOVEL_COPPER = 		new ToolShovel("shovel_copper", TOOL_COPPER, Main.mineabletabtools);

	public static final Item PICKAXE_ALUMINIUM = 	new ToolPickaxe("pickaxe_aluminium", TOOL_ALUMINIUM, Main.mineabletabtools);
	public static final Item SWORD_ALUMINIUM = 		new ToolSword("sword_aluminium", TOOL_ALUMINIUM, Main.mineabletabtools);
	public static final Item HOE_ALUMINIUM = 		new ToolHoe("hoe_aluminium", TOOL_ALUMINIUM, Main.mineabletabtools);
	public static final Item AXE_ALUMINIUM = 		new ToolAxe("axe_aluminium", TOOL_ALUMINIUM, Main.mineabletabtools);
	public static final Item SHOVEL_ALUMINIUM = 	new ToolShovel("shovel_aluminium", TOOL_ALUMINIUM, Main.mineabletabtools);
	
	public static final Item PICKAXE_BISMUTH = 		new ToolPickaxe("pickaxe_bismuth", TOOL_BISMUTH, Main.mineabletabtools);
	public static final Item SWORD_BISMUTH = 		new ToolSword("sword_bismuth", TOOL_BISMUTH, Main.mineabletabtools);
	public static final Item HOE_BISMUTH = 			new ToolHoe("hoe_bismuth", TOOL_BISMUTH, Main.mineabletabtools);
	public static final Item AXE_BISMUTH = 			new ToolAxe("axe_bismuth", TOOL_BISMUTH, Main.mineabletabtools);
	public static final Item SHOVEL_BISMUTH = 		new ToolShovel("shovel_bismuth", TOOL_BISMUTH, Main.mineabletabtools);
	
	public static final Item PICKAXE_CADMIUM = 		new ToolPickaxe("pickaxe_cadmium", TOOL_CADMIUM, Main.mineabletabtools);
	public static final Item SWORD_CADMIUM = 		new ToolSword("sword_cadmium", TOOL_CADMIUM, Main.mineabletabtools);
	public static final Item HOE_CADMIUM = 			new ToolHoe("hoe_cadmium", TOOL_CADMIUM, Main.mineabletabtools);
	public static final Item AXE_CADMIUM = 			new ToolAxe("axe_cadmium", TOOL_CADMIUM, Main.mineabletabtools);
	public static final Item SHOVEL_CADMIUM = 		new ToolShovel("shovel_cadmium", TOOL_CADMIUM, Main.mineabletabtools);
		
	public static final Item PICKAXE_POTASSIUM = 	new ToolPickaxe("pickaxe_potassium", TOOL_POTASSIUM, Main.mineabletabtools);
	public static final Item SWORD_POTASSIUM = 		new ToolSword("sword_potassium", TOOL_POTASSIUM, Main.mineabletabtools);
	public static final Item HOE_POTASSIUM = 		new ToolHoe("hoe_potassium", TOOL_POTASSIUM, Main.mineabletabtools);
	public static final Item AXE_POTASSIUM = 		new ToolAxe("axe_potassium", TOOL_POTASSIUM, Main.mineabletabtools);
	public static final Item SHOVEL_POTASSIUM = 	new ToolShovel("shovel_potassium", TOOL_POTASSIUM, Main.mineabletabtools);
	
	public static final Item PICKAXE_COBALT = 		new ToolPickaxe("pickaxe_cobalt", TOOL_COBALT, Main.mineabletabtools);
	public static final Item SWORD_COBALT = 		new ToolSword("sword_cobalt", TOOL_COBALT, Main.mineabletabtools);
	public static final Item HOE_COBALT = 			new ToolHoe("hoe_cobalt", TOOL_COBALT, Main.mineabletabtools);
	public static final Item AXE_COBALT = 			new ToolAxe("axe_cobalt", TOOL_COBALT, Main.mineabletabtools);
	public static final Item SHOVEL_COBALT = 		new ToolShovel("shovel_cobalt", TOOL_COBALT, Main.mineabletabtools);
	
	public static final Item PICKAXE_PLATINUM = 	new ToolPickaxe("pickaxe_platinum", TOOL_PLATINUM, Main.mineabletabtools);
	public static final Item SWORD_PLATINUM = 		new ToolSword("sword_platinum", TOOL_PLATINUM, Main.mineabletabtools);
	public static final Item HOE_PLATINUM = 		new ToolHoe("hoe_platinum", TOOL_PLATINUM, Main.mineabletabtools);
	public static final Item AXE_PLATINUM = 		new ToolAxe("axe_platinum", TOOL_PLATINUM, Main.mineabletabtools);
	public static final Item SHOVEL_PLATINUM = 		new ToolShovel("shovel_platinum", TOOL_PLATINUM, Main.mineabletabtools);
	
	public static final Item PICKAXE_SILVER = 		new ToolPickaxe("pickaxe_silver", TOOL_SILVER, Main.mineabletabtools);
	public static final Item SWORD_SILVER = 		new ToolSword("sword_silver", TOOL_SILVER, Main.mineabletabtools);
	public static final Item HOE_SILVER = 			new ToolHoe("hoe_silver", TOOL_SILVER, Main.mineabletabtools);
	public static final Item AXE_SILVER = 			new ToolAxe("axe_silver", TOOL_SILVER, Main.mineabletabtools);
	public static final Item SHOVEL_SILVER = 		new ToolShovel("shovel_silver", TOOL_SILVER, Main.mineabletabtools);
	
	public static final Item PICKAXE_TIN = 			new ToolPickaxe("pickaxe_tin", TOOL_TIN, Main.mineabletabtools);
	public static final Item SWORD_TIN = 			new ToolSword("sword_tin", TOOL_TIN, Main.mineabletabtools);
	public static final Item HOE_TIN = 				new ToolHoe("hoe_tin", TOOL_TIN, Main.mineabletabtools);
	public static final Item AXE_TIN = 				new ToolAxe("axe_tin", TOOL_TIN, Main.mineabletabtools);
	public static final Item SHOVEL_TIN = 			new ToolShovel("shovel_tin", TOOL_TIN, Main.mineabletabtools);
	
	public static final Item PICKAXE_URANIUM = 		new ToolPickaxe("pickaxe_uranium", TOOL_URANIUM, Main.mineabletabtools);
	public static final Item SWORD_URANIUM = 		new ToolSword("sword_uranium", TOOL_URANIUM, Main.mineabletabtools);
	public static final Item HOE_URANIUM = 			new ToolHoe("hoe_uranium", TOOL_URANIUM, Main.mineabletabtools);
	public static final Item AXE_URANIUM = 			new ToolAxe("axe_uranium", TOOL_URANIUM, Main.mineabletabtools);
	public static final Item SHOVEL_URANIUM = 		new ToolShovel("shovel_uranium", TOOL_URANIUM, Main.mineabletabtools);
	
	public static final Item PICKAXE_TUNGSTEN = 	new ToolPickaxe("pickaxe_tungsten", TOOL_TUNGSTEN, Main.mineabletabtools);
	public static final Item SWORD_TUNGSTEN = 		new ToolSword("sword_tungsten", TOOL_TUNGSTEN, Main.mineabletabtools);
	public static final Item HOE_TUNGSTEN = 		new ToolHoe("hoe_tungsten", TOOL_TUNGSTEN, Main.mineabletabtools);
	public static final Item AXE_TUNGSTEN = 		new ToolAxe("axe_tungsten", TOOL_TUNGSTEN, Main.mineabletabtools);
	public static final Item SHOVEL_TUNGSTEN = 		new ToolShovel("shovel_tungsten", TOOL_TUNGSTEN, Main.mineabletabtools);

	public static final Item PICKAXE_ZINC = 		new ToolPickaxe("pickaxe_zinc", TOOL_ZINC, Main.mineabletabtools);
	public static final Item SWORD_ZINC = 			new ToolSword("sword_zinc", TOOL_ZINC, Main.mineabletabtools);
	public static final Item HOE_ZINC = 			new ToolHoe("hoe_zinc", TOOL_ZINC, Main.mineabletabtools);
	public static final Item AXE_ZINC = 			new ToolAxe("axe_zinc", TOOL_ZINC, Main.mineabletabtools);
	public static final Item SHOVEL_ZINC = 			new ToolShovel("shovel_zinc", TOOL_ZINC, Main.mineabletabtools);

	//Armour
	public static final Item HELMET_COPPER = 		new ArmourBase("helmet_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD, Main.mineabletab);
	public static final Item CHESTPLATE_COPPER = 	new ArmourBase("chestplate_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST, Main.mineabletab);
	public static final Item LEGGINGS_COPPER = 		new ArmourBase("leggings_copper", ARMOUR_COPPER, 2, EntityEquipmentSlot.LEGS, Main.mineabletab);
	public static final Item BOOTS_COPPER = 		new ArmourBase("boots_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.FEET, Main.mineabletab);
	
	public static final Item HELMET_ALUMINIUM = 	new ArmourBase("helmet_aluminium", ARMOUR_ALUMINIUM, 1, EntityEquipmentSlot.HEAD, Main.mineabletab);
	public static final Item CHESTPLATE_ALUMINIUM = new ArmourBase("chestplate_aluminium", ARMOUR_ALUMINIUM, 1, EntityEquipmentSlot.CHEST, Main.mineabletab);
	public static final Item LEGGINGS_ALUMINIUM = 	new ArmourBase("leggings_aluminium", ARMOUR_ALUMINIUM, 2, EntityEquipmentSlot.LEGS, Main.mineabletab);
	public static final Item BOOTS_ALUMINIUM = 		new ArmourBase("boots_aluminium", ARMOUR_ALUMINIUM, 1, EntityEquipmentSlot.FEET, Main.mineabletab);
	
	public static final Item HELMET_BISMUTH = 		new ArmourBase("helmet_bismuth", ARMOUR_BISMUTH, 1, EntityEquipmentSlot.HEAD, Main.mineabletab);
	public static final Item CHESTPLATE_BISMUTH = 	new ArmourBase("chestplate_bismuth", ARMOUR_BISMUTH, 1, EntityEquipmentSlot.CHEST, Main.mineabletab);
	public static final Item LEGGINGS_BISMUTH = 	new ArmourBase("leggings_bismuth", ARMOUR_BISMUTH, 2, EntityEquipmentSlot.LEGS, Main.mineabletab);
	public static final Item BOOTS_BISMUTH = 		new ArmourBase("boots_bismuth", ARMOUR_BISMUTH, 1, EntityEquipmentSlot.FEET, Main.mineabletab);
	
	public static final Item HELMET_PLATINUM = 		new ArmourBase("helmet_platinum", ARMOUR_PLATINUM, 1, EntityEquipmentSlot.HEAD, Main.mineabletab);
	public static final Item CHESTPLATE_PLATINUM = 	new ArmourBase("chestplate_platinum", ARMOUR_PLATINUM, 1, EntityEquipmentSlot.CHEST, Main.mineabletab);
	public static final Item LEGGINGS_PLATINUM = 	new ArmourBase("leggings_platinum", ARMOUR_PLATINUM, 2, EntityEquipmentSlot.LEGS, Main.mineabletab);
	public static final Item BOOTS_PLATINUM = 		new ArmourBase("boots_platinum", ARMOUR_PLATINUM, 1, EntityEquipmentSlot.FEET, Main.mineabletab);
	
	public static final Item HELMET_TIN = 			new ArmourBase("helmet_tin", ARMOUR_TIN, 1, EntityEquipmentSlot.HEAD, Main.mineabletab);
	public static final Item CHESTPLATE_TIN = 		new ArmourBase("chestplate_tin", ARMOUR_TIN, 1, EntityEquipmentSlot.CHEST, Main.mineabletab);
	public static final Item LEGGINGS_TIN = 		new ArmourBase("leggings_tin", ARMOUR_TIN, 2, EntityEquipmentSlot.LEGS, Main.mineabletab);
	public static final Item BOOTS_TIN = 			new ArmourBase("boots_tin", ARMOUR_TIN, 1, EntityEquipmentSlot.FEET, Main.mineabletab);
	
	public static final Item HELMET_URANIUM = 		new ArmourBase("helmet_uranium", ARMOUR_URANIUM, 1, EntityEquipmentSlot.HEAD, Main.mineabletab);
	public static final Item CHESTPLATE_URANIUM = 	new ArmourBase("chestplate_uranium", ARMOUR_URANIUM, 1, EntityEquipmentSlot.CHEST, Main.mineabletab);
	public static final Item LEGGINGS_URANIUM = 	new ArmourBase("leggings_uranium", ARMOUR_URANIUM, 2, EntityEquipmentSlot.LEGS, Main.mineabletab);
	public static final Item BOOTS_URANIUM = 		new ArmourBase("boots_uranium", ARMOUR_URANIUM, 1, EntityEquipmentSlot.FEET, Main.mineabletab);
	
	public static final Item HELMET_TUNGSTEN = 		new ArmourBase("helmet_tungsten", ARMOUR_TUNGSTEN, 1, EntityEquipmentSlot.HEAD, Main.mineabletab);
	public static final Item CHESTPLATE_TUNGSTEN = 	new ArmourBase("chestplate_tungsten", ARMOUR_TUNGSTEN, 1, EntityEquipmentSlot.CHEST, Main.mineabletab);
	public static final Item LEGGINGS_TUNGSTEN = 	new ArmourBase("leggings_tungsten", ARMOUR_TUNGSTEN, 2, EntityEquipmentSlot.LEGS, Main.mineabletab);
	public static final Item BOOTS_TUNGSTEN = 		new ArmourBase("boots_tungsten", ARMOUR_TUNGSTEN, 1, EntityEquipmentSlot.FEET, Main.mineabletab);
	
	public static void registerOreOutputs() {
		for (OreType variant : EnumHandler.OreType.values()) {
			BlockOres.OreOutput.add((new ItemStack(INGOT, 1, variant.getMeta()).getItem()));
		}
	}
}
