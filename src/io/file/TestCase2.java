package io.file;

import java.io.*;
import java.util.Arrays;

public class TestCase2 {

    public static void main(String[] args) {

        File file = new File("src/io/data/wechat.rar");
        try {
            InputStream in = new FileInputStream(file);

            long start = System.currentTimeMillis();
            byte[] cache = new byte[(int)file.length()];
            BufferedInputStream buffer = new BufferedInputStream(in);
            buffer.read(cache);
            long end = System.currentTimeMillis();

            System.out.println(end - start );


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
