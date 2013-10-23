class PacketServerbound16 {
    public void read(Buffer buffer)
    {
        a = ih.a()[buffer.readByte() % ih.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(ih.a(a));
    }
}