class PacketServerbound0D {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
    }
}