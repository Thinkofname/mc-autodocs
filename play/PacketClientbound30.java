class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new abt[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        abt aabt[] = b;
        int i = aabt.length;
        for(int j = 0; j < i; j++)
        {
            abt abt1 = aabt[j];
            buffer.writeSlot(abt1);
        }

    }
}