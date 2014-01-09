class PacketClientbound05 {
    public void read(Buffer buffer)
    {
        int i = buffer.readInt();
        int j = buffer.readInt();
        int k = buffer.readInt();
        a = new ct(i, j, k);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a.a());
        buffer.writeInt(a.b());
        buffer.writeInt(a.c());
    }
}