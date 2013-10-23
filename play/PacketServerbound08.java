class PacketServerbound08 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = buffer.readUnsignedByte();
        c = buffer.readInt();
        d = buffer.readUnsignedByte();
        e = buffer.readSlot();
        f = (float)buffer.readUnsignedByte() / 16F;
        g = (float)buffer.readUnsignedByte() / 16F;
        h = (float)buffer.readUnsignedByte() / 16F;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeByte(b);
        buffer.writeInt(c);
        buffer.writeByte(d);
        buffer.writeSlot(e);
        buffer.writeByte((int)(f * 16F));
        buffer.writeByte((int)(g * 16F));
        buffer.writeByte((int)(h * 16F));
    }
}