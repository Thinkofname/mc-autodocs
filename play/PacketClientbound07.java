class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = pt.a(buffer.readUnsignedByte());
        c = afz.a(buffer.readUnsignedByte());
        d = agb.a(buffer.readString(16));
        if(d == null)
            d = agb.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(c.a());
        buffer.writeString(d.a());
    }
}