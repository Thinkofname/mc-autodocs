class PacketClientbound02 {
    public void read(Buffer buffer)
    {
        a = buffer.readString(32767);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
    }
}