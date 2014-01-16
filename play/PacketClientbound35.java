class PacketClientbound35 {
    public void read(Buffer buffer)
    {
        a = buffer.readPosition();
        b = buffer.readUnsignedByte();
        c = buffer.readNBT();
    }
    public void write(Buffer buffer)
    {
        buffer.writePosition(a);
        buffer.writeByte((byte)b);
        buffer.writeNBT(c);
    }
}