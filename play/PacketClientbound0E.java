class PacketClientbound0E {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        j = buffer.readByte();
        b = buffer.readInt();
        c = buffer.readInt();
        d = buffer.readInt();
        h = buffer.readByte();
        i = buffer.readByte();
        k = buffer.readInt();
        if(k > 0)
        {
            e = buffer.readShort();
            f = buffer.readShort();
            g = buffer.readShort();
        }
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeByte(j);
        buffer.writeInt(b);
        buffer.writeInt(c);
        buffer.writeInt(d);
        buffer.writeByte(h);
        buffer.writeByte(i);
        buffer.writeInt(k);
        if(k > 0)
        {
            buffer.writeShort(e);
            buffer.writeShort(f);
            buffer.writeShort(g);
        }
    }
}