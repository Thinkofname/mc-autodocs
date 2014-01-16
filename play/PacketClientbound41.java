class PacketClientbound41 {
    public void read(Buffer buffer)
    {
        a = qi.a(buffer.readUnsignedByte());
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a.a());
    }
}