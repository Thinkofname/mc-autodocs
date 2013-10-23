class PacketClientbound2C {
    public void read(Buffer buffer)
    {
        a = buffer.readString(256);
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
        e = buffer.readFloat();
        f = buffer.readUnsignedByte();
        g = afy.a(buffer.readUnsignedByte());
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
        buffer.writeFloat(e);
        buffer.writeByte(f);
        buffer.writeByte(g.b());
    }
}