class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        b = (jn)a.fromJson(buffer.readString(32767), jn);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.toJson(b));
    }
}