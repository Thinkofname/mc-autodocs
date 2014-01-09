class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = sn.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        sn.a(b, buffer);
    }
}