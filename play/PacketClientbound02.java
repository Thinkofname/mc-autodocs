class PacketClientbound02 {
    public void read(Buffer buffer)
    {
        a = fp.a(buffer.readString(32767));
        b = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(fp.a(a));
        buffer.writeByte(b);
    }
}