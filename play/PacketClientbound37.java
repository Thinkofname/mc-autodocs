class PacketClientbound37 {
    public void read(Buffer buffer)
    {
        int i = buffer.writeVarInt();
        a = Maps.newHashMap();
        for(int j = 0; j < i; j++)
        {
            oo oo1 = ow.a(buffer.readString(32767));
            int k = buffer.writeVarInt();
            if(oo1 != null)
                a.put(oo1, Integer.valueOf(k));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a.size());
        java.util.Map.Entry entry;
        for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); buffer.writeVarInt(((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            buffer.writeString(((oo)entry.getKey()).e);
        }

    }
}