class PacketClientbound24 {
    public void read(Buffer buffer)
    {
        int i = buffer.readInt();
        short word0 = buffer.readShort();
        int j = buffer.readInt();
        a = new ct(i, word0, j);
        b = buffer.readUnsignedByte();
        c = buffer.readUnsignedByte();
        d = aje.e(buffer.readVarInt() & 0xfff);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a.a());
        buffer.writeShort(a.b());
        buffer.writeInt(a.b());
        buffer.writeByte(b);
        buffer.writeByte(c);
        buffer.writeVarInt(aje.b(d) & 0xfff);
    }
}