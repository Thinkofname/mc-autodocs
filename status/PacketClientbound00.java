class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        b = (ki)a.fromJson(buffer.readString(32767), ki);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.toJson(b));
    }
}