package net.minecraft.network;


public enum ProtocolDirection {

   SERVERBOUND("SERVERBOUND", 0),
   CLIENTBOUND("CLIENTBOUND", 1);
   // $FF: synthetic field
   private static final ProtocolDirection[] c = new ProtocolDirection[]{SERVERBOUND, CLIENTBOUND};


   private ProtocolDirection(String arg_0, int arg_1) {}

}
