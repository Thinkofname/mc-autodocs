class PacketClientbound09 {
    public void read(Buffer buffer)
    {
        a = buffer.readDouble();
        b = buffer.readDouble();
        d = buffer.readDouble();
        c = buffer.readDouble();
        super.a(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeDouble(a);
        buffer.writeDouble(b);
        buffer.writeDouble(d);
        buffer.writeDouble(c);
        super.b(buffer);
    }
}