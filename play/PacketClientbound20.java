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
                arraylist.add(new ru(uuid, "Unknown synced attribute modifier", buffer.readDouble(), buffer.readByte()));
            }

            b.add(new hy(this, s, d, arraylist));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.size());
        for(Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            hy hy1 = (hy)iterator.next();
            buffer.writeString(hy1.a());
            buffer.writeDouble(hy1.b());
            buffer.writeShort(hy1.c().size());
            Iterator iterator1 = hy1.c().iterator();
            while(iterator1.hasNext()) 
            {
                ru ru1 = (ru)iterator1.next();
                buffer.writeLong(ru1.a().getMostSignificantBits());
                buffer.writeLong(ru1.a().getLeastSignificantBits());
                buffer.writeDouble(ru1.d());
                buffer.writeByte(ru1.c());
            }
        }

    }
}