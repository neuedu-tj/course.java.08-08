package io.file;

import java.io.File;
import java.util.Date;

public class TestCase {

    public static void main(String[] args) {

        File file = new File("src/io/data/hello.txt");   // file -> file , 文件夹

        File file2= new File("src/io/data");
//        System.out.println("file.getName() = " + file.getName());
//        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
//
//        System.out.println("file.length() = " + file.length());
//
//        System.out.println("file.getPath() = " + file.getPath());

//        System.out.println("file.getFreeSpace() = " + file.getFreeSpace() / 1024 / 1024 / 1024);
//
//        System.out.println("file.getTotalSpace() = " + file.getTotalSpace());

//        System.out.println("file.canWrite() = " +file.canWrite());


        System.out.println("file.lastModified() = " + new Date(file.lastModified()));

        System.out.println("file.isFile() = " + file.isFile());

        System.out.println("file2.isDirectory() = " + file2.isDirectory());

        File[] files = file2.listFiles();

        for (int i = 0; i < files.length; i++) {
            if(true) {
            }
        }
    }
}
