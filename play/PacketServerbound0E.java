class PacketServerbound0E {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
        b = buffer.readShort();
        c = buffer.readByte();
        d = buffer.readShort();
        f = buffer.readByte();
        e = buffer.readSlot();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b);
        buffer.writeByte(c);
        buffer.writeShort(d);
        buffer.writeByte(f);
        buffer.writeSlot(e);
    }
}