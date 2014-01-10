class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = sp.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        sp.a(b, buffer);
    }
}