class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        a = ez.a(buffer.readString(32767));
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(ez.a(a));
    }
}