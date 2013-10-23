class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = rp.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        rp.a(b, buffer);
    }
}