class PacketServerbound07 {
    public void read(Buffer buffer)
    {
        c = buffer.readUnsignedByte();
        int i = buffer.readInt();
        short word0 = buffer.readUnsignedByte();
        int j = buffer.readInt();
        a = new ct(i, word0, j);
        b = db.a(buffer.readUnsignedByte());
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(c);
        buffer.writeInt(a.a());
        buffer.writeByte(a.b());
        buffer.writeInt(a.c());
        buffer.writeByte(b.a());
    }
}