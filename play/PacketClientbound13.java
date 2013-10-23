class PacketClientbound13 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        f = buffer.readString(ri.A);
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
        e = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeString(f);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
        buffer.writeInt(e);
    }
}