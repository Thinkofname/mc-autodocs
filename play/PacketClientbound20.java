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
                arraylist.add(new sv(uuid, "Unknown synced attribute modifier", buffer.readDouble(), buffer.readByte()));
            }

            b.add(new iu(this, s, d, arraylist));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.size());
        for(Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            iu iu1 = (iu)iterator.next();
            buffer.writeString(iu1.a());
            buffer.writeDouble(iu1.b());
            buffer.writeShort(iu1.c().size());
            Iterator iterator1 = iu1.c().iterator();
            while(iterator1.hasNext()) 
            {
                sv sv1 = (sv)iterator1.next();
                buffer.writeLong(sv1.a().getMostSignificantBits());
                buffer.writeLong(sv1.a().getLeastSignificantBits());
                buffer.writeDouble(sv1.d());
                buffer.writeByte(sv1.c());
            }
        }

    }
}