class PacketClientbound3A {
    public void read(Buffer buffer)
    {
        a = new String[buffer.readVarInt()];
        for(int i = 0; i < a.length; i++)
            a[i] = buffer.readString(32767);

    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a.length);
        String as[] = a;
        int i = as.length;
        for(int j = 0; j < i; j++)
        {
            String s = as[j];
            buffer.writeString(s);
        }

    }
}