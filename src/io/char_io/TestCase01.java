package io.char_io;

import java.io.*;

public class TestCase01 {

    public static void main(String[] args) throws Exception {

        File from = new File("src/io/data/char.txt");
        File to = new File("src/io/data/char-result.txt");

        Reader reader = new FileReader(from);
        Writer writer = new FileWriter(to);
//        Reader reader = new InputStreamReader(new FileInputStream(file));

        BufferedReader bReader = new BufferedReader(reader);
        BufferedWriter bWriter = new BufferedWriter(writer);

        while(bReader.ready()) {
            String info = bReader.readLine();
            bWriter.write(info);
            bWriter.newLine();
        }

        bWriter.flush();

    }
}
