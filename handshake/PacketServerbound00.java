class PacketServerbound00 {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        b = buffer.readString(255);
        c = buffer.readVarInt();
        d = ee.a(buffer.readVarInt());
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeString(b);
        buffer.writeVarInt(c);
        buffer.writeVarInt(d.c());
    }
}