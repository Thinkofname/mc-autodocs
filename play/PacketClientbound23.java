class PacketClientbound23 {
    public void read(Buffer buffer)
    {
        int i = buffer.readInt();
        short word0 = buffer.readUnsignedByte();
        int j = buffer.readInt();
        a = new ct(i, word0, j);
        b = ajc.e(buffer.readVarInt());
        c = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a.a());
        buffer.writeByte(a.b());
        buffer.writeInt(a.c());
        buffer.writeVarInt(ajc.b(b));
        buffer.writeByte(c);
    }
}