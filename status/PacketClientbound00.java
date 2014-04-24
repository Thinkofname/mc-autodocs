import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gu {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(lo.class, new lp()).registerTypeAdapter(ll.class, new lm()).registerTypeAdapter(lk.class, new ln()).registerTypeHierarchyAdapter(gj.class, new gk()).registerTypeHierarchyAdapter(go.class, new gq()).registerTypeAdapterFactory(new rq()).create();
   private lk b;


   public PacketClientbound00() {}

   public PacketClientbound00(lk var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (lk)a.fromJson(var1.readString(32767), lk.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(lh var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
