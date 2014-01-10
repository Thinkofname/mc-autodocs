class PacketClientbound22 {
    public void read(Buffer buffer)
    {
        b = new agq(buffer.readInt(), buffer.readInt());
        d = buffer.readShort() & 0xffff;
        int i = buffer.readInt();
        if(i > 0)
        {
            c = new byte[i];
            buffer.readBytes(c);
        }
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(b.a);
        buffer.writeInt(b.b);
        buffer.writeShort((short)d);
        if(c != null)
        {
            buffer.writeInt(c.length);
            buffer.writeBytes(c);
        } else
        {
            buffer.writeInt(0);
        }
    }
}