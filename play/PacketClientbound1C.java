class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = rt.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        rt.a(b, buffer);
    }
}