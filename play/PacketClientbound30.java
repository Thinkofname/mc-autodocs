class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readByte() & 0xff;
        b = buffer.readByte() & 0xff;
        c = buffer.readString(32);
        d = buffer.readByte() & 0xff;
        e = buffer.readBoolean();
        if(b == 11)
            f = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a & 0xff);
        buffer.writeByte(b & 0xff);
        buffer.writeString(c);
        buffer.writeByte(d & 0xff);
        buffer.writeBoolean(e);
        if(b == 11)
            buffer.writeInt(f);
    }
}