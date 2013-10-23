class PacketClientbound42 {
    public void read(Buffer buffer)
    {
        a = buffer.readString(20);
        b = buffer.readShort();
        if(b > 0 && b < 32767)
        {
            c = new byte[b];
            buffer.readBytes(c);
        }
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeShort((short)b);
        if(c != null)
            buffer.writeBytes(c);
    }
}