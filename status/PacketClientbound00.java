import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 extends gx {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(lx.class, new ly()).registerTypeAdapter(lu.class, new lv()).registerTypeAdapter(lt.class, new lw()).registerTypeHierarchyAdapter(gl.class, new gm()).registerTypeHierarchyAdapter(gr.class, new gt()).registerTypeAdapterFactory(new rz()).create();
   private lt b;


   public PacketClientbound00() {}

   public PacketClientbound00(lt var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (lt)a.fromJson(var1.readString(32767), lt.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(lq var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

}
