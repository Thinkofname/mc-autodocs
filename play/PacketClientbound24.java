class PacketClientbound24 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readShort();
        c = buffer.readInt();
        d = buffer.readUnsignedByte();
        e = buffer.readUnsignedByte();
        f = ahu.e(buffer.readVarInt() & 0xfff);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeShort(b);
        buffer.writeInt(c);
        buffer.writeByte(d);
        buffer.writeByte(e);
        buffer.writeVarInt(ahu.b(f) & 0xfff);
    }
}