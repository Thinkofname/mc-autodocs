class PacketClientbound0A {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        int i = buffer.readInt();
        byte byte0 = buffer.readByte();
        int j = buffer.readInt();
        b = new ct(i, byte0, j);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.a());
        buffer.writeByte(b.b());
        buffer.writeInt(b.c());
    }
}