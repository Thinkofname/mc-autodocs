class PacketClientbound3A {
    public void read(Buffer buffer)
    {
        int i = buffer.readInt();
        for(int j = 0; j < i; j++)
        {
            np np1 = nx.a(buffer.readString(32767));
            int k = buffer.readInt();
            if(np1 != null)
                a.put(np1, Integer.valueOf(k));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a.size());
        java.util.Map.Entry entry;
        for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); buffer.writeInt(((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            buffer.writeString(((np)entry.getKey()).e);
        }

    }
}