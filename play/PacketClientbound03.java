class PacketClientbound03 {
    public void read(Buffer buffer)
    {
        a = buffer.readLong();
        b = buffer.readLong();
    }
    public void write(Buffer buffer)
    {
        buffer.writeLong(a);
        buffer.writeLong(b);
    }
}