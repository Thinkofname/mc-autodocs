class PacketClientbound09 {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
    }
}