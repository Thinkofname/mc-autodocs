class PacketClientbound25 {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
        e = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
        buffer.writeByte(e);
    }
}