class PacketServerbound11 {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
        b = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeByte(b);
    }
}