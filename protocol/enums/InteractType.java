package net.minecraft.network.enums;


public enum InteractType {

   INTERACT("INTERACT", 0),
   ATTACK("ATTACK", 1),
   INTERACT_AT("INTERACT_AT", 2);
   // $FF: synthetic field
   private static final InteractType[] d = new InteractType[]{INTERACT, ATTACK, INTERACT_AT};


   private InteractType(String arg_0, int arg_1) {}

}
