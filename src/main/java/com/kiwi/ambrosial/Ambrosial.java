package com.kiwi.ambrosial;

import com.kiwi.ambrosial.setup.Registration;
import net.minecraftforge.fml.common.Mod;

@Mod(Ambrosial.MODID)
public class Ambrosial {

    public static final String MODID = "ambrosial";

   public Ambrosial() {

       Registration.init();
   }
}
