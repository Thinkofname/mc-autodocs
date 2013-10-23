class PacketClientbound38 {
    public void read(Buffer buffer)
    {
        a = buffer.readString(16);
        b = buffer.readBoolean();
        c = buffer.readShort();
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeBoolean(b);
        buffer.writeShort(c);
    }
}