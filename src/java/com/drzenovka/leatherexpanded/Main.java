package com.drzenovka.leatherexpanded;

import com.drzenovka.leatherexpanded.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)


public class Main {
	@SidedProxy(clientSide="com.drzenovka.leatherexpanded.proxy.ClientProxy", serverSide="com.drzenovka.leatherexpanded.proxy.ServerProxy")
	
	public static CommonProxy proxy;
	public static final String MODID = "leatherexpanded";
	public static final String MODNAME = "Leather Expanded";
	public static final String VERSION = "1.0.0";

	@Instance
	public static Main instance = new Main();

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		System.out.println("DEBUG: preInit");       
	}
	    
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		System.out.println("DEBUG: init");
		
	}
	    
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		System.out.println("DEBUG: postInit");   
	}
}
