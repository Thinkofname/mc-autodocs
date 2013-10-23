class PacketClientbound3F {
    public void read(Buffer buffer)
    {
        a = buffer.readString(20);
        b = new byte[buffer.readUnsignedShort()];
        buffer.readBytes(b);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeShort(b.length);
        buffer.writeBytes(b);
    }
}