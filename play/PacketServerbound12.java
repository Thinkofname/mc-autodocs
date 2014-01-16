class PacketServerbound12 {
    public void read(Buffer buffer)
    {
        a = buffer.readPosition();
        b = new String[4];
        for(int i = 0; i < 4; i++)
            b[i] = buffer.readString(15);

    }
    public void write(Buffer buffer)
    {
        buffer.writePosition(a);
        for(int i = 0; i < 4; i++)
            buffer.writeString(b[i]);

    }
}