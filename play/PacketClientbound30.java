class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new abp[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        abp aabp[] = b;
        int i = aabp.length;
        for(int j = 0; j < i; j++)
        {
            abp abp1 = aabp[j];
            buffer.writeSlot(abp1);
        }

    }
}