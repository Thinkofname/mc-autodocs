class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = rh.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        rh.a(b, buffer);
    }
}