class PacketServerbound0C {
    public void read(Buffer buffer)
    {
        a = buffer.readFloat();
        b = buffer.readFloat();
        c = buffer.readBoolean();
        d = buffer.readBoolean();
    }
    public void write(Buffer buffer)
    {
        buffer.writeFloat(a);
        buffer.writeFloat(b);
        buffer.writeBoolean(c);
        buffer.writeBoolean(d);
    }
}