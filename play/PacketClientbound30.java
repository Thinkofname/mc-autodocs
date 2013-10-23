class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new abg[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        abg aabg[] = b;
        int i = aabg.length;
        for(int j = 0; j < i; j++)
        {
            abg abg1 = aabg[j];
            buffer.writeSlot(abg1);
        }

    }
}