package net.minecraft.network.enums;

import com.google.common.collect.Maps;
import java.util.Map;

public enum NameTagVisibility {

   ALWAYS("ALWAYS", 0, "always", 0),
   NEVER("NEVER", 1, "never", 1),
   HIDE_FOR_OTHER_TEAMS("HIDE_FOR_OTHER_TEAMS", 2, "hideForOtherTeams", 2),
   HIDE_FOR_OWN_TEAM("HIDE_FOR_OWN_TEAM", 3, "hideForOwnTeam", 3);
   private static Map g = Maps.newHashMap();
   public final String e;
   public final int f;
   // $FF: synthetic field
   private static final NameTagVisibility[] h = new NameTagVisibility[]{ALWAYS, NEVER, HIDE_FOR_OTHER_TEAMS, HIDE_FOR_OWN_TEAM};


   public static String[] a() {
      return (String[])g.keySet().toArray(new String[g.size()]);
   }

   public static NameTagVisibility a(String arg_0) {
      return (NameTagVisibility)g.get(arg_0);
   }

   private NameTagVisibility(String arg_0, int arg_1, String arg_2, int arg_3) {
      this.e = arg_2;
      this.f = arg_3;
   }

   static {
      NameTagVisibility[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         NameTagVisibility var3 = var0[var2];
         g.put(var3.e, var3);
      }

   }
}
