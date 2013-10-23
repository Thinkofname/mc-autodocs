class PacketClientbound26 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readUnsignedByte();
        c = buffer.readInt();
        e = ahp.e(buffer.readShort());
        d = buffer.readUnsignedByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b);
        buffer.writeInt(c);
        buffer.writeShort(ahp.b(e));
        buffer.writeByte(d);
    }
}