class PacketServerbound16 {
    public void read(Buffer buffer)
    {
        a = ig.a()[buffer.readByte() % ig.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(ig.a(a));
    }
}