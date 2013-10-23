class PacketClientbound0A {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readInt();
        c = buffer.readByte();
        d = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b);
        buffer.writeByte(c);
        buffer.writeInt(d);
    }
}