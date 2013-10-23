class PacketClientbound29 {
    public void read(Buffer buffer)
    {
        short word0;
        byte abyte0[];
        Inflater inflater;
        word0 = buffer.readShort();
        g = buffer.readInt();
        h = buffer.readBoolean();
        c = new int[word0];
        d = new int[word0];
        a = new int[word0];
        b = new int[word0];
        f = new byte[word0][];
        if(i.length < g)
            i = new byte[g];
        buffer.readBytes(i, 0, g);
        abyte0 = new byte[0x30100 * word0];
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
        break MISSING_BLOCK_LABEL_156;
        Exception exception;
        exception;
        inflater.end();
        throw exception;
        int j = 0;
        for(int k = 0; k < word0; k++)
        {
            c[k] = buffer.readInt();
            d[k] = buffer.readInt();
            a[k] = buffer.readShort();
            b[k] = buffer.readShort();
            int l = 0;
            int i1 = 0;
            for(int j1 = 0; j1 < 16; j1++)
            {
                l += a[k] >> j1 & 1;
                i1 += b[k] >> j1 & 1;
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
        buffer.writeShort(c.length);
        buffer.writeInt(g);
        buffer.writeBoolean(h);
        buffer.writeBytes(e, 0, g);
        for(int j = 0; j < c.length; j++)
        {
            buffer.writeInt(c[j]);
            buffer.writeInt(d[j]);
            buffer.writeShort((short)(a[j] & 0xffff));
            buffer.writeShort((short)(b[j] & 0xffff));
        }

    }
}