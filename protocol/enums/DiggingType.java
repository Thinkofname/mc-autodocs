package net.minecraft.network.enums;


public enum DiggingType {

   START_DESTROY_BLOCK("START_DESTROY_BLOCK", 0),
   ABORT_DESTROY_BLOCK("ABORT_DESTROY_BLOCK", 1),
   STOP_DESTROY_BLOCK("STOP_DESTROY_BLOCK", 2),
   DROP_ALL_ITEMS("DROP_ALL_ITEMS", 3),
   DROP_ITEM("DROP_ITEM", 4),
   RELEASE_USE_ITEM("RELEASE_USE_ITEM", 5),
   SWAP_HELD_ITEMS("SWAP_HELD_ITEMS", 6);
   // $FF: synthetic field
   private static final DiggingType[] h = new DiggingType[]{START_DESTROY_BLOCK, ABORT_DESTROY_BLOCK, STOP_DESTROY_BLOCK, DROP_ALL_ITEMS, DROP_ITEM, RELEASE_USE_ITEM, SWAP_HELD_ITEMS};


   private DiggingType(String arg_0, int arg_1) {}

}
