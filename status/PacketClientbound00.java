import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends fq {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(kc.class, new kd()).registerTypeAdapter(jz.class, new ka()).registerTypeAdapter(jy.class, new kb()).registerTypeHierarchyAdapter(fg.class, new fh()).registerTypeHierarchyAdapter(fk.class, new fm()).registerTypeAdapterFactory(new pc()).create();
   private jy b;


   public PacketClientbound00() {}

   public PacketClientbound00(jy var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (jy)a.fromJson(var1.readString(32767), jy.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(jv var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
