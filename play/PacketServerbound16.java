class PacketServerbound16 {
    public void read(Buffer buffer)
    {
        a = ik.a()[buffer.readByte() % ik.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(ik.a(a));
    }
}