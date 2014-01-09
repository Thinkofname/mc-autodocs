class PacketClientbound20 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        int i = buffer.readInt();
        for(int j = 0; j < i; j++)
        {
            String s = buffer.readString(64);
            double d = buffer.readDouble();
            ArrayList arraylist = Lists.newArrayList();
            short word0 = buffer.readShort();
            for(int k = 0; k < word0; k++)
            {
                UUID uuid = new UUID(buffer.readLong(), buffer.readLong());
                arraylist.add(new ss(uuid, "Unknown synced attribute modifier", buffer.readDouble(), buffer.readByte()));
            }

            b.add(new it(this, s, d, arraylist));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.size());
        for(Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            it it1 = (it)iterator.next();
            buffer.writeString(it1.a());
            buffer.writeDouble(it1.b());
            buffer.writeShort(it1.c().size());
            Iterator iterator1 = it1.c().iterator();
            while(iterator1.hasNext()) 
            {
                ss ss1 = (ss)iterator1.next();
                buffer.writeLong(ss1.a().getMostSignificantBits());
                buffer.writeLong(ss1.a().getLeastSignificantBits());
                buffer.writeDouble(ss1.d());
                buffer.writeByte(ss1.c());
            }
        }

    }
}