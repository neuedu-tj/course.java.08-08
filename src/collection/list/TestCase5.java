package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCase5 {

    static final int count = 100000;


    public static void main(String[] args) {
        
        List array = new ArrayList();
        List link = new LinkedList();

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            array.add(0,new Object());
        }
        long end = System.currentTimeMillis();
        System.out.println("array , add object : "+ (end - start) );



        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            link.add(0,new Object());
        }
        end = System.currentTimeMillis();
        System.out.println("link , add object : " + (end - start) );


        System.out.println("-----------------------------------------------");

        start = System.currentTimeMillis();
        for (int i = 0; i < count ; i++) {
            int index = (int )(Math.random()*count);  //随机数
            array.get(index);
        }
        end = System.currentTimeMillis();

        System.out.println("array.get" + (end - start) );

        start = System.currentTimeMillis();
        for (int i = 0; i < count ; i++) {
            int index = (int )(Math.random()*count);
            link.get(index);
        }
        end = System.currentTimeMillis();
        System.out.println("link.get : " + (end - start) );



    }
}
