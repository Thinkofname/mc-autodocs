class PacketServerbound15 {
    public void read(Buffer buffer)
    {
        a = buffer.readString(7);
        b = buffer.readByte();
        c = yx.a(buffer.readByte());
        d = buffer.readBoolean();
        e = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeByte(b);
        buffer.writeByte(c.a());
        buffer.writeBoolean(d);
        buffer.writeByte(e);
    }
}