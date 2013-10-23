class PacketClientbound08 {
    public void read(Buffer buffer)
    {
        g = buffer.readUnsignedByte() != 0;
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(g ? 1 : 0);
    }
}