class PacketClientbound21 {
    public void read(Buffer buffer)
    {
        Inflater inflater;
        a = buffer.readInt();
        b = buffer.readInt();
        g = buffer.readBoolean();
        c = buffer.readShort();
        d = buffer.readShort();
        h = buffer.readInt();
        if(i.length < h)
            i = new byte[h];
        buffer.readBytes(i, 0, h);
        int j = 0;
        for(int k = 0; k < 16; k++)
            j += c >> k & 1;

        int l = 12288 * j;
        if(g)
            l += 256;
        f = new byte[l];
        inflater = new Inflater();
        inflater.setInput(i, 0, h);
        try
        {
            inflater.inflate(f);
        }
        catch(DataFormatException dataformatexception)
        {
            throw new IOException("Bad compressed data format");
        }
        inflater.end();
        break MISSING_BLOCK_LABEL_196;
        Exception exception;
        exception;
        inflater.end();
        throw exception;
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        buffer.writeInt(b);
        buffer.writeBoolean(g);
        buffer.writeShort((short)(c & 0xffff));
        buffer.writeShort((short)(d & 0xffff));
        buffer.writeInt(h);
        buffer.writeBytes(e, 0, h);
    }
}