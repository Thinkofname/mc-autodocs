class PacketClientbound28 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        int i = buffer.readInt();
        int j = buffer.readByte() & 0xff;
        int k = buffer.readInt();
        b = new ct(i, j, k);
        c = buffer.readInt();
        d = buffer.readBoolean();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.a());
        buffer.writeByte(b.b() & 0xff);
        buffer.writeInt(b.c());
        buffer.writeInt(c);
        buffer.writeBoolean(d);
    }
}