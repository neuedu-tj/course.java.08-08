package collection.list;

import collection.support.Stu;

import java.util.*;

public class TestCase6 {


    /***
     *
     *   List 依然也可以像 set 一样进行 自定义内容的排序
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Stu s1 = new Stu(1,"tom1" , 80);
        Stu s2 = new Stu(2,"tom2" , 70);
        Stu s3 = new Stu(3,"tom4" , 90);
        Stu s4 = new Stu(4,"tom3" , 50);


        List<Stu> stus = new ArrayList();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        Collections.sort(stus);  // list 不具备发现排序的潜质 , 但可以借外界力量来进行加工 .


        System.out.println(stus);
    }
}
