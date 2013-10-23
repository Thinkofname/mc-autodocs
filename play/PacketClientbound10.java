class PacketClientbound10 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b);
    }
}