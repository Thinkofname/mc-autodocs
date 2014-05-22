import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PacketClientbound00 implements gx {

   private static final Gson a = (new GsonBuilder()).registerTypeAdapter(ma.class, new mb()).registerTypeAdapter(lx.class, new ly()).registerTypeAdapter(lw.class, new lz()).registerTypeHierarchyAdapter(gl.class, new gm()).registerTypeHierarchyAdapter(gr.class, new gt()).registerTypeAdapterFactory(new sb()).create();
   private lw b;


   public PacketClientbound00() {}

   public PacketClientbound00(lw var1) {
      this.b = var1;
   }

   public void read(PacketBuffer var1) {
      this.b = (lw)a.fromJson(var1.readString(32767), lw.class);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(a.toJson(this.b));
   }

   public void a(lt var1) {
      var1.a(this);
   }

}
