class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new abm[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        abm aabm[] = b;
        int i = aabm.length;
        for(int j = 0; j < i; j++)
        {
            abm abm1 = aabm[j];
            buffer.writeSlot(abm1);
        }

    }
}