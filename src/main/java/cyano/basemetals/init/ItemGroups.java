package cyano.basemetals.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import cyano.basemetals.BaseMetals;

public class ItemGroups {

	public static CreativeTabs tab_blocks;
	public static CreativeTabs tab_items;
	public static CreativeTabs tab_tools;

	private static Item blockItem;
	private static Item itemItem;
	private static Item toolItem;
	
	private static boolean initDone = false;
	public static void init(){
		if(initDone) return;
		
		// placeholders
		blockItem = net.minecraft.init.Items.iron_ingot;
		itemItem = net.minecraft.init.Items.iron_ingot;
		toolItem = net.minecraft.init.Items.iron_ingot;

		tab_blocks = new FunctionalCreativeTab( BaseMetals.MODID.concat(".blocks"),()->blockItem);
		tab_items = new FunctionalCreativeTab( BaseMetals.MODID.concat(".items"),()->itemItem);
		tab_tools = new FunctionalCreativeTab( BaseMetals.MODID.concat(".tools"),()->toolItem);
		
		initDone = true;
	}
	
	private static boolean postInitDone = false;
	public static void postInit(){
		if(postInitDone) return;

		blockItem = new ItemBlock(Blocks.copper_ore);
		itemItem = Items.copper_ingot;
		toolItem = Items.copper_crackhammer;
		
		postInitDone = true;
	}
	
}
