class PacketClientbound2D {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        b = buffer.readUnsignedByte();
        c = buffer.readString(32);
        d = buffer.readUnsignedByte();
        e = buffer.readBoolean();
        if(b == 11)
            f = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeByte(b);
        buffer.writeString(c);
        buffer.writeByte(d);
        buffer.writeBoolean(e);
        if(b == 11)
            buffer.writeInt(f);
    }
}