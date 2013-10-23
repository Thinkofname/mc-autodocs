class PacketClientbound01 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        int i = buffer.readUnsignedByte();
        b = (i & 8) == 8;
        i &= -9;
        c = afv.a(i);
        d = buffer.readByte();
        e = pp.a(buffer.readUnsignedByte());
        f = buffer.readUnsignedByte();
        g = afx.a(buffer.readString(16));
        if(g == null)
            g = afx.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        int i = c.a();
        if(b)
            i |= 8;
        buffer.writeByte(i);
        buffer.writeByte(d);
        buffer.writeByte(e.a());
        buffer.writeByte(f);
        buffer.writeString(g.a());
    }
}