class PacketClientbound02 {
    public void read(Buffer buffer)
    {
        String s = buffer.readString(36);
        String s1 = buffer.readString(16);
        a = new GameProfile(s, s1);
    }
    public void write(Buffer buffer)
    {
        buffer.writeString(a.getId());
        buffer.writeString(a.getName());
    }
}