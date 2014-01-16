class PacketServerbound00 {
    public void read(Buffer buffer)
    {
        a = buffer.writeVarInt();
        b = buffer.readString(255);
        c = buffer.readUnsignedShort();
        d = ez.a(buffer.writeVarInt());
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeString(b);
        buffer.writeShort(c);
        buffer.writeVarInt(d.c());
    }
}