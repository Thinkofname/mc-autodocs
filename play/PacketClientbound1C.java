class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = rq.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        rq.a(b, buffer);
    }
}