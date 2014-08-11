package net.minecraft.network.enums;


public enum ResourcePackStatus {

   SUCCESSFULLY_LOADED("SUCCESSFULLY_LOADED", 0),
   DECLINED("DECLINED", 1),
   FAILED_DOWNLOAD("FAILED_DOWNLOAD", 2),
   ACCEPTED("ACCEPTED", 3);
   // $FF: synthetic field
   private static final ResourcePackStatus[] e = new ResourcePackStatus[]{SUCCESSFULLY_LOADED, DECLINED, FAILED_DOWNLOAD, ACCEPTED};


   private ResourcePackStatus(String arg_0, int arg_1) {}

}
