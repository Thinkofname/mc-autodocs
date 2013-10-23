class PacketServerbound01 {
    public void read(Buffer buffer)
    {
        a = buffer.readString(100);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
    }
}