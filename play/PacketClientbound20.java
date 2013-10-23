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
                arraylist.add(new rm(uuid, "Unknown synced attribute modifier", buffer.readDouble(), buffer.readByte()));
            }

            b.add(new hx(this, s, d, arraylist));
        }

    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b.size());
        for(Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            hx hx1 = (hx)iterator.next();
            buffer.writeString(hx1.a());
            buffer.writeDouble(hx1.b());
            buffer.writeShort(hx1.c().size());
            Iterator iterator1 = hx1.c().iterator();
            while(iterator1.hasNext()) 
            {
                rm rm1 = (rm)iterator1.next();
                buffer.writeLong(rm1.a().getMostSignificantBits());
                buffer.writeLong(rm1.a().getLeastSignificantBits());
                buffer.writeDouble(rm1.d());
                buffer.writeByte(rm1.c());
            }
        }

    }
}