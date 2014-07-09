import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 implements hz {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(nk.class, new nl()).registerTypeAdapter(nh.class, new ni()).registerTypeAdapter(ng.class, new nj()).registerTypeHierarchyAdapter(hk.class, new hl()).registerTypeHierarchyAdapter(hr.class, new ht()).registerTypeAdapterFactory(new uc()).create();
   private ng b;


   public PacketClientbound00() {}

   public PacketClientbound00(ng var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (ng)a.fromJson(var1.readString(32767), ng.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(nd var1) {
      var1.a(this);
   }

}
