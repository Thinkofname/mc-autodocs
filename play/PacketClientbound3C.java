class PacketClientbound3C {
    public void read(Buffer buffer)
    {
        byte byte0 = buffer.readByte();
        a((byte0 & 1) > 0);
        b((byte0 & 2) > 0);
        c((byte0 & 4) > 0);
        d((byte0 & 8) > 0);
        a(buffer.readFloat());
        b(buffer.readFloat());
    }
    public void write(Buffer buffer)
    {
        byte byte0 = 0;
        if(c())
            byte0 |= 1;
        if(d())
            byte0 |= 2;
        if(e())
            byte0 |= 4;
        if(f())
            byte0 |= 8;
        buffer.writeByte(byte0);
        buffer.writeFloat(e);
        buffer.writeFloat(f);
    }
}