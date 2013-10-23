class PacketServerbound0F {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
        b = buffer.readShort();
        c = buffer.readByte() != 0;
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b);
        buffer.writeByte(c ? 1 : 0);
    }
}