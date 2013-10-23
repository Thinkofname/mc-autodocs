class PacketClientbound18 {
    public void read(Buffer buffer)
    {
        super.a(buffer);
        b = buffer.readByte();
        c = buffer.readByte();
        d = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        super.b(buffer);
        buffer.writeByte(b);
        buffer.writeByte(c);
        buffer.writeByte(d);
    }
}