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
                arraylist.add(new sa(uuid, "Unknown synced attribute modifier", buffer.readDouble(), buffer.readByte()));
            }

            b.add(new ic(this, s, d, arraylist));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.size());
        for(Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            ic ic1 = (ic)iterator.next();
            buffer.writeString(ic1.a());
            buffer.writeDouble(ic1.b());
            buffer.writeShort(ic1.c().size());
            Iterator iterator1 = ic1.c().iterator();
            while(iterator1.hasNext()) 
            {
                sa sa1 = (sa)iterator1.next();
                buffer.writeLong(sa1.a().getMostSignificantBits());
                buffer.writeLong(sa1.a().getLeastSignificantBits());
                buffer.writeDouble(sa1.d());
                buffer.writeByte(sa1.c());
            }
        }

    }
}