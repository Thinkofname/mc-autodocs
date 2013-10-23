class PacketClientbound1D {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readByte();
        c = buffer.readByte();
        d = buffer.readShort();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b);
        buffer.writeByte(c);
        buffer.writeShort(d);
    }
}