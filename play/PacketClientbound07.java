class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = pq.a(buffer.readUnsignedByte());
        c = afw.a(buffer.readUnsignedByte());
        d = afy.a(buffer.readString(16));
        if(d == null)
            d = afy.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(c.a());
        buffer.writeString(d.a());
    }
}