import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends ft {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(kf.class, new kg()).registerTypeAdapter(kc.class, new kd()).registerTypeAdapter(kb.class, new ke()).registerTypeHierarchyAdapter(fj.class, new fk()).registerTypeHierarchyAdapter(fn.class, new fp()).registerTypeAdapterFactory(new qe()).create();
   private kb b;


   public PacketClientbound00() {}

   public PacketClientbound00(kb var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (kb)a.fromJson(var1.readString(32767), kb.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(jy var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
