class PacketClientbound2E {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
    }
}