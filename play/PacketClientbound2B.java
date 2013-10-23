class PacketClientbound2B {
    public void read(Buffer buffer)
    {
        b = buffer.readUnsignedByte();
        c = buffer.readFloat();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(b);
        buffer.writeFloat(c);
    }
}