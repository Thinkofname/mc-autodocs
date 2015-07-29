package net.minecraft.network.enums;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public enum BlockFace implements ny {

   DOWN("DOWN", 0, 0, 1, -1, "down", cq$b.NEGATIVE, cq$a.Y, new df(0, -1, 0)),
   UP("UP", 1, 1, 0, -1, "up", cq$b.POSITIVE, cq$a.Y, new df(0, 1, 0)),
   NORTH("NORTH", 2, 2, 3, 2, "north", cq$b.NEGATIVE, cq$a.Z, new df(0, 0, -1)),
   SOUTH("SOUTH", 3, 3, 2, 0, "south", cq$b.POSITIVE, cq$a.Z, new df(0, 0, 1)),
   WEST("WEST", 4, 4, 5, 1, "west", cq$b.NEGATIVE, cq$a.X, new df(-1, 0, 0)),
   EAST("EAST", 5, 5, 4, 3, "east", cq$b.POSITIVE, cq$a.X, new df(1, 0, 0));
   private final int g;
   private final int h;
   private final int i;
   private final String j;
   private final cq$a k;
   private final cq$b l;
   private final df m;
   private static final BlockFace[] n = new BlockFace[6];
   private static final BlockFace[] o = new BlockFace[4];
   private static final Map p = Maps.newHashMap();
   // $FF: synthetic field
   private static final BlockFace[] q = new BlockFace[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};


   private BlockFace(String arg_0, int arg_1, int arg_2, int arg_3, int arg_4, String arg_5, cq$b arg_6, cq$a arg_7, df arg_8) {
      this.g = arg_2;
      this.i = arg_4;
      this.h = arg_3;
      this.j = arg_5;
      this.k = arg_7;
      this.l = arg_6;
      this.m = arg_8;
   }

   public int a() {
      return this.g;
   }

   public int b() {
      return this.i;
   }

   public cq$b c() {
      return this.l;
   }

   public BlockFace d() {
      return a(this.h);
   }

   public BlockFace a(cq$a arg_0) {
      switch(cq$1.a[arg_0.ordinal()]) {
      case 1:
         if(this != WEST && this != EAST) {
            return this.n();
         }

         return this;
      case 2:
         if(this != UP && this != DOWN) {
            return this.e();
         }

         return this;
      case 3:
         if(this != NORTH && this != SOUTH) {
            return this.p();
         }

         return this;
      default:
         throw new IllegalStateException("Unable to get CW facing for axis " + arg_0);
      }
   }

   public BlockFace e() {
      switch(cq$1.b[this.ordinal()]) {
      case 1:
         return EAST;
      case 2:
         return SOUTH;
      case 3:
         return WEST;
      case 4:
         return NORTH;
      default:
         throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      }
   }

   private BlockFace n() {
      switch(cq$1.b[this.ordinal()]) {
      case 1:
         return DOWN;
      case 2:
      case 4:
      default:
         throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      case 3:
         return UP;
      case 5:
         return NORTH;
      case 6:
         return SOUTH;
      }
   }

   private BlockFace p() {
      switch(cq$1.b[this.ordinal()]) {
      case 2:
         return DOWN;
      case 3:
      default:
         throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
      case 4:
         return UP;
      case 5:
         return EAST;
      case 6:
         return WEST;
      }
   }

   public BlockFace f() {
      switch(cq$1.b[this.ordinal()]) {
      case 1:
         return WEST;
      case 2:
         return NORTH;
      case 3:
         return EAST;
      case 4:
         return SOUTH;
      default:
         throw new IllegalStateException("Unable to get CCW facing of " + this);
      }
   }

   public int g() {
      return this.k == cq$a.X?this.l.a():0;
   }

   public int h() {
      return this.k == cq$a.Y?this.l.a():0;
   }

   public int i() {
      return this.k == cq$a.Z?this.l.a():0;
   }

   public String j() {
      return this.j;
   }

   public cq$a k() {
      return this.k;
   }

   public static BlockFace a(String arg_0) {
      return arg_0 == null?null:(BlockFace)p.get(arg_0.toLowerCase());
   }

   public static BlockFace a(int arg_0) {
      return n[nu.a(arg_0 % n.length)];
   }

   public static BlockFace b(int arg_0) {
      return o[nu.a(arg_0 % o.length)];
   }

   public static BlockFace a(double arg_0) {
      return b(nu.c(arg_0 / 90.0D + 0.5D) & 3);
   }

   public static BlockFace a(Random arg_0) {
      return values()[arg_0.nextInt(values().length)];
   }

   public static BlockFace a(float arg_0, float arg_1, float arg_2) {
      BlockFace var3 = NORTH;
      float var4 = Float.MIN_VALUE;
      BlockFace[] var5 = values();
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         BlockFace var8 = var5[var7];
         float var9 = arg_0 * (float)var8.m.n() + arg_1 * (float)var8.m.o() + arg_2 * (float)var8.m.p();
         if(var9 > var4) {
            var4 = var9;
            var3 = var8;
         }
      }

      return var3;
   }

   public String toString() {
      return this.j;
   }

   public String l() {
      return this.j;
   }

   public static BlockFace a(cq$b arg_0, cq$a arg_1) {
      BlockFace[] var2 = values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         BlockFace var5 = var2[var4];
         if(var5.c() == arg_0 && var5.k() == arg_1) {
            return var5;
         }
      }

      throw new IllegalArgumentException("No such direction: " + arg_0 + " " + arg_1);
   }

   public df m() {
      return this.m;
   }

   static {
      BlockFace[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         BlockFace var3 = var0[var2];
         n[var3.g] = var3;
         if(var3.k().c()) {
            o[var3.i] = var3;
         }

         p.put(var3.j().toLowerCase(), var3);
      }

   }
}
