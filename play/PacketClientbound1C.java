class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = sq.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        sq.a(b, buffer);
    }
}