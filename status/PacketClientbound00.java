class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        b = (jp)a.fromJson(buffer.readString(32767), jp);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.toJson(b));
    }
}