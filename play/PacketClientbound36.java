class PacketClientbound36 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readShort();
        c = buffer.readInt();
        d = new String[4];
        for(int i = 0; i < 4; i++)
            d[i] = buffer.readString(15);

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeShort(b);
        buffer.writeInt(c);
        for(int i = 0; i < 4; i++)
            buffer.writeString(d[i]);

    }
}