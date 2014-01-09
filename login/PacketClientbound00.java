class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        a = fp.a(buffer.readString(32767));
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(fp.a(a));
    }
}