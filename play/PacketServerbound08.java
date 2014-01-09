class PacketServerbound08 {
    public void read(Buffer buffer)
    {
        int i = buffer.readInt();
        short word0 = buffer.readUnsignedByte();
        int j = buffer.readInt();
        b = new ct(i, word0, j);
        c = buffer.readUnsignedByte();
        d = buffer.readSlot();
        e = (float)buffer.readUnsignedByte() / 16F;
        f = (float)buffer.readUnsignedByte() / 16F;
        g = (float)buffer.readUnsignedByte() / 16F;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(b.a());
        buffer.writeByte(b.b());
        buffer.writeInt(b.c());
        buffer.writeByte(c);
        buffer.writeSlot(d);
        buffer.writeByte((int)(e * 16F));
        buffer.writeByte((int)(f * 16F));
        buffer.writeByte((int)(g * 16F));
    }
}