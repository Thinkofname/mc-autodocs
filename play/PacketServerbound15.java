class PacketServerbound15 {
    public void read(Buffer buffer)
    {
        a = buffer.readString(7);
        b = buffer.readByte();
        c = xr.a(buffer.readByte());
        d = buffer.readBoolean();
        e = pu.a(buffer.readByte());
        f = buffer.readBoolean();
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeByte(b);
        buffer.writeByte(c.a());
        buffer.writeBoolean(d);
        buffer.writeByte(e.a());
        buffer.writeBoolean(f);
    }
}