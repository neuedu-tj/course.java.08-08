package collection.list;

import collection.support.Emp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestCase {

    public static void main(String[] args) {


        List data = new ArrayList();

        data.add("Hello");
        data.add(2.3);

        data.add(0, "java");

        data.add(new Date());

//        System.out.println(data);

        for (int i = 0; i < data.size(); i++) {
            System.out.println( data.get(i));
        }

//        data.clear();

        System.out.println("---------------");

        System.out.println( data.contains(2.3) );





    }
}
