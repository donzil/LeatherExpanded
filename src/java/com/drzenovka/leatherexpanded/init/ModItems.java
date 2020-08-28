package com.drzenovka.leatherexpanded.init;


import com.drzenovka.leatherexpanded.item.CowHide;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static final CowHide cowHide = new CowHide();
	
	public static final void init() {
		GameRegistry.registerItem(cowHide, "cowHide");
	}

}
