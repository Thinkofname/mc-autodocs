class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = pn.a(buffer.readUnsignedByte());
        c = aft.a(buffer.readUnsignedByte());
        d = afv.a(buffer.readString(16));
        if(d == null)
            d = afv.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(c.a());
        buffer.writeString(d.a());
    }
}