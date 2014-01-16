class PacketServerbound08 {
    public void read(Buffer buffer)
    {
        b = buffer.readPosition();
        c = buffer.readUnsignedByte();
        d = buffer.readSlot();
        e = (float)buffer.readUnsignedByte() / 16F;
        f = (float)buffer.readUnsignedByte() / 16F;
        g = (float)buffer.readUnsignedByte() / 16F;
    }
    public void write(Buffer buffer)
    {
        buffer.writePosition(b);
        buffer.writeByte(c);
        buffer.writeSlot(d);
        buffer.writeByte((int)(e * 16F));
        buffer.writeByte((int)(f * 16F));
        buffer.writeByte((int)(g * 16F));
    }
}