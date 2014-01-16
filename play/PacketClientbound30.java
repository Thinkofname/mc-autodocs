class PacketClientbound30 {
    public void read(Buffer buffer)
    {
        a = buffer.readUnsignedByte();
        short word0 = buffer.readShort();
        b = new adb[word0];
        for(int i = 0; i < word0; i++)
            b[i] = buffer.readSlot();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a);
        buffer.writeShort(b.length);
        adb aadb[] = b;
        int i = aadb.length;
        for(int j = 0; j < i; j++)
        {
            adb adb1 = aadb[j];
            buffer.writeSlot(adb1);
        }

    }
}