package collection.list;

import collection.support.Emp;

import java.util.ArrayList;
import java.util.List;

public class TestCase2 {

    public static void main(String[] args) {

        Emp e1 = new Emp(1,"tom1");
        Emp e2 = new Emp(2,"tom2");


        List<Emp> emps = new ArrayList();
        emps.add(e1);
        emps.add(e2);

//        System.out.println( emps.contains(new Emp(1,"tom")) );

        emps.remove(new Emp(1,"tom1"));

        System.out.println(emps);

    }
}
