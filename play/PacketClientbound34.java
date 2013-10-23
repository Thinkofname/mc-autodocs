class PacketClientbound34 {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
        b = buffer.readShort();
        c = buffer.readShort();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b);
        buffer.writeShort(c);
    }
}