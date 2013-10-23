class PacketClientbound2E {
    public void read(Buffer buffer)
    {
        b = buffer.readByte();
        c = buffer.readFloat();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(b);
        buffer.writeFloat(c);
    }
}