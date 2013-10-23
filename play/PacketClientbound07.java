class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = pp.a(buffer.readUnsignedByte());
        c = afv.a(buffer.readUnsignedByte());
        d = afx.a(buffer.readString(16));
        if(d == null)
            d = afx.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(c.a());
        buffer.writeString(d.a());
    }
}