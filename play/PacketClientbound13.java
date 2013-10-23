class PacketClientbound13 {
    public void read(Buffer buffer)
    {
        a = new int[buffer.readByte()];
        for(int i = 0; i < a.length; i++)
            a[i] = buffer.readInt();

    }
    public void write(Buffer buffer)
    {
        buffer.writeByte(a.length);
        for(int i = 0; i < a.length; i++)
            buffer.writeInt(a[i]);

    }
}