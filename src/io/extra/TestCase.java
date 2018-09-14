package io.extra;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TestCase {

    public static void main(String[] args) {

        try {
//
//            FileUtils.copyFile(new File("from") , new File("to"));
//            InputStream in = null;
//
//            FileUtils.copyInputStreamToFile(   in , new File("to") );

            FileUtils.copyURLToFile( new URL("http://www.baidu.com" ), new File("src/io/data/baidu.txt"));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
