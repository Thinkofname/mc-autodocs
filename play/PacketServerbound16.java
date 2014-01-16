class PacketServerbound16 {
    public void read(Buffer buffer)
    {
        a = jb.a()[buffer.readByte() % jb.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(jb.a(a));
    }
}