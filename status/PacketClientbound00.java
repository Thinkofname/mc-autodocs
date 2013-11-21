class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        b = (js)a.fromJson(buffer.readString(32767), js);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.toJson(b));
    }
}