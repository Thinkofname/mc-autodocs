class PacketServerbound01 {
    public void read(Buffer buffer)
    {
        a = buffer.readLong();
    }
    public void write(Buffer buffer)
    {
        buffer.writeLong(a);
    }
}