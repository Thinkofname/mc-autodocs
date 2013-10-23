class PacketServerbound02 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = io.a()[buffer.readByte() % io.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(io.a(b));
    }
}