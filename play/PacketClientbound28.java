class PacketClientbound28 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readByte() & 0xff;
        e = buffer.readInt();
        b = buffer.readInt();
        f = buffer.readBoolean();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(c);
        buffer.writeByte(d & 0xff);
        buffer.writeInt(e);
        buffer.writeInt(b);
        buffer.writeBoolean(f);
    }
}