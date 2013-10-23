class PacketClientbound1E {
    public void read(Buffer buffer)
    {
        b = buffer.readInt();
        c = buffer.readInt();
        a = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeByte(a);
    }
}