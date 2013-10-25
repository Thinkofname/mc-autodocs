class PacketClientbound37 {
    public void read(Buffer buffer)
    {
        int i = buffer.readVarInt();
        a = Maps.newHashMap();
        for(int j = 0; j < i; j++)
        {
            nv nv1 = od.a(buffer.readString(32767));
            int k = buffer.readVarInt();
            if(nv1 != null)
                a.put(nv1, Integer.valueOf(k));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a.size());
        java.util.Map.Entry entry;
        for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); buffer.writeVarInt(((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            buffer.writeString(((nv)entry.getKey()).e);
        }

    }
}