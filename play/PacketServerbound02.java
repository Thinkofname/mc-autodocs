class PacketServerbound02 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = is.a()[buffer.readByte() % is.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(is.a(b));
    }
}