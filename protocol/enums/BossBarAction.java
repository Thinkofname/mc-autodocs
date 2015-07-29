package net.minecraft.network.enums;


public enum BossBarAction {

   ADD("ADD", 0),
   REMOVE("REMOVE", 1),
   UPDATE_PCT("UPDATE_PCT", 2),
   UPDATE_NAME("UPDATE_NAME", 3),
   UPDATE_STYLE("UPDATE_STYLE", 4),
   UPDATE_PROPERTIES("UPDATE_PROPERTIES", 5);
   // $FF: synthetic field
   private static final BossBarAction[] g = new BossBarAction[]{ADD, REMOVE, UPDATE_PCT, UPDATE_NAME, UPDATE_STYLE, UPDATE_PROPERTIES};


   private BossBarAction(String arg_0, int arg_1) {}

}
