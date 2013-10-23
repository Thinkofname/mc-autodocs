class PacketClientbound0B {
    public void read(Buffer buffer)
    {
        a = buffer.readDouble();
        b = buffer.readDouble();
        d = buffer.readDouble();
        c = buffer.readDouble();
        e = buffer.readFloat();
        f = buffer.readFloat();
        super.a(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeDouble(a);
        buffer.writeDouble(b);
        buffer.writeDouble(d);
        buffer.writeDouble(c);
        buffer.writeFloat(e);
        buffer.writeFloat(f);
        super.b(buffer);
    }
}