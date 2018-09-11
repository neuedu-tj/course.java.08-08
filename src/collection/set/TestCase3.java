package collection.set;

import collection.support.Stu;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


/*
*  TreeSet 可以直接发现排序的能力
*
* */
public class TestCase3 {

    public static void main(String[] args) {

        Stu s1 = new Stu(1,"tom1" , 80);
        Stu s2 = new Stu(2,"tom2" , 70);
        Stu s3 = new Stu(3,"tom4" , 90);
        Stu s4 = new Stu(4,"tom3" , 50);


        Set stus = new TreeSet();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        System.out.println(stus);


    }



}
