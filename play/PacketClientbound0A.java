class PacketClientbound0A {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readPosition();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writePosition(b);
    }
}