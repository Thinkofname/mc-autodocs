class PacketServerbound16 {
    public void read(Buffer buffer)
    {
        a = ja.a()[buffer.readByte() % ja.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(ja.a(a));
    }
}