package net.minecraft.network;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.network.Packet;
import net.minecraft.network.ProtocolDirection;
import net.minecraft.network.ProtocolHandshaking;
import org.apache.logging.log4j.LogManager;

public enum Protocols {

   HANDSHAKING("HANDSHAKING", 0, -1),
   PLAY("PLAY", 1, 0),
   STATUS("STATUS", 2, 1),
   LOGIN("LOGIN", 3, 2);
   private static int e = -1;
   private static int f = 2;
   private static final Protocols[] g = new Protocols[f - e + 1];
   private static final Map h = Maps.newHashMap();
   private final int i;
   private final Map j;
   // $FF: synthetic field
   private static final Protocols[] k = new Protocols[]{HANDSHAKING, PLAY, STATUS, LOGIN};


   private Protocols(String arg_0, int arg_1, int arg_2) {
      this.j = Maps.newEnumMap(ProtocolDirection.class);
      this.i = arg_2;
   }

   public Protocols addPacket(ProtocolDirection protocolDir, Class packetClass) {
      Object var3 = (BiMap)this.j.get(protocolDir);
      if(var3 == null) {
         var3 = HashBiMap.create();
         this.j.put(protocolDir, var3);
      }

      if(((BiMap)var3).containsValue(packetClass)) {
         String var4 = protocolDir + " packet " + packetClass + " is already known to ID " + ((BiMap)var3).inverse().get(packetClass);
         LogManager.getLogger().fatal(var4);
         throw new IllegalArgumentException(var4);
      } else {
         ((BiMap)var3).put(Integer.valueOf(((BiMap)var3).size()), packetClass);
         return this;
      }
   }

   public Integer a(ProtocolDirection arg_0, Packet arg_1) {
      return (Integer)((BiMap)this.j.get(arg_0)).inverse().get(arg_1.getClass());
   }

   public Packet a(ProtocolDirection arg_0, int arg_1) {
      Class var3 = (Class)((BiMap)this.j.get(arg_0)).get(Integer.valueOf(arg_1));
      return var3 == null?null:(Packet)var3.newInstance();
   }

   public int a() {
      return this.i;
   }

   public static Protocols a(int arg_0) {
      return arg_0 >= e && arg_0 <= f?g[arg_0 - e]:null;
   }

   public static Protocols a(Packet arg_0) {
      return (Protocols)h.get(arg_0.getClass());
   }

   // $FF: synthetic method
   public Protocols(String arg_0, int arg_1, int arg_2, ProtocolHandshaking arg_3) {
      this(arg_0, arg_1, arg_2);
   }

   static {
      Protocols[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         Protocols var3 = var0[var2];
         int var4 = var3.a();
         if(var4 < e || var4 > f) {
            throw new Error("Invalid protocol ID " + Integer.toString(var4));
         }

         g[var4 - e] = var3;
         Iterator var5 = var3.j.keySet().iterator();

         while(var5.hasNext()) {
            ProtocolDirection var6 = (ProtocolDirection)var5.next();

            Class var8;
            for(Iterator var7 = ((BiMap)var3.j.get(var6)).values().iterator(); var7.hasNext(); h.put(var8, var3)) {
               var8 = (Class)var7.next();
               if(h.containsKey(var8) && h.get(var8) != var3) {
                  throw new Error("Packet " + var8 + " is already assigned to protocol " + h.get(var8) + " - can\'t reassign to " + var3);
               }

               try {
                  var8.newInstance();
               } catch (Throwable var10) {
                  throw new Error("Packet " + var8 + " fails instantiation checks! " + var8);
               }
            }
         }
      }

   }
}
