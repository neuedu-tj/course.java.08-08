package collection.list;

import collection.support.Emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestCase {

    public static void main(String[] args) {


        List data = new ArrayList();
//        int a = 1;  Integer b = 1;
//        data.add(b); //自动装箱

        data.add("Hello");
        data.add(2.3);

        data.add(0, "java");

        data.add(new Date());

//        System.out.println(data);
//
//        for (int i = 0; i < data.size(); i++) {
//            System.out.println( data.get(i));
//        }
//
////        data.clear();
//
//        System.out.println("---------------");
//
//        System.out.println( data.contains(2.3) );



        Object[] arr = data.toArray();  // 容器 --> 数组
        System.out.println(Arrays.toString(arr));

        List arrays = Arrays.asList(arr);   // 数组 --> 容器
        System.out.println(arrays);

        arrays.add("spring");   //java.lang.UnsupportedOperationException

        System.out.println(arrays);

        //////////////





    }
}
