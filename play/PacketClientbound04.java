class PacketClientbound04 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readShort();
        c = buffer.readSlot();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeShort(b);
        buffer.writeSlot(c);
    }
}