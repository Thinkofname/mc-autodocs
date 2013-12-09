class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = rv.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        rv.a(b, buffer);
    }
}