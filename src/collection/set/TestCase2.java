package collection.set;

import collection.support.Stu;

import java.util.HashSet;
import java.util.Set;

public class TestCase2 {

    /***
     *
     *    hashcode (效率高)先判断 ,  如果不相等  在去 看 equals
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        Stu s1 = new Stu(1,"tom");
        Stu s2 = new Stu(1,"tom");


        Set stus = new HashSet();
        stus.add(s1);
        stus.add(s2);

        System.out.println(stus);


    }



}
