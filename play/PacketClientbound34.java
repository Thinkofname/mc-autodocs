class PacketClientbound34 {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        b = new byte[buffer.readUnsignedShort()];
        buffer.readBytes(b);
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeShort(b.length);
        buffer.writeBytes(b);
    }
}