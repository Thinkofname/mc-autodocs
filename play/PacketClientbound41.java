class PacketClientbound41 {
    public void read(Buffer buffer)
    {
        a = buffer.readString(16);
        f = buffer.readByte();
        if(f == 0 || f == 2)
        {
            b = buffer.readString(32);
            c = buffer.readString(16);
            d = buffer.readString(16);
            g = buffer.readByte();
        }
        if(f == 0 || f == 3 || f == 4)
        {
            short word0 = buffer.readShort();
            for(int i = 0; i < word0; i++)
                e.add(buffer.readString(16));

        }
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a);
        buffer.writeByte(f);
        if(f == 0 || f == 2)
        {
            buffer.writeString(b);
            buffer.writeString(c);
            buffer.writeString(d);
            buffer.writeByte(g);
        }
        if(f == 0 || f == 3 || f == 4)
        {
            buffer.writeShort(e.size());
            String s;
            for(Iterator iterator = e.iterator(); iterator.hasNext(); buffer.writeString(s))
        }
    }
}