class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = qh.a(buffer.readUnsignedByte());
        c = ahd.a(buffer.readUnsignedByte());
        d = ahf.a(buffer.readString(16));
        if(d == null)
            d = ahf.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(c.a());
        buffer.writeString(d.a());
    }
}