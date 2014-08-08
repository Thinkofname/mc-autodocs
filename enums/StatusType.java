package net.minecraft.network.enums;


public enum StatusType {

   PERFORM_RESPAWN("PERFORM_RESPAWN", 0),
   REQUEST_STATS("REQUEST_STATS", 1),
   OPEN_INVENTORY_ACHIEVEMENT("OPEN_INVENTORY_ACHIEVEMENT", 2);
   // $FF: synthetic field
   private static final StatusType[] d = new StatusType[]{PERFORM_RESPAWN, REQUEST_STATS, OPEN_INVENTORY_ACHIEVEMENT};


   private StatusType(String arg_0, int arg_1) {}

}
