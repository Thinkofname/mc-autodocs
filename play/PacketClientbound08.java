class PacketClientbound08 {
    public void read(Buffer buffer)
    {
        a = buffer.readDouble();
        b = buffer.readDouble();
        c = buffer.readDouble();
        d = buffer.readFloat();
        e = buffer.readFloat();
        f = gb.a(buffer.readUnsignedByte());
    }
    public void write(Buffer buffer)
    {
        buffer.writeDouble(a);
        buffer.writeDouble(b);
        buffer.writeDouble(c);
        buffer.writeFloat(d);
        buffer.writeFloat(e);
        buffer.writeByte(gb.a(f));
    }
}