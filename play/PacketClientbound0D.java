class PacketClientbound0D {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        e = buffer.readByte();
        b = buffer.readInt();
        c = buffer.readByte();
        d = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(e);
        buffer.writeInt(b);
        buffer.writeByte(c);
        buffer.writeInt(d);
    }
}