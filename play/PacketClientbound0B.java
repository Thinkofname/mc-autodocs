class PacketClientbound0B {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        b = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeByte(b);
    }
}