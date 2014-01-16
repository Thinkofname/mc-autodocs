class PacketServerbound07 {
    public void read(Buffer buffer)
    {
        c = buffer.readUnsignedByte();
        a = buffer.readPosition();
        b = db.a(buffer.readUnsignedByte());
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(c);
        buffer.writePosition(a);
        buffer.writeByte(b.a());
    }
}