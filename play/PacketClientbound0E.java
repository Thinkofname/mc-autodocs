class PacketClientbound0E {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b);
    }
}