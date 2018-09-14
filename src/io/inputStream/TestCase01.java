package io.inputStream;

import java.io.*;

public class TestCase01 {

    public static void main(String[] args) {

        File file = new File("src/io/data/wechat.rar");
        InputStream in =null ;
        try {
            in = new FileInputStream(file);
            long start = System.currentTimeMillis();
            byte[] cache = new byte[(int)file.length()];
            in.read(cache);
            long end = System.currentTimeMillis();
            System.out.println(end - start );

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
