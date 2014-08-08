package net.minecraft.network.enums;


public enum TitleUpdateType {

   TITLE("TITLE", 0),
   SUBTITLE("SUBTITLE", 1),
   TIMES("TIMES", 2),
   CLEAR("CLEAR", 3),
   RESET("RESET", 4);
   // $FF: synthetic field
   private static final TitleUpdateType[] f = new TitleUpdateType[]{TITLE, SUBTITLE, TIMES, CLEAR, RESET};


   private TitleUpdateType(String arg_0, int arg_1) {}

   public static TitleUpdateType a(String arg_0) {
      TitleUpdateType[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         TitleUpdateType var4 = var1[var3];
         if(var4.name().equalsIgnoreCase(arg_0)) {
            return var4;
         }
      }

      return TITLE;
   }

   public static String[] a() {
      String[] var0 = new String[values().length];
      int var1 = 0;
      TitleUpdateType[] var2 = values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         TitleUpdateType var5 = var2[var4];
         var0[var1++] = var5.name().toLowerCase();
      }

      return var0;
   }

}
