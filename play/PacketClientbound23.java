class PacketClientbound23 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readUnsignedByte();
        c = buffer.readInt();
        d = ahm.e(buffer.readVarInt());
        e = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b);
        buffer.writeInt(c);
        buffer.writeVarInt(ahm.b(d));
        buffer.writeByte(e);
    }
}