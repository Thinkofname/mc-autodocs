class PacketClientbound19 {
    public void read(Buffer buffer)
    {
        super.a(buffer);
        e = buffer.readByte();
        f = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        super.b(buffer);
        buffer.writeByte(e);
        buffer.writeByte(f);
    }
}