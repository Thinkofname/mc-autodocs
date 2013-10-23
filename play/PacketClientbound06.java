class PacketClientbound06 {
    public void read(Buffer buffer)
    {
        a = buffer.readFloat();
        b = buffer.readShort();
        c = buffer.readFloat();
    }
    public void write(Buffer buffer)
    {
        buffer.writeFloat(a);
        buffer.writeShort(b);
        buffer.writeFloat(c);
    }
}