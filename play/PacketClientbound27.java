class PacketClientbound27 {
    public void read(Buffer buffer)
    {
        a = buffer.readFloat();
        b = buffer.readFloat();
        c = buffer.readFloat();
        d = buffer.readFloat();
        int i = buffer.readInt();
        e = new ArrayList(i);
        int j = (int)a;
        int k = (int)b;
        int l = (int)c;
        for(int i1 = 0; i1 < i; i1++)
        {
            int j1 = buffer.readByte() + j;
            int k1 = buffer.readByte() + k;
            int l1 = buffer.readByte() + l;
            e.add(new afd(j1, k1, l1));
        }

        f = buffer.readFloat();
        g = buffer.readFloat();
        h = buffer.readFloat();
    }
    public void write(Buffer buffer)
    {
        buffer.writeFloat((float)a);
        buffer.writeFloat((float)b);
        buffer.writeFloat((float)c);
        buffer.writeFloat(d);
        buffer.writeInt(e.size());
        int i = (int)a;
        int j = (int)b;
        int k = (int)c;
        int j1;
        for(Iterator iterator = e.iterator(); iterator.hasNext(); buffer.writeByte(j1))
        {
            afd afd1 = (afd)iterator.next();
            int l = afd1.a - i;
            int i1 = afd1.b - j;
            j1 = afd1.c - k;
            buffer.writeByte(l);
            buffer.writeByte(i1);
        }

        buffer.writeFloat(f);
        buffer.writeFloat(g);
        buffer.writeFloat(h);
    }
}