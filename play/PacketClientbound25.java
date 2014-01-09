class PacketClientbound25 {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        int i = buffer.readInt();
        int j = buffer.readInt();
        int k = buffer.readInt();
        b = new ct(i, j, k);
        c = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeInt(b.a());
        buffer.writeInt(b.b());
        buffer.writeInt(b.c());
        buffer.writeByte(c);
    }
}