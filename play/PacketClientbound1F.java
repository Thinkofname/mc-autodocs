class PacketClientbound1F {
    public void read(Buffer buffer)
    {
        a = buffer.readFloat();
        c = buffer.readShort();
        b = buffer.readShort();
    }
    public void write(Buffer buffer)
    {
        buffer.writeFloat(a);
        buffer.writeShort(c);
        buffer.writeShort(b);
    }
}