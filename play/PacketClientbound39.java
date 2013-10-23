class PacketClientbound39 {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
    }
}