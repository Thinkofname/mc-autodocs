class PacketClientbound1F {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = rk.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        rk.a(b, buffer);
    }
}