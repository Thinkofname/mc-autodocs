class PacketClientbound23 {
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
                arraylist.add(new rp(uuid, "Unknown synced attribute modifier", buffer.readDouble(), buffer.readByte()));
            }

            b.add(new ia(this, s, d, arraylist));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.size());
        for(Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            ia ia1 = (ia)iterator.next();
            buffer.writeString(ia1.a());
            buffer.writeDouble(ia1.b());
            buffer.writeShort(ia1.c().size());
            Iterator iterator1 = ia1.c().iterator();
            while(iterator1.hasNext()) 
            {
                rp rp1 = (rp)iterator1.next();
                buffer.writeLong(rp1.a().getMostSignificantBits());
                buffer.writeLong(rp1.a().getLeastSignificantBits());
                buffer.writeDouble(rp1.d());
                buffer.writeByte(rp1.c());
            }
        }

    }
}