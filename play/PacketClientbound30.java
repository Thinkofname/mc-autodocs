class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new acw[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        acw aacw[] = b;
        int i = aacw.length;
        for(int j = 0; j < i; j++)
        {
            acw acw1 = aacw[j];
            buffer.writeSlot(acw1);
        }

    }
}