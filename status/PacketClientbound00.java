import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 implements hb {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(mf.class, new mg()).registerTypeAdapter(mc.class, new md()).registerTypeAdapter(mb.class, new me()).registerTypeHierarchyAdapter(go.class, new gp()).registerTypeHierarchyAdapter(gv.class, new gx()).registerTypeAdapterFactory(new sg()).create();
   private mb b;


   public PacketClientbound00() {}

   public PacketClientbound00(mb var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (mb)a.fromJson(var1.readString(32767), mb.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(ly var1) {
      var1.a(this);
   }

}
