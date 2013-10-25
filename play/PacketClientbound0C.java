class PacketClientbound0C {
    public void read(Buffer buffer)
    {
        a = buffer.readVarInt();
        b = new GameProfile(buffer.readString(36), buffer.readString(16));
        c = buffer.readInt();
        d = buffer.readInt();
        e = buffer.readInt();
        f = buffer.readByte();
        g = buffer.readByte();
        h = buffer.readShort();
        j = rq.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeVarInt(a);
        buffer.writeString(b.getId());
        buffer.writeString(b.getName());
        buffer.writeInt(c);
        buffer.writeInt(d);
        buffer.writeInt(e);
        buffer.writeByte(f);
        buffer.writeByte(g);
        buffer.writeShort(h);
        i.a(buffer);
    }
}