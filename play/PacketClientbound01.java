class PacketClientbound01 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        String s = buffer.readString(16);
        b = afs.a(s);
        if(b == null)
            b = afs.b;
        int i = buffer.readByte();
        c = (i & 8) == 8;
        i &= -9;
        d = afq.a(i);
        e = buffer.readByte();
        f = pk.a(buffer.readUnsignedByte());
        g = buffer.readByte();
        h = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeString(b != null ? b.a() : "");
        int i = d.a();
        if(c)
            i |= 8;
        buffer.writeByte(i);
        buffer.writeByte(e);
        buffer.writeByte(f.a());
        buffer.writeByte(g);
        buffer.writeByte(h);
    }
}