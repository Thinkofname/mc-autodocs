class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new abn[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        abn aabn[] = b;
        int i = aabn.length;
        for(int j = 0; j < i; j++)
        {
            abn abn1 = aabn[j];
            buffer.writeSlot(abn1);
        }

    }
}