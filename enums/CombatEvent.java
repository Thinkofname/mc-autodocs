package net.minecraft.network.enums;


public enum CombatEvent {

   ENTER_COMBAT("ENTER_COMBAT", 0),
   END_COMBAT("END_COMBAT", 1),
   ENTITY_DIED("ENTITY_DIED", 2);
   // $FF: synthetic field
   private static final CombatEvent[] d = new CombatEvent[]{ENTER_COMBAT, END_COMBAT, ENTITY_DIED};


   private CombatEvent(String arg_0, int arg_1) {}

}
