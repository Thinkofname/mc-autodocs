class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        b = (kj)a.fromJson(buffer.readString(32767), kj);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.toJson(b));
    }
}