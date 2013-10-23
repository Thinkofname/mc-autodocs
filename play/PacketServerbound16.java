class PacketServerbound16 {
    public void read(Buffer buffer)
    {
        a = ie.a()[buffer.readByte() % ie.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(ie.a(a));
    }
}