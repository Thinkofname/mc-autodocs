package net.minecraft.network.enums;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public enum Particle {

   EXPLOSION_NORMAL("EXPLOSION_NORMAL", 0, "explode", 0, true),
   EXPLOSION_LARGE("EXPLOSION_LARGE", 1, "largeexplode", 1, true),
   EXPLOSION_HUGE("EXPLOSION_HUGE", 2, "hugeexplosion", 2, true),
   FIREWORKS_SPARK("FIREWORKS_SPARK", 3, "fireworksSpark", 3, false),
   WATER_BUBBLE("WATER_BUBBLE", 4, "bubble", 4, false),
   WATER_SPLASH("WATER_SPLASH", 5, "splash", 5, false),
   WATER_WAKE("WATER_WAKE", 6, "wake", 6, false),
   SUSPENDED("SUSPENDED", 7, "suspended", 7, false),
   SUSPENDED_DEPTH("SUSPENDED_DEPTH", 8, "depthsuspend", 8, false),
   CRIT("CRIT", 9, "crit", 9, false),
   CRIT_MAGIC("CRIT_MAGIC", 10, "magicCrit", 10, false),
   SMOKE_NORMAL("SMOKE_NORMAL", 11, "smoke", 11, false),
   SMOKE_LARGE("SMOKE_LARGE", 12, "largesmoke", 12, false),
   SPELL("SPELL", 13, "spell", 13, false),
   SPELL_INSTANT("SPELL_INSTANT", 14, "instantSpell", 14, false),
   SPELL_MOB("SPELL_MOB", 15, "mobSpell", 15, false),
   SPELL_MOB_AMBIENT("SPELL_MOB_AMBIENT", 16, "mobSpellAmbient", 16, false),
   SPELL_WITCH("SPELL_WITCH", 17, "witchMagic", 17, false),
   DRIP_WATER("DRIP_WATER", 18, "dripWater", 18, false),
   DRIP_LAVA("DRIP_LAVA", 19, "dripLava", 19, false),
   VILLAGER_ANGRY("VILLAGER_ANGRY", 20, "angryVillager", 20, false),
   VILLAGER_HAPPY("VILLAGER_HAPPY", 21, "happyVillager", 21, false),
   TOWN_AURA("TOWN_AURA", 22, "townaura", 22, false),
   NOTE("NOTE", 23, "note", 23, false),
   PORTAL("PORTAL", 24, "portal", 24, false),
   ENCHANTMENT_TABLE("ENCHANTMENT_TABLE", 25, "enchantmenttable", 25, false),
   FLAME("FLAME", 26, "flame", 26, false),
   LAVA("LAVA", 27, "lava", 27, false),
   FOOTSTEP("FOOTSTEP", 28, "footstep", 28, false),
   CLOUD("CLOUD", 29, "cloud", 29, false),
   REDSTONE("REDSTONE", 30, "reddust", 30, false),
   SNOWBALL("SNOWBALL", 31, "snowballpoof", 31, false),
   SNOW_SHOVEL("SNOW_SHOVEL", 32, "snowshovel", 32, false),
   SLIME("SLIME", 33, "slime", 33, false),
   HEART("HEART", 34, "heart", 34, false),
   BARRIER("BARRIER", 35, "barrier", 35, false),
   ITEM_CRACK("ITEM_CRACK", 36, "iconcrack_", 36, false, 2),
   BLOCK_CRACK("BLOCK_CRACK", 37, "blockcrack_", 37, false, 1),
   BLOCK_DUST("BLOCK_DUST", 38, "blockdust_", 38, false, 1),
   WATER_DROP("WATER_DROP", 39, "droplet", 39, false),
   ITEM_TAKE("ITEM_TAKE", 40, "take", 40, false),
   MOB_APPEARANCE("MOB_APPEARANCE", 41, "mobappearance", 41, true),
   DRAGON_BREATH("DRAGON_BREATH", 42, "dragonbreath", 42, false),
   END_ROD("END_ROD", 43, "endRod", 43, false);
   private final String S;
   private final int T;
   private final boolean U;
   private final int V;
   private static final Map W = Maps.newHashMap();
   private static final String[] X;
   // $FF: synthetic field
   private static final Particle[] Y = new Particle[]{EXPLOSION_NORMAL, EXPLOSION_LARGE, EXPLOSION_HUGE, FIREWORKS_SPARK, WATER_BUBBLE, WATER_SPLASH, WATER_WAKE, SUSPENDED, SUSPENDED_DEPTH, CRIT, CRIT_MAGIC, SMOKE_NORMAL, SMOKE_LARGE, SPELL, SPELL_INSTANT, SPELL_MOB, SPELL_MOB_AMBIENT, SPELL_WITCH, DRIP_WATER, DRIP_LAVA, VILLAGER_ANGRY, VILLAGER_HAPPY, TOWN_AURA, NOTE, PORTAL, ENCHANTMENT_TABLE, FLAME, LAVA, FOOTSTEP, CLOUD, REDSTONE, SNOWBALL, SNOW_SHOVEL, SLIME, HEART, BARRIER, ITEM_CRACK, BLOCK_CRACK, BLOCK_DUST, WATER_DROP, ITEM_TAKE, MOB_APPEARANCE, DRAGON_BREATH, END_ROD};


   private Particle(String arg_0, int arg_1, String arg_2, int arg_3, boolean arg_4, int arg_5) {
      this.S = arg_2;
      this.T = arg_3;
      this.U = arg_4;
      this.V = arg_5;
   }

   private Particle(String arg_0, int arg_1, String arg_2, int arg_3, boolean arg_4) {
      this(arg_0, arg_1, arg_2, arg_3, arg_4, 0);
   }

   public static String[] a() {
      return X;
   }

   public String b() {
      return this.S;
   }

   public int c() {
      return this.T;
   }

   public int d() {
      return this.V;
   }

   public boolean e() {
      return this.U;
   }

   public boolean f() {
      return this.V > 0;
   }

   public static Particle a(int arg_0) {
      return (Particle)W.get(Integer.valueOf(arg_0));
   }

   static {
      ArrayList var0 = Lists.newArrayList();
      Particle[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Particle var4 = var1[var3];
         W.put(Integer.valueOf(var4.c()), var4);
         if(!var4.b().endsWith("_")) {
            var0.add(var4.b());
         }
      }

      X = (String[])var0.toArray(new String[var0.size()]);
   }
}
