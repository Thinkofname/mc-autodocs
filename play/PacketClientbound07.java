class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = pu.a(buffer.readUnsignedByte());
        c = agb.a(buffer.readUnsignedByte());
        d = agd.a(buffer.readString(16));
        if(d == null)
            d = agd.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(c.a());
        buffer.writeString(d.a());
    }
}