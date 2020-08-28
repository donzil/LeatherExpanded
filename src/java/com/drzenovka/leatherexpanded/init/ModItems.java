package com.drzenovka.leatherexpanded.init;


//import com.drzenovka.leatherexpanded.item.CowHide;
import com.drzenovka.leatherexpanded.item.PeltCreator;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	//public static final CowHide cowHide = new CowHide();
	public static final PeltCreator peltCreator = new PeltCreator();
	
	public static final void init() {
		//GameRegistry.registerItem(cowHide, "cowHide");
		GameRegistry.registerItem(peltCreator, "peltCreator");
	}

}
