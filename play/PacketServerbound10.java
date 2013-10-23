class PacketServerbound10 {
    public void read(Buffer buffer)
    {
        a = buffer.readShort();
        b = buffer.readSlot();
    }
    public void write(Buffer buffer)
    {
        buffer.writeShort(a);
        buffer.writeSlot(b);
    }
}