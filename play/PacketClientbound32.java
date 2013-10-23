class PacketClientbound32 {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
        b = buffer.readShort();
        c = buffer.readSlot();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b);
        buffer.writeSlot(c);
    }
}