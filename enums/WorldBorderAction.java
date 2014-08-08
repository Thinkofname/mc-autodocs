package net.minecraft.network.enums;


public enum WorldBorderAction {

   SET_SIZE("SET_SIZE", 0),
   LERP_SIZE("LERP_SIZE", 1),
   SET_CENTER("SET_CENTER", 2),
   INITIALIZE("INITIALIZE", 3),
   SET_WARNING_TIME("SET_WARNING_TIME", 4),
   SET_WARNING_BLOCKS("SET_WARNING_BLOCKS", 5);
   // $FF: synthetic field
   private static final WorldBorderAction[] g = new WorldBorderAction[]{SET_SIZE, LERP_SIZE, SET_CENTER, INITIALIZE, SET_WARNING_TIME, SET_WARNING_BLOCKS};


   private WorldBorderAction(String arg_0, int arg_1) {}

}
