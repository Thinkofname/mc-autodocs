class PacketClientbound17 {
    public void read(Buffer buffer)
    {
        super.a(buffer);
        b = buffer.readByte();
        c = buffer.readByte();
        d = buffer.readByte();
        e = buffer.readByte();
        f = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        super.b(buffer);
        buffer.writeByte(b);
        buffer.writeByte(c);
        buffer.writeByte(d);
        buffer.writeByte(e);
        buffer.writeByte(f);
    }
}