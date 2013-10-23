class PacketClientbound2A {
    public void read(Buffer buffer)
    {
        a = buffer.readDouble();
        b = buffer.readDouble();
        c = buffer.readDouble();
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
            e.add(new aez(j1, k1, l1));
        }

        f = buffer.readFloat();
        g = buffer.readFloat();
        h = buffer.readFloat();
    }
    public void write(Buffer buffer)
    {
        buffer.writeDouble(a);
        buffer.writeDouble(b);
        buffer.writeDouble(c);
        buffer.writeFloat(d);
        buffer.writeInt(e.size());
        int i = (int)a;
        int j = (int)b;
        int k = (int)c;
        int j1;
        for(Iterator iterator = e.iterator(); iterator.hasNext(); buffer.writeByte(j1))
        {
            aez aez1 = (aez)iterator.next();
            int l = aez1.a - i;
            int i1 = aez1.b - j;
            j1 = aez1.c - k;
            buffer.writeByte(l);
            buffer.writeByte(i1);
        }

        buffer.writeFloat(f);
        buffer.writeFloat(g);
        buffer.writeFloat(h);
    }
}