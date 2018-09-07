package util.string;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestCase2 {

    public static void main(String[] args) {

        String s1 = new String("Hello world");
        String skills = "java,oracle,redis,spring,es6";

//        System.out.println(s1.charAt(4));
//
//        System.out.println(  s1.indexOf("M") );
//
//        System.out.println(  s1.indexOf("o") );
//        System.out.println(  s1.lastIndexOf("o") );
//
//        System.out.println( s1.substring(6));
//        System.out.println( s1.substring(6 , 8));



//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            s1.concat("java");
//        }
//        long end = System.currentTimeMillis();
//
//        System.out.println(end - start );


        System.out.println( s1.replace("w" , "W"));
        char[] chars = s1.toCharArray();
        
        

        System.out.println("chars = " + Arrays.toString(chars));

        System.out.println("s1.toLowerCase() = " + s1.toLowerCase());

        System.out.println("s1 = " + s1.equalsIgnoreCase("Hello World"));

        String[] skill = skills.split(",");

        System.out.println("skills = " + Arrays.toString(skill));

        String result = String.join("-" , skill);

        System.out.println("result = " + result);

        s1.trim() ;// 去掉两端的空格

    }
}
