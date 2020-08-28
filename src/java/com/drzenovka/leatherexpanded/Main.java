package com.drzenovka.leatherexpanded;

import com.drzenovka.leatherexpanded.config.LeatherEnabledConfig;
import com.drzenovka.leatherexpanded.init.ModItems;
import com.drzenovka.leatherexpanded.init.Recipes;
import com.drzenovka.leatherexpanded.proxy.IProxy;
import com.drzenovka.leatherexpanded.util.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)


public class Main {
	@Mod.Instance(Reference.MOD_ID)
	public static Main instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
	
	public static IProxy proxy;
	//public static final String MODID = "";
	//public static final String MODNAME = "Leather Expanded";
	//public static final String VERSION = "1.0.0";

	//@Instance
	//public static Main instance = new Main();

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		//network handling
		
		//load config
		LeatherEnabledConfig.init(e.getSuggestedConfigurationFile());
		
		//Register for config events
		FMLCommonHandler.instance().bus().register(new LeatherEnabledConfig());
		
		//Register items & Blocks
		ModItems.init();
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent event){
        // UI

        // Tile Entities

        // Recipes
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        // Respond to other mods
    }
}
