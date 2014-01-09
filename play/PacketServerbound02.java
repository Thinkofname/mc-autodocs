class PacketServerbound02 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = ji.a()[buffer.readByte() % ji.a().length];
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(ji.a(b));
    }
}