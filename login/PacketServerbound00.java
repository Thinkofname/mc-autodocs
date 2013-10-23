class PacketServerbound00 {
    public void read(Buffer buffer)
    {
        a = new GameProfile(null, buffer.readString(16));
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.getName());
    }
}