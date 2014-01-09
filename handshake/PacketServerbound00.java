class PacketServerbound00 {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        b = buffer.readString(255);
        c = buffer.readUnsignedShort();
        d = ey.a(buffer.readVarInt());
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeString(b);
        buffer.writeShort(c);
        buffer.writeVarInt(d.c());
    }
}