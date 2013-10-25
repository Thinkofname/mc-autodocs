class PacketClientbound35 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readShort();
        c = buffer.readInt();
        d = buffer.readUnsignedByte();
        e = buffer.readNBT();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeShort(b);
        buffer.writeInt(c);
        buffer.writeByte((byte)d);
        buffer.writeNBT(e);
    }
}
