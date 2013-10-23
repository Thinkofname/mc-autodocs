class PacketClientbound32 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        b = buffer.readShort();
        c = buffer.readBoolean();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b);
        buffer.writeBoolean(c);
    }
}