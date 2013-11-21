class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new abs[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        abs aabs[] = b;
        int i = aabs.length;
        for(int j = 0; j < i; j++)
        {
            abs abs1 = aabs[j];
            buffer.writeSlot(abs1);
        }

    }
}