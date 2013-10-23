class PacketServerbound16 {
    public void read(Buffer buffer)
    {
        a = ii.a()[buffer.readByte() % ii.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(ii.a(a));
    }
}