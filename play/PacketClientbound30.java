class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new abu[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        abu aabu[] = b;
        int i = aabu.length;
        for(int j = 0; j < i; j++)
        {
            abu abu1 = aabu[j];
            buffer.writeSlot(abu1);
        }

    }
}