class PacketClientbound2A {
    public void read(Buffer buffer)
    {
        a = buffer.readString(64);
        b = buffer.readFloat();
        c = buffer.readFloat();
        d = buffer.readFloat();
        e = buffer.readFloat();
        f = buffer.readFloat();
        g = buffer.readFloat();
        h = buffer.readFloat();
        i = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeFloat(b);
        buffer.writeFloat(c);
        buffer.writeFloat(d);
        buffer.writeFloat(e);
        buffer.writeFloat(f);
        buffer.writeFloat(g);
        buffer.writeFloat(h);
        buffer.writeInt(i);
    }
}