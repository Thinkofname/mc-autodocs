class PacketServerbound09 {
    public void read(Buffer buffer)
    {
        a = buffer.readShort();
    }
    public void write(Buffer buffer)
    {
        buffer.writeShort(a);
    }
}