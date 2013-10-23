class PacketServerbound02 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = in.a()[buffer.readByte() % in.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(in.a(b));
    }
}