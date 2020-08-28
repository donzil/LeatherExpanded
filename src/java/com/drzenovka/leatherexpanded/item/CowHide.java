package com.drzenovka.leatherexpanded.item;

import net.minecraft.creativetab.CreativeTabs;

public class CowHide extends CreateItem {
    public CowHide(){
        CreativeTabs tab = CreativeTabs.tabMaterials;
        setCreativeTab(tab);
        setUnlocalizedName("cowHide");
    }
}