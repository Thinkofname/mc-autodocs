class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = qi.a(buffer.readUnsignedByte());
        c = ahj.a(buffer.readUnsignedByte());
        d = ahl.a(buffer.readString(16));
        if(d == null)
            d = ahl.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(c.a());
        buffer.writeString(d.a());
    }
}