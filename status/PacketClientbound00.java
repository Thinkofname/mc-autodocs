class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        b = (jo)a.fromJson(buffer.readString(32767), jo);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.toJson(b));
    }
}