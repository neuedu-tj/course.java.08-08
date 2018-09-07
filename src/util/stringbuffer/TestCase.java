package util.stringbuffer;

import java.util.Arrays;

public class TestCase {

    public static void main(String[] args) {

          StringBuffer s1 = new StringBuffer("spring-cloud");
//        s1.append("\t");
//        s1.append("hello").append("world");
//        s1.append(" ! ") ;
//
//        System.out.println( s1.toString() );

//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            s1.append("java");
//        }
//        long end = System.currentTimeMillis();
//
//        System.out.println(end - start );


            String[] skills = {"java" , "c" , "redis" , "elasticSearch" , "hadoop"};

            StringBuffer result = new StringBuffer();
            for (int i = 0; i < skills.length; i++) {
                result.append(skills[i]).append(",");
            }

            result.deleteCharAt(result.lastIndexOf(","));

            System.out.println(result.toString());

            s1.trimToSize();




    }
}
