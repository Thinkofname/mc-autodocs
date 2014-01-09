class PacketClientbound33 {
    public void read(Buffer buffer)
    {
        int i = buffer.readInt();
        short word0 = buffer.readShort();
        int j = buffer.readInt();
        a = new ct(i, word0, j);
        b = new String[4];
        for(int k = 0; k < 4; k++)
            b[k] = buffer.readString(15);

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a.a());
        buffer.writeShort(a.b());
        buffer.writeInt(a.c());
        for(int i = 0; i < 4; i++)
            buffer.writeString(b[i]);

    }
}