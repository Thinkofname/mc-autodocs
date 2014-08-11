package net.minecraft.network.enums;


public enum ListItemAction {

   ADD_PLAYER("ADD_PLAYER", 0),
   UPDATE_GAME_MODE("UPDATE_GAME_MODE", 1),
   UPDATE_LATENCY("UPDATE_LATENCY", 2),
   UPDATE_DISPLAY_NAME("UPDATE_DISPLAY_NAME", 3),
   REMOVE_PLAYER("REMOVE_PLAYER", 4);
   // $FF: synthetic field
   private static final ListItemAction[] f = new ListItemAction[]{ADD_PLAYER, UPDATE_GAME_MODE, UPDATE_LATENCY, UPDATE_DISPLAY_NAME, REMOVE_PLAYER};


   private ListItemAction(String arg_0, int arg_1) {}

}
