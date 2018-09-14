package io.outputStream;

import java.io.*;

public class TestCase {

    public static void main(String[] args) {

        File from = new File("src/io/data/hello.txt");
        File to = new File("src/io/data/result.txt");
        InputStream in =null ;
        OutputStream out = null;
        try {
            in = new FileInputStream(from);
            out = new FileOutputStream(to);

            BufferedInputStream bin = new BufferedInputStream(in);
            BufferedOutputStream bout = new BufferedOutputStream(out);


            byte[] cache = new byte[(int)from.length()];

            bin.read(cache);
            bout.write(cache);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
