class PacketServerbound02 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = iq.a()[buffer.readByte() % iq.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(iq.a(b));
    }
}