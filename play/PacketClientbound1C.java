class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = ru.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        ru.a(b, buffer);
    }
}