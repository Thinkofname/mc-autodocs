class PacketServerbound0B {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readByte();
        c = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b);
        buffer.writeInt(c);
    }
}