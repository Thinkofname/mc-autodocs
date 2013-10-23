class PacketClientbound01 {
    public void read(Buffer buffer)
    {
        a = buffer.readString(20);
        b = ny.a(a(((io.netty.buffer.ByteBuf) (buffer))));
        c = a(((io.netty.buffer.ByteBuf) (buffer)));
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        a(buffer, b.getEncoded());
        a(buffer, c);
    }
}