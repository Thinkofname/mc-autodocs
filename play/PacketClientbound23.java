class PacketClientbound23 {
    public void read(Buffer buffer)
    {
        a = buffer.readPosition();
        b = aji.e(buffer.readVarInt());
        c = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writePosition(a);
        buffer.writeVarInt(aji.b(b));
        buffer.writeByte(c);
    }
}