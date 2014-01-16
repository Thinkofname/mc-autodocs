class PacketClientbound02 {
    public void read(Buffer buffer)
    {
        a = fq.a(buffer.readString(32767));
        b = buffer.readByte();
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(fq.a(a));
        buffer.writeByte(b);
    }
}