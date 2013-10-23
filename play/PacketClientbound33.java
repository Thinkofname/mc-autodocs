class PacketClientbound33 {
    public void read(Buffer buffer)
    {
        a = buffer.readByte();
        short word0 = buffer.readShort();
        b = new abj[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        for(int i = 0; i < b.length; i++)
            buffer.writeSlot(b[i]);

    }
}