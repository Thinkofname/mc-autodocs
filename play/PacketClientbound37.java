class PacketClientbound37 {
    public void read(Buffer buffer)
    {
        a = buffer.readShort();
        b = buffer.readShort();
        c = new byte[buffer.readUnsignedShort()];
        buffer.readBytes(c);
    }
    public void write(Buffer buffer)
    {
        buffer.writeShort(a);
        buffer.writeShort(b);
        buffer.writeShort(c.length);
        buffer.writeBytes(c);
    }
}