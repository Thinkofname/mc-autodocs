import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 implements ib {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(nn.class, new no()).registerTypeAdapter(nk.class, new nl()).registerTypeAdapter(nj.class, new nm()).registerTypeHierarchyAdapter(hm.class, new hn()).registerTypeHierarchyAdapter(ht.class, new hv()).registerTypeAdapterFactory(new ug()).create();
   private nj b;


   public PacketClientbound00() {}

   public PacketClientbound00(nj var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (nj)a.fromJson(var1.readString(32767), nj.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(ng var1) {
      var1.a(this);
   }

}
