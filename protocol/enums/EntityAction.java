package net.minecraft.network.enums;


public enum EntityAction {

   START_SNEAKING("START_SNEAKING", 0),
   STOP_SNEAKING("STOP_SNEAKING", 1),
   STOP_SLEEPING("STOP_SLEEPING", 2),
   START_SPRINTING("START_SPRINTING", 3),
   STOP_SPRINTING("STOP_SPRINTING", 4),
   RIDING_JUMP("RIDING_JUMP", 5),
   OPEN_INVENTORY("OPEN_INVENTORY", 6);
   // $FF: synthetic field
   private static final EntityAction[] h = new EntityAction[]{START_SNEAKING, STOP_SNEAKING, STOP_SLEEPING, START_SPRINTING, STOP_SPRINTING, RIDING_JUMP, OPEN_INVENTORY};


   private EntityAction(String arg_0, int arg_1) {}

}
