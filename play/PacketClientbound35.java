class PacketClientbound35 {
    public void read(Buffer buffer)
    {
        int i = buffer.readInt();
        short word0 = buffer.readShort();
        int j = buffer.readInt();
        a = new ct(i, word0, j);
        b = buffer.readUnsignedByte();
        c = buffer.readNBT();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a.a());
        buffer.writeShort(a.b());
        buffer.writeInt(a.c());
        buffer.writeByte((byte)b);
        buffer.writeNBT(c);
    }
}