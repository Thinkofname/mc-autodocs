class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = ro.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        ro.a(b, buffer);
    }
}