class PacketClientbound07 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = po.a(buffer.readUnsignedByte());
        c = afu.a(buffer.readUnsignedByte());
        d = afw.a(buffer.readString(16));
        if(d == null)
            d = afw.b;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b.a());
        buffer.writeByte(c.a());
        buffer.writeString(d.a());
    }
}