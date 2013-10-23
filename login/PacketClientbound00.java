class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        a = fb.a(buffer.readString(32767));
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(fb.a(a));
    }
}