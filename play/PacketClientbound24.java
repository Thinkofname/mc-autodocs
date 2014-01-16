class PacketClientbound24 {
    public void read(Buffer buffer)
    {
        a = buffer.readPosition();
        b = buffer.readUnsignedByte();
        c = buffer.readUnsignedByte();
        d = aji.e(buffer.readVarInt() & 0xfff);
    }
    public void write(Buffer buffer)
    {
        buffer.writePosition(a);
        buffer.writeByte(b);
        buffer.writeByte(c);
        buffer.writeVarInt(aji.b(d) & 0xfff);
    }
}