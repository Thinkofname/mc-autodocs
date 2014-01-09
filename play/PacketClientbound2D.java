class PacketClientbound2D {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        b = buffer.readString(32);
        c = fp.a(buffer.readString(32767));
        d = buffer.readUnsignedByte();
        if(b.equals("EntityHorse"))
            e = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeString(b);
        buffer.writeString(fp.a(c));
        buffer.writeByte(d);
        if(b.equals("EntityHorse"))
            buffer.writeInt(e);
    }
}