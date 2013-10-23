class PacketClientbound2F {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        e = buffer.readByte();
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(e);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
    }
}