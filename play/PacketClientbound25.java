class PacketClientbound25 {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        b = buffer.readPosition();
        c = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writePosition(b);
        buffer.writeByte(c);
    }
}