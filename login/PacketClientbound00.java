class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        a = fq.a(buffer.readString(32767));
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(fq.a(a));
    }
}