import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PacketClientbound37 extends ga {

   private Map a;


   public PacketClientbound37() {}

   public PacketClientbound37(Map var1) {
      this.a = var1;
   }

   public void a(gd var1) {
      var1.a(this);
   }

   public void read(PacketBuffer var1) {
      int var2 = var1.readVarInt();
      this.a = Maps.newHashMap();

      for(int var3 = 0; var3 < var2; ++var3) {
         op var4 = ox.a(var1.readString(32767));
         int var5 = var1.readVarInt();
         if(var4 != null) {
            this.a.put(var4, Integer.valueOf(var5));
         }
      }

   }

   public void write(PacketBuffer var1) {
      var1.writeVarInt(this.a.size());
      Iterator var2 = this.a.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.writeString(((op)var3.getKey()).e);
         var1.writeVarInt(((Integer)var3.getValue()).intValue());
      }

   }

   public String b() {
      return String.format("count=%d", new Object[]{Integer.valueOf(this.a.size())});
   }
}
