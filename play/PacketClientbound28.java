class PacketClientbound28 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
        e = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
        buffer.writeByte(e);
    }
}