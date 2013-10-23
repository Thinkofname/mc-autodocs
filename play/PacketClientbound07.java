class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = pk.a(buffer.readByte());
        d = afq.a(buffer.readByte());
        c = buffer.readShort();
        String s = buffer.readString(16);
        e = afs.a(s);
        if(e == null)
            e = afs.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(d.a());
        buffer.writeShort(c);
        buffer.writeString(e.a());
    }
}