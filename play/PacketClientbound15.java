class PacketClientbound15 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readShort();
        c = buffer.readShort();
        d = buffer.readShort();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeShort(b);
        buffer.writeShort(c);
        buffer.writeShort(d);
    }
}