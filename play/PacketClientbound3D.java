class PacketClientbound3D {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
        b = buffer.readString(16);
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeString(b);
    }
}