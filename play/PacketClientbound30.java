class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new acy[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        acy aacy[] = b;
        int i = aacy.length;
        for(int j = 0; j < i; j++)
        {
            acy acy1 = aacy[j];
            buffer.writeSlot(acy1);
        }

    }
}