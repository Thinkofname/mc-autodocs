class PacketClientbound2C {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        e = buffer.readByte();
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeByte(e);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
    }
}