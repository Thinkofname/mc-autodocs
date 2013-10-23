class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new abo[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        abo aabo[] = b;
        int i = aabo.length;
        for(int j = 0; j < i; j++)
        {
            abo abo1 = aabo[j];
            buffer.writeSlot(abo1);
        }

    }
}