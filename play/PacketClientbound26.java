class PacketClientbound26 {
    public void read(Buffer buffer)
    {
        short word0;
        byte abyte0[];
        Inflater inflater;
        word0 = buffer.readShort();
        g = buffer.readInt();
        h = buffer.readBoolean();
        a = new int[word0];
        b = new int[word0];
        c = new int[word0];
        d = new int[word0];
        f = new byte[word0][];
        if(i.length < g)
            i = new byte[g];
        buffer.readBytes(i, 0, g);
        abyte0 = new byte[he.c() * word0];
        inflater = new Inflater();
        inflater.setInput(i, 0, g);
        try
        {
            inflater.inflate(abyte0);
        }
        catch(DataFormatException dataformatexception)
        {
            throw new IOException("Bad compressed data format");
        }
        inflater.end();
        break MISSING_BLOCK_LABEL_157;
        Exception exception;
        exception;
        inflater.end();
        throw exception;
        int j = 0;
        for(int k = 0; k < word0; k++)
        {
            a[k] = buffer.readInt();
            b[k] = buffer.readInt();
            c[k] = buffer.readShort();
            d[k] = buffer.readShort();
            int l = 0;
            int i1 = 0;
            for(int j1 = 0; j1 < 16; j1++)
            {
                l += c[k] >> j1 & 1;
                i1 += d[k] >> j1 & 1;
            }

            int k1 = 2048 * (4 * l) + 256;
            k1 += 2048 * i1;
            if(h)
                k1 += 2048 * l;
            f[k] = new byte[k1];
            System.arraycopy(abyte0, j, f[k], 0, k1);
            j += k1;
        }

        return;
    }
    public void write(Buffer buffer)
    {
        buffer.writeShort(a.length);
        buffer.writeInt(g);
        buffer.writeBoolean(h);
        buffer.writeBytes(e, 0, g);
        for(int j = 0; j < a.length; j++)
        {
            buffer.writeInt(a[j]);
            buffer.writeInt(b[j]);
            buffer.writeShort((short)(c[j] & 0xffff));
            buffer.writeShort((short)(d[j] & 0xffff));
        }

    }
}