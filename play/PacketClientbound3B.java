class PacketClientbound3B {
    public void read(Buffer buffer)
    {
        a = buffer.readString(16);
        b = buffer.readByte() != 0;
        c = buffer.readShort();
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeByte(b ? 1 : 0);
        buffer.writeShort(c);
    }
}