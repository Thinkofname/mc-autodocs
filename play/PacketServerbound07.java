class PacketServerbound07 {
    public void read(Buffer buffer)
    {
        e = buffer.readUnsignedByte();
        a = buffer.readInt();
        b = buffer.readUnsignedByte();
        c = buffer.readInt();
        d = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(e);
        buffer.writeInt(a);
        buffer.writeByte(b);
        buffer.writeInt(c);
        buffer.writeByte(d);
    }
}