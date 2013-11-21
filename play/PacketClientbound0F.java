class PacketClientbound0F {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        b = buffer.readByte() & 0xff;
        c = buffer.readInt();
        d = buffer.readInt();
        e = buffer.readInt();
        i = buffer.readByte();
        j = buffer.readByte();
        k = buffer.readByte();
        f = buffer.readShort();
        g = buffer.readShort();
        h = buffer.readShort();
        m = rt.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeByte(b & 0xff);
        buffer.writeInt(c);
        buffer.writeInt(d);
        buffer.writeInt(e);
        buffer.writeByte(i);
        buffer.writeByte(j);
        buffer.writeByte(k);
        buffer.writeShort(f);
        buffer.writeShort(g);
        buffer.writeShort(h);
        l.a(buffer);
    }
}