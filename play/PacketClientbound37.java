class PacketClientbound37 {
    public void read(Buffer buffer)
    {
        int i = buffer.readVarInt();
        a = Maps.newHashMap();
        for(int j = 0; j < i; j++)
        {
            on on1 = ov.a(buffer.readString(32767));
            int k = buffer.readVarInt();
            if(on1 != null)
                a.put(on1, Integer.valueOf(k));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a.size());
        java.util.Map.Entry entry;
        for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); buffer.writeVarInt(((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            buffer.writeString(((on)entry.getKey()).e);
        }

    }
}