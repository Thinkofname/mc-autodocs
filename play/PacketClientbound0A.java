class PacketClientbound0A {
    public void read(Buffer buffer)
    {
        e = buffer.readFloat();
        f = buffer.readFloat();
        super.a(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeFloat(e);
        buffer.writeFloat(f);
        super.b(buffer);
    }
}