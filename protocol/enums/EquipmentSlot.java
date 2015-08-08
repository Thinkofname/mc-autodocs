package net.minecraft.network.enums;


public enum EquipmentSlot {

   MAINHAND("MAINHAND", 0, ql$a.HAND, 0, 0, "mainhand"),
   OFFHAND("OFFHAND", 1, ql$a.HAND, 1, 5, "offhand"),
   FEET("FEET", 2, ql$a.ARMOR, 0, 1, "feet"),
   LEGS("LEGS", 3, ql$a.ARMOR, 1, 2, "legs"),
   TORSO("TORSO", 4, ql$a.ARMOR, 2, 3, "torso"),
   HEAD("HEAD", 5, ql$a.ARMOR, 3, 4, "head");
   private final ql$a g;
   private final int h;
   private final int i;
   private final String j;
   // $FF: synthetic field
   private static final EquipmentSlot[] k = new EquipmentSlot[]{MAINHAND, OFFHAND, FEET, LEGS, TORSO, HEAD};


   private EquipmentSlot(String arg_0, int arg_1, ql$a arg_2, int arg_3, int arg_4, String arg_5) {
      this.g = arg_2;
      this.h = arg_3;
      this.i = arg_4;
      this.j = arg_5;
   }

   public ql$a a() {
      return this.g;
   }

   public int b() {
      return this.h;
   }

   public int c() {
      return this.i;
   }

   public String d() {
      return this.j;
   }

}
