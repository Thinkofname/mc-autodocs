class PacketClientbound05 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readInt();
        c = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b);
        buffer.writeInt(c);
    }
}