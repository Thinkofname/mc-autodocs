class PacketClientbound31 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
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