import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends fr {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(kd.class, new ke()).registerTypeAdapter(ka.class, new kb()).registerTypeAdapter(jz.class, new kc()).registerTypeHierarchyAdapter(fh.class, new fi()).registerTypeHierarchyAdapter(fl.class, new fn()).registerTypeAdapterFactory(new qb()).create();
   private jz b;


   public PacketClientbound00() {}

   public PacketClientbound00(jz var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (jz)a.fromJson(var1.readString(32767), jz.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(jw var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
