class PacketClientbound20 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        int i = buffer.readInt();
        for(int j = 0; j < i; j++)
        {
            String s = buffer.readString(64);
            double d = buffer.readDouble();
            ArrayList arraylist = new ArrayList();
            short word0 = buffer.readShort();
            for(int k = 0; k < word0; k++)
            {
                UUID uuid = new UUID(buffer.readLong(), buffer.readLong());
                arraylist.add(new rv(uuid, "Unknown synced attribute modifier", buffer.readDouble(), buffer.readByte()));
            }

            b.add(new hz(this, s, d, arraylist));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.size());
        for(Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            hz hz1 = (hz)iterator.next();
            buffer.writeString(hz1.a());
            buffer.writeDouble(hz1.b());
            buffer.writeShort(hz1.c().size());
            Iterator iterator1 = hz1.c().iterator();
            while(iterator1.hasNext()) 
            {
                rv rv1 = (rv)iterator1.next();
                buffer.writeLong(rv1.a().getMostSignificantBits());
                buffer.writeLong(rv1.a().getLeastSignificantBits());
                buffer.writeDouble(rv1.d());
                buffer.writeByte(rv1.c());
            }
        }

    }
}