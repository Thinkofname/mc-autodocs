class PacketClientbound3B {
    public void read(Buffer buffer)
    {
        a = buffer.readString(16);
        b = buffer.readString(32);
        c = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeString(b);
        buffer.writeByte(c);
    }
}