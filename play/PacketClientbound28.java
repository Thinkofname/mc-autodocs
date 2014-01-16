class PacketClientbound28 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readPosition();
        c = buffer.readInt();
        d = buffer.readBoolean();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writePosition(b);
        buffer.writeInt(c);
        buffer.writeBoolean(d);
    }
}