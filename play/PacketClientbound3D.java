class PacketClientbound3D {
    public void read(Buffer buffer)
    {
        a = buffer.readString(32767);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(StringUtils.substring(a, 0, 32767));
    }
}