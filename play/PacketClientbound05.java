class PacketClientbound05 {
    public void read(Buffer buffer)
    {
        a = buffer.readPosition();
    }
    public void write(Buffer buffer)
    {
        buffer.writePosition(a);
    }
}