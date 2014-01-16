import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends ga {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(ko.class, new kp()).registerTypeAdapter(kl.class, new km()).registerTypeAdapter(kk.class, new kn()).registerTypeHierarchyAdapter(fq.class, new fr()).registerTypeHierarchyAdapter(fu.class, new fw()).registerTypeAdapterFactory(new pn()).create();
   private kk b;


   public PacketClientbound00() {}

   public PacketClientbound00(kk var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (kk)a.fromJson(var1.readString(32767), kk.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(kh var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
