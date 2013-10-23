class PacketClientbound3F {
    public void read(Buffer buffer)
    {
        a = buffer.readString(16);
        d = buffer.readByte();
        if(d != 1)
        {
            b = buffer.readString(16);
            c = buffer.readInt();
        }
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeByte(d);
        if(d != 1)
        {
            buffer.writeString(b);
            buffer.writeInt(c);
        }
    }
}