package net.minecraft.network;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.network.Packet;
import net.minecraft.network.ProtocolDirection;
import net.minecraft.network.ProtocolHandshaking;
import org.apache.logging.log4j.LogManager;

public enum Protocols {

   a("HANDSHAKING", 0, -1),
   b("PLAY", 1, 0),
   c("STATUS", 2, 1),
   d("LOGIN", 3, 2);
   private static final TIntObjectMap e = new TIntObjectHashMap();
   private static final Map f = Maps.newHashMap();
   private final int g;
   private final Map h;
   // $FF: synthetic field
   private static final Protocols[] i = new Protocols[]{a, b, c, d};


   private Protocols(String arg_0, int arg_1, int arg_2) {
      this.h = Maps.newEnumMap(ProtocolDirection.class);
      this.g = arg_2;
   }

   public Protocols addPacket(ProtocolDirection protocolDir, Class packetClass) {
      Object var3 = (BiMap)this.h.get(protocolDir);
      if(var3 == null) {
         var3 = HashBiMap.create();
         this.h.put(protocolDir, var3);
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
      return (Integer)((BiMap)this.h.get(arg_0)).inverse().get(arg_1.getClass());
   }

   public Packet a(ProtocolDirection arg_0, int arg_1) {
      Class var3 = (Class)((BiMap)this.h.get(arg_0)).get(Integer.valueOf(arg_1));
      return var3 == null?null:(Packet)var3.newInstance();
   }

   public int a() {
      return this.g;
   }

   public static Protocols a(int arg_0) {
      return (Protocols)e.get(arg_0);
   }

   public static Protocols a(Packet arg_0) {
      return (Protocols)f.get(arg_0.getClass());
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
         e.put(var3.a(), var3);
         Iterator var4 = var3.h.keySet().iterator();

         while(var4.hasNext()) {
            ProtocolDirection var5 = (ProtocolDirection)var4.next();

            Class var7;
            for(Iterator var6 = ((BiMap)var3.h.get(var5)).values().iterator(); var6.hasNext(); f.put(var7, var3)) {
               var7 = (Class)var6.next();
               if(f.containsKey(var7) && f.get(var7) != var3) {
                  throw new Error("Packet " + var7 + " is already assigned to protocol " + f.get(var7) + " - can\'t reassign to " + var3);
               }

               try {
                  var7.newInstance();
               } catch (Throwable var9) {
                  throw new Error("Packet " + var7 + " fails instantiation checks! " + var7);
               }
            }
         }
      }

   }
}
