class PacketClientbound10 {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        f = buffer.readString(rs.A);
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
        e = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeString(f);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
        buffer.writeInt(e);
    }
}