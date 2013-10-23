class PacketClientbound0C {
    public void read(Buffer buffer)
    {
        a = buffer.readShort();
    }
    public void write(Buffer buffer)
    {
        buffer.writeShort(a);
    }
}