class PacketClientbound00 {
    public void read(Buffer buffer)
    {
        b = (jq)a.fromJson(buffer.readString(32767), jq);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.toJson(b));
    }
}